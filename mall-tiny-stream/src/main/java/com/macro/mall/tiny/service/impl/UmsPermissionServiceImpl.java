package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.dto.UmsPermissionNode;
import com.macro.mall.tiny.mbg.mapper.UmsPermissionMapper;
import com.macro.mall.tiny.mbg.model.UmsPermission;
import com.macro.mall.tiny.mbg.model.UmsPermissionExample;
import com.macro.mall.tiny.service.UmsPermissionService;
import net.sf.jsqlparser.statement.create.table.ColDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yangyl
 * @Date: 2019/9/24 17:12
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());
    
    @Autowired
    private UmsPermissionMapper permissionMapper;
    
    @Override
    public List<UmsPermissionNode> treeList() {
        List<UmsPermission> permissionList = permissionMapper.selectByExample(new UmsPermissionExample());
        List<UmsPermissionNode> result = permissionList.stream()
                .filter(permission -> permission.getPid().equals(0L))
                .map(permission -> convert(permission, permissionList))
                .collect(Collectors.toList());
        return result;
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     * @param permission
     * @param permissionList
     * @return 筛选出 permissionList 中 permission 的所有孩子
     */
    private UmsPermissionNode convert(UmsPermission permission, List<UmsPermission> permissionList){
        UmsPermissionNode node = new UmsPermissionNode();
        BeanUtils.copyProperties(permission, node);
        List<UmsPermissionNode> children = permissionList.stream()
                .filter(subPermission -> subPermission.getPid().equals(permission.getId()))
                .map(subPermission -> convert(subPermission, permissionList))
                .collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
    
    @Override
    public void streamTest() {
        List<UmsPermission> permissionList = permissionMapper.selectByExample(new UmsPermissionExample());
        // filter : 获取权限类型为目录的权限
        List<UmsPermission> dirList = permissionList.stream()
                .filter(permission -> permission.getType() == 0)
                .collect(Collectors.toList());
        LOGGER.info("filter:{}", dirList);
        
        // map : 获取所有权限的 id
        List<Long> idList = permissionList.stream()
                .map(permission -> permission.getId())
                .collect(Collectors.toList());
        LOGGER.info("map:{}", idList);
        
        // limit : 获取前 5 个权限
        List<UmsPermission> firstFiveList = permissionList.stream()
                .limit(5)
                .collect(Collectors.toList());
        LOGGER.info("limit:{}", firstFiveList);
        
        // count : 获取所有目录权限的个数
        long dirPermissionCount = permissionList.stream()
                .filter(permission -> permission.getType() == 0)
                .count();
        LOGGER.info("count:{}", dirPermissionCount);
        
        // sorted : 将所有权限按照目录、菜单、按钮排序
        List<UmsPermission> sortedList = permissionList.stream()
                .sorted((permission1, permission2) -> {
                    // 实现接口的 compare 方法
                    return permission1.getType().compareTo(permission2.getType());
                })
                .collect(Collectors.toList());
        LOGGER.info("sort:{}", sortedList);
        
        // skip : 跳过前 5 个元素，返回后面的元素
        List<UmsPermission> skipList = permissionList.stream()
                .skip(5)
                .collect(Collectors.toList());
        LOGGER.info("skip:{}", skipList);
        
        // list --> map, 权限列表的 id 为 Key,权限对象为值转换成map
        Map<Long, UmsPermission> permissionMap = permissionList.stream()
                .collect(Collectors.toMap(permission -> permission.getId(), permission -> permission));
        LOGGER.info("list to map:{}", permissionMap);

        // foreach
        permissionList.stream().forEach(permission -> {
            LOGGER.info("foreach:{}", permission);
        });
    }
}

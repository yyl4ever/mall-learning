package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.UmsPermissionNode;

import java.util.List;

/**
 * 后台用户权限管理 Service
 * @Author: yangyl
 * @Date: 2019/9/24 17:10
 */
public interface UmsPermissionService {
    /**
     * 以层级结构返回所有权限
     * @return
     */
    List<UmsPermissionNode> treeList();
    
    void streamTest();
}

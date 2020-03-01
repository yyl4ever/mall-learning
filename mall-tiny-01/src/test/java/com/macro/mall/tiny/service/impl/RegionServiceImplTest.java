package com.macro.mall.tiny.service.impl;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.macro.mall.tiny.mbg.model.RegionDto;
import com.macro.mall.tiny.mbg.model.RegionDtoNode;
import com.macro.mall.tiny.service.IRegionService;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2020-02-26 20:49
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionServiceImplTest {

    @Resource
    private IRegionService regionServiceImpl;

    @Test
    public void listAll() {
        final List<RegionDto> regionDtos = regionServiceImpl.listAll();
        FileUtil.writeUtf8String(JSON.toJSONString(regionDtos), "./regions.txt");
    }

    @Test
    public void listAllProvince() {
        // 针对市辖县的问题，将第三级的市辖县 Level由 3 修改为 2，将 ParentCode 修改为省级
        // 并且删除第二级的市辖县
        // 目前只发现天津有该问题，西藏可能是别的地区
        final List<RegionDtoNode> regionDtoNodes = regionServiceImpl.listAllProvince();
        FileUtil.writeUtf8String(JSON.toJSONString(regionDtoNodes), "./region-nodes.txt");

    }
}
package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌管理
 * @Author: yangyl
 * @Date: 2019/8/22 15:24
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);
            
    @Autowired
    private PmsBrandService demoService;
    
    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value="listAll", method = RequestMethod.GET)
    @ResponseBody
    /**
     * 认证与授权，先通过认证，再检查权限
     */
    // 给查询接口添加 pms:brand:read 权限
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }

    @ApiOperation("添加品牌")
    @RequestMapping(value="create", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:create')")
    public CommonResult createBrand(@RequestBody PmsBrand brand) {
        CommonResult commonResult;
        int count = demoService.createBrand(brand);
        if (count ==1) {
            commonResult = CommonResult.success(brand);
            LOGGER.debug("createBrand success:{}", brand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", brand);
        }
        return commonResult;
    }

    // BindingResult 未用到
    @ApiOperation("更新指定id品牌信息")
    @RequestMapping(value="update/{id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:update')")
    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand brandDto, BindingResult result) {
        CommonResult commonResult;
        int count = demoService.updateBrand(id, brandDto);
        if (count ==1) {
            commonResult = CommonResult.success(brandDto);
            LOGGER.debug("updateBrand success:{}", brandDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", brandDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的品牌")
    @RequestMapping(value="delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:delete')")
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        CommonResult commonResult;
        int count = demoService.deleteBrand(id);
        if (count ==1) {
            commonResult = CommonResult.success(null);
            LOGGER.debug("deleteBrand success:{}", id);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("deleteBrand failed:{}", id);
        }
        return commonResult;
    }

    @ApiOperation("分页查询品牌列表")
    @RequestMapping(value="list", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value="pageSize", defaultValue = "3")Integer pageSize) {
        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("获取指定id的品牌详情")
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(demoService.getBrand(id));
    }
}

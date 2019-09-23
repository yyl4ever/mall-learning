package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌管理
 * @Author: yangyl
 * @Date: 2019/8/22 15:24
 */
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);
            
    @Autowired
    private PmsBrandService demoService;
    
    @RequestMapping(value="listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }

    @RequestMapping(value="create", method = RequestMethod.POST)
    @ResponseBody
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

    // result未用到
    @RequestMapping(value="update/{id}", method = RequestMethod.POST)
    @ResponseBody
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

    @RequestMapping(value="delete/{id}", method = RequestMethod.GET)
    @ResponseBody
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

    @RequestMapping(value="list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value="pageSize", defaultValue = "3")Integer pageSize) {
        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(demoService.getBrand(id));
    }
}

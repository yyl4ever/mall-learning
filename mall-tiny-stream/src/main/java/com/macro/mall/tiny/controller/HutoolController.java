package com.macro.mall.tiny.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2019/9/20 13:52
 */
@Api(tags = "HutoolController", description = "Hutool工具类测试")
@RestController
@RequestMapping("/hutool")
public class HutoolController {
    private static Logger LOGGER = LoggerFactory.getLogger(HutoolController.class);
    
    @ApiOperation("CaptchaUtil 使用：图形验证码")
    @GetMapping("/captchaUtil")
    public void captchaUtil(HttpServletRequest request, HttpServletResponse response) {
        // 生成验证码图片
        // 工厂方法
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        request.getSession().setAttribute("CAPTCHA_KEY", lineCaptcha.getCode());
        // 告诉浏览器输出内容为图片
        response.setContentType("image/png");
        // 禁止浏览器缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        try {
            lineCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // TODO postMan test
    @ApiOperation("SecureUtil:加密解密工具类")
    @GetMapping("/secureUtil")
    public CommonResult secureUtil() {
        // MD5 加密
        String str = "12356";
        String md5Str = SecureUtil.md5(str);
        LOGGER.info("secureUtil md5:{}", md5Str);
        return CommonResult.success(null, "操作成功");
    }
    
    @ApiOperation("JsonUtil使用：JSON解析工具类")
    @GetMapping("/jsonUtil")
    public CommonResult jsonUtil() {
        PmsBrand brand = new PmsBrand();
        brand.setId(1L);
        brand.setName("小米");
        brand.setShowStatus(1);
        // 对象转化为json字符串
        String jsonStr = JSONUtil.parse(brand).toString();
        LOGGER.info("jsonUtil obj2json:{}", jsonStr);
        
        // json 字符串转化为对象
        PmsBrand brandBean = JSONUtil.toBean(jsonStr, PmsBrand.class);
        LOGGER.info("jsonUtil toBean:{}", brandBean);

        List<PmsBrand> brands = new ArrayList<>();
        brands.add(brand);
        String jsonListStr = JSONUtil.parse(brands).toString();
        // list --> json
        LOGGER.info("jsonUtil list2json:{}", jsonListStr);
        
        // json --> lists
        brands = JSONUtil.toList(new JSONArray(jsonListStr), PmsBrand.class);
        LOGGER.info("jsonUtil json2List:{}", brands);
        return CommonResult.success(null, "操作成功");
    }
    
    // TODO 注解
    
}

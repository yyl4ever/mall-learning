package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 会员登录注册管理Controller
 * @Author: yangyl
 * @Date: 2019/8/23 16:31
 */
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@Controller
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;
    
    @ApiOperation("获取验证码")
    @RequestMapping(value="/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return umsMemberService.generateAuthCode(telephone);
    }
    
    @ApiOperation("校对验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return umsMemberService.verifyAuthCode(telephone, authCode);
    }
}

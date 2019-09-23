package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.OssCallbackResult;
import com.macro.mall.tiny.dto.OssPolicyResult;
import com.macro.mall.tiny.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * oss 相关操作接口
 * 前端先调用 /policy，返回策略；然后再上传文件+策略，oss 调用回调接口返回前端，这是同步的动作。
 * @Author: yangyl
 * @Date: 2019/9/23 14:15
 */
@Controller
@Api(tags = "OssController", description = "oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {

    @Autowired
    private OssService ossService;

    @ApiOperation(value = "oss 上传签名生成")
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OssPolicyResult> policy() {
        OssPolicyResult policy = ossService.policy();
        return CommonResult.success(policy);
    }

    @ApiOperation(value = "oss 上传成功回调")
    @RequestMapping(value = "callback", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
        OssCallbackResult callback = ossService.callback(request);
        return CommonResult.success(callback);
    }
}

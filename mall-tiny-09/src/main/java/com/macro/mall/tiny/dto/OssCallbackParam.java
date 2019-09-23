package com.macro.mall.tiny.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 上传OSS成功后，根据该配置来回调对应接口
 * @Author: yangyl
 * @Date: 2019/9/23 14:12
 */
public class OssCallbackParam {
    @ApiModelProperty("请求回调地址")
    private String callbackUrl;
    
    @ApiModelProperty("回调时传入的请求参数")
    private String callbackBody;
    
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}

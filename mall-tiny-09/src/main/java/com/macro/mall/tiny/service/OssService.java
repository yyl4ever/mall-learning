package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.OssCallbackResult;
import com.macro.mall.tiny.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss 上传管理Service
 * @Author: yangyl
 * @Date: 2019/9/23 14:17
 */
public interface OssService {
    /**
     * oss 上传策略生成
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss 上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);
}

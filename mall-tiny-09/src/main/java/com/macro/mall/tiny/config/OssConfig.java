package com.macro.mall.tiny.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 连接 oss 的客户端
 * @Author: yangyl
 * @Date: 2019/9/23 14:02
 */
@Configuration
public class OssConfig {
    
    @Value("${aliyun.oss.endpoint}")
    private String  ALIYUN_OSS_ENDPOINT;

    @Value("${aliyun.oss.accessKeyId}")
    private String  ALIYUN_OSS_ACCESSKEYID;

    @Value("${aliyun.oss.accessKeySecret}")
    private String  ALIYUN_OSS_ACCESSKEYSECRET;
    
    @Bean
    public OSSClient ossClient() {
        return new OSSClient(ALIYUN_OSS_ENDPOINT, ALIYUN_OSS_ACCESSKEYID, ALIYUN_OSS_ACCESSKEYSECRET);
    }
}

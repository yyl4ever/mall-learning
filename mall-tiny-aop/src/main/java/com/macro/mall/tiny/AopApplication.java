package com.macro.mall.tiny;

import com.macro.mall.tiny.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: yangyl
 * @Date: 2019/10/28 15:38
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class AopApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AopApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.work();
    }
}

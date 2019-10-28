package com.macro.mall.tiny.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: yangyl
 * @Date: 2019/10/28 15:34
 */
@Component
@Aspect
public class UserServiceAspect {
    
    @Before("execution(* com.macro.mall.tiny.service.UserService.work(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("UserServiceAspect.... ()");
    }
    
}

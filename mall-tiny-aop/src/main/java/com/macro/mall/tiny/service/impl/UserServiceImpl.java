package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: yangyl
 * @Date: 2019/10/28 15:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void work() {
        System.out.println("开始干活...coding...");
    }
}

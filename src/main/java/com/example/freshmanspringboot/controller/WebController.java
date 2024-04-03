/**
 * 機能：
 * 作成者：kaise
 * 期日：2023/11/21 11:45
 */

package com.example.freshmanspringboot.controller;

import com.example.freshmanspringboot.common.Result;
import com.example.freshmanspringboot.entity.User;
import com.example.freshmanspringboot.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class WebController {

    @Resource
    UserService userService;

    @GetMapping("/")
    public Result hello() {
        return Result.success("success");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return Result.error("数据输入不合法");
        }
        user = userService.login(user);
        return Result.success(user);
    }



}

package com.she.springbootdemo.controller;

import com.she.springbootdemo.domain.AppInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/app")
    public AppInfo appInfo() {
        AppInfo appInfo = new AppInfo(0, "https://www.baidu.com");
        return appInfo;
    }
}

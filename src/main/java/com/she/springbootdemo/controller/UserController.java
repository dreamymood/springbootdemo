package com.she.springbootdemo.controller;

import com.she.springbootdemo.bean.App;
import com.she.springbootdemo.bean.AppState;
import com.she.springbootdemo.domain.AppInfo;
import com.she.springbootdemo.service.AppService;
import com.she.springbootdemo.service.AppStateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app")
public class UserController {
    @Resource
    private AppService appService;

    @Resource
    private AppStateService appStateService;

    @RequestMapping("/json")
    public AppInfo appInfo() {
        AppInfo appInfo = new AppInfo(0, "https://www.baidu.com");
        return appInfo;
    }

    @RequestMapping("/insertApp")
    public String insertApp(App app) {
        return "插入数据["+appService.insertApp(app)+"]条";
    }

    @RequestMapping("/selectApp")
    public App selectApp() {
        return appService.selectByMaxId();
    }

    @RequestMapping("/selectAppChange")
    public AppState selectAppChange() {
        return appStateService.selectAppChange();
    }

    @RequestMapping("/updateChange")
    public void update(AppState appState) {
        appStateService.update(appState);
    }
}

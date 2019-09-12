package com.she.springbootdemo.service;

import com.she.springbootdemo.bean.App;
import com.she.springbootdemo.bean.AppState;
import com.she.springbootdemo.repository.AppRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppService {
    @Resource
    private AppRepository appRepository;

    public int insertApp(App app) {
        return appRepository.insertApp(app);
    }

    public App selectByMaxId() {
        return appRepository.selectByMaxId();
    }
}

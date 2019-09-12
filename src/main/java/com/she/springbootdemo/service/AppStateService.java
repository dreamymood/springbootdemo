package com.she.springbootdemo.service;

import com.she.springbootdemo.bean.AppState;
import com.she.springbootdemo.repository.AppStateRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppStateService {
    @Resource
    private AppStateRepository appStateRepository;

    public AppState selectAppChange() {
        return appStateRepository.selectAppChange();
    }

    public void update(AppState appState) {
        appStateRepository.update(appState);
    }
}

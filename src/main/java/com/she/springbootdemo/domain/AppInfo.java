package com.she.springbootdemo.domain;

import java.io.Serializable;

public class AppInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer appState;
    private String linkUrl;

    public AppInfo(Integer appState, String linkUrl) {
        this.appState = appState;
        this.linkUrl = linkUrl;
    }

    public Integer getAppState() {
        return appState;
    }

    public void setAppState(Integer appState) {
        this.appState = appState;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}

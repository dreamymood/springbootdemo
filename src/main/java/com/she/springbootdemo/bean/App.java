package com.she.springbootdemo.bean;

import java.io.Serializable;

public class App implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String linkUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}

package com.she.springbootdemo.bean;

import java.io.Serializable;

public class AppState implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int open;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }
}

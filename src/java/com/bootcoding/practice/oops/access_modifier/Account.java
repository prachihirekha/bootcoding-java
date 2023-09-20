package com.bootcoding.practice.oops.access_modifier;

public class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

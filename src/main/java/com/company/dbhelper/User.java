package com.company.dbhelper;

public enum User {
    USERNAME("sql11431981"),
    PASSWORD("JTuXm8DJGx");

    private String value;

    User(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

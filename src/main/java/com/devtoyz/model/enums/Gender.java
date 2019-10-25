package com.devtoyz.model.enums;

/**
 * @author Hongyi Zheng
 * @date 2019/10/25
 */
public enum Gender {

    FAMALE(1, "女"),
    MALE(2, "男"),
    PRIVATE(3, "保密");

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    Gender(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}

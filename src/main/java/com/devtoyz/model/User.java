package com.devtoyz.model;

/**
 * @author Hongyi Zheng
 * @date 2019/10/25
 */
public class User {

    private long uid;
    private String username;
    private String password;
    private Integer gender;

    public User(long uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public User(long uid, String username, String password, Integer gender) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}

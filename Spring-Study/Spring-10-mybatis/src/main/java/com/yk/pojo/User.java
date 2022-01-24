package com.yk.pojo;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String password;
    private String name;
    private String birthday;
    private String sex;
    private String role;
    private String address;
}
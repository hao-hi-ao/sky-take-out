package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {
    // 员工id
    private Long id;
    // 用户名
    private String username;
    // 姓名
    private String name;
    // 手机号
    private String phone;
    // 性别
    private String sex;
    // 身份证
    private String idNumber;
}

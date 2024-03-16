package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 员工
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // 员工id
    private Long id;
    // 用户名
    private String username;
    // 姓名
    private String name;
    // 密码
    private String password;
    // 手机号
    private String phone;
    // 性别
    private String sex;
    // 身份证号码
    private String idNumber;
    // 状态 0：禁用 1：启用
    private Integer status;
    // 创建时间
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    // 最后更新时间
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
    // 创建者
    private Long createUser;
    // 最后更新者
    private Long updateUser;
}

package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {
    // 员工id
    @ApiModelProperty("主键值")
    private Long id;
    // 用户名
    @ApiModelProperty("用户名")
    private String userName;
    // 姓名
    @ApiModelProperty("姓名")
    private String name;
    // jwt令牌
    @ApiModelProperty("jwt令牌")
    private String token;
}

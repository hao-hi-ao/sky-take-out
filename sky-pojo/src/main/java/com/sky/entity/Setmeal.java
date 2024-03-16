package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 套餐
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Setmeal implements Serializable {
    private static final long serialVersionUID = 1L;

    // 套餐id
    private Long id;
    // 分类id
    private Long categoryId;
    // 套餐名称
    private String name;
    // 套餐价格
    private BigDecimal price;
    // 状态 0:停用 1:启用
    private Integer status;
    // 描述信息
    private String description;
    // 图片
    private String image;
    // 创建时间
    private LocalDateTime createTime;
    // 最后更新时间
    private LocalDateTime updateTime;
    // 创建者
    private Long createUser;
    // 最后更新者
    private Long updateUser;
}

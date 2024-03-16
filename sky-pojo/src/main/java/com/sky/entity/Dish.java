package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 菜品
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish implements Serializable {
    private static final long serialVersionUID = 1L;

    // 菜品id
    private Long id;
    //菜品名称
    private String name;
    // 菜品分类id
    private Long categoryId;
    // 菜品价格
    private BigDecimal price;
    // 图片
    private String image;
    // 描述信息
    private String description;
    // 0 停售 1 起售
    private Integer status;
    // 创建时间
    private LocalDateTime createTime;
    // 最后更新时间
    private LocalDateTime updateTime;
    // 创建者
    private Long createUser;
    // 最后更新者
    private Long updateUser;
}

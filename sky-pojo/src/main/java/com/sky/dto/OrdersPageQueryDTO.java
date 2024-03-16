package com.sky.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class OrdersPageQueryDTO implements Serializable {
    // 页码
    private int page;
    // 每页记录数
    private int pageSize;
    // 订单号
    private String number;
    // 手机号
    private  String phone;
    // 订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
    private Integer status;
    // 订单查询的开始时间（包括）
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime beginTime;
    // 订单查询的结束时间（包括）
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    // 用户id
    private Long userId;
}

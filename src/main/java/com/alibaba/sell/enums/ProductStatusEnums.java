package com.alibaba.sell.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnums {
    UP(0,"上架"),
    DOWN(1,"下架"),
    ;
    private Integer status;
    private String  description;

    ProductStatusEnums(Integer status, String description) {
        this.status = status;
        this.description = description;
    }
}

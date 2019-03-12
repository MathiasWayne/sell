package com.alibaba.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author:zhangl
 * @date:2019/3/11
 * @description: 产品信息类
 */
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    /**商品名称*/
    private String productName;
    /**商品单价*/
    private BigDecimal productPrice;
    /**商品库存*/
    private Integer productStock;
    /**商品描述*/
    private String productDescription;
    /**商品小图*/
    private String productIcon;
    /**商品状态,0正常1下架*/
    private Integer  productStatus;
    /**商品类目*/
    private Integer categoryType;

}

package com.alibaba.sell.service;

import com.alibaba.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Lenovo
 */
public interface ProductInfoService {

    /**根据id查询单个商品*/
    ProductInfo findOne(String pId);
    /**查询所有在架的商品*/
    List<ProductInfo> findUpAll();
    /**查询所有商品*/
    Page<ProductInfo> findAll(Pageable pageable);
    /**保存所有商品*/
    ProductInfo save(ProductInfo productInfo);
    /**添加库存*/

    /**减少库存*/
}

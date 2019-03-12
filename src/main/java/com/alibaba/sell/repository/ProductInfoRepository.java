package com.alibaba.sell.repository;

import com.alibaba.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhangxx
 *
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    /**根据商品的状态查询商品*/
    List<ProductInfo> findByProductStatus(Integer status);

}

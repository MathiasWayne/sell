package com.alibaba.sell.service.Impl;

import com.alibaba.sell.dataobject.ProductInfo;
import com.alibaba.sell.repository.ProductInfoRepository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author:zhangl
 * @date:2019/3/11
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository info;

    @Test
    public  void testSave(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCategoryType(3);
        productInfo.setProductDescription("非常好用");
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setProductId("123321");
        productInfo.setProductPrice(new BigDecimal(333));
        productInfo.setProductName("飞机杯");
        productInfo.setProductStatus(0);
        productInfo.setProductStock(100);
        ProductInfo save = info.save(productInfo);
        Assert.assertNotNull(save);
    }
    @Test
    public void testFindByProductStatus(){
        List<ProductInfo> byProductStatus = info.findByProductStatus(0);
        Assert.assertNotEquals(0,byProductStatus.size());
    }
}

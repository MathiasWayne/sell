package com.alibaba.sell.service.Impl;

import com.alibaba.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() {
        ProductInfo one = productInfoService.findOne("123321");
        Assert.assertEquals("123321",one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productInfoService.findUpAll();
        Assert.assertNotNull(upAll);
    }

    @Test
    public void findAll() {
        PageRequest page=new PageRequest(0,1);
        Page<ProductInfo> all = productInfoService.findAll(page);
        System.out.println(all.getTotalPages());
        Assert.assertNotNull(all);
    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCategoryType(3);
        productInfo.setProductDescription("超级棒");
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setProductId("321");
        productInfo.setProductPrice(new BigDecimal(323));
        productInfo.setProductName("振动棒");
        productInfo.setProductStatus(0);
        productInfo.setProductStock(99);
        ProductInfo save = productInfoService.save(productInfo);
        Assert.assertNotNull(save);
    }
}
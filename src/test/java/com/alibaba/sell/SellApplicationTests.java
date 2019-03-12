package com.alibaba.sell;

import com.alibaba.sell.dataobject.ProductCategory;
import com.alibaba.sell.repository.ProductoryCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellApplicationTests {
   @Autowired
    private ProductoryCategoryRepository jpa;
    @Test
    public void contextLoads() {
        ProductCategory product=new ProductCategory();
        product.setCategoryName("生活用品");
        product.setCategoryType(1);
        jpa.save(product);
    }
    @Test
    public void findOne(){
        List<ProductCategory> all = jpa.findAll();
        for (ProductCategory productCategory : all) {
            log.info(productCategory.getCategoryName());
        }
    }

}

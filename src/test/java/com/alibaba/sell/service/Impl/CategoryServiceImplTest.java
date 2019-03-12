package com.alibaba.sell.service.Impl;


import com.alibaba.sell.dataobject.ProductCategory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest

public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl impl;

    @Test
    public void findOne() {
        ProductCategory one = impl.findOne(1);
        System.out.println(one.getCategoryName());
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = impl.findAll();
        for (ProductCategory category : all) {
            System.out.println(category);
        }
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<ProductCategory> byCategoryTypeIn = impl.findByCategoryTypeIn(integers);
        for (ProductCategory category : byCategoryTypeIn) {
            System.out.println(category);

        }
    }

    @Test
    public void save() {
        ProductCategory category=new ProductCategory();
        category.setCategoryType(3);
        category.setCategoryName("情趣用品");
        ProductCategory save = impl.save(category);
        Assert.assertNotNull(save);
    }
}
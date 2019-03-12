package com.alibaba.sell.service;

import com.alibaba.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdList);
    ProductCategory save(ProductCategory productCategory);
}

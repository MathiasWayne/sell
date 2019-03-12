package com.alibaba.sell.service.Impl;

import com.alibaba.sell.dataobject.ProductCategory;
import com.alibaba.sell.repository.ProductoryCategoryRepository;
import com.alibaba.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zhangl
 * @date:2019/3/11
 * @description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductoryCategoryRepository repository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdList) {
        return repository.findByCategoryTypeIn(categoryIdList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}

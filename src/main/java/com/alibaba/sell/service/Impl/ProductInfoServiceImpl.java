package com.alibaba.sell.service.Impl;

import com.alibaba.sell.dataobject.ProductInfo;
import com.alibaba.sell.enums.ProductStatusEnums;
import com.alibaba.sell.repository.ProductInfoRepository;
import com.alibaba.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zhangl
 * @date:2019/3/12
 * @description:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
 @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo findOne(String pId) {
        return productInfoRepository.findOne(pId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnums.UP.getStatus());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }
}

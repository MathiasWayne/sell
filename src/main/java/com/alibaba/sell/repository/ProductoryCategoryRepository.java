package com.alibaba.sell.repository;

import com.alibaba.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:zhangl
 * @date:2019/3/11
 * @description:
 */
public interface ProductoryCategoryRepository  extends JpaRepository<ProductCategory,Integer> {
  List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
}

package com.flower.dao;

import com.flower.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface ProductDao {
    List<Product> findProductAll();

    List<Product> findProductByCondition(Map map);

    List<Product> findProductByIds(List list);

    Product findProductById(@Param("productId") Integer productId);

    int insertProduct(Map map);

    int insertProducts(List<Product> Products);

    int updateProduct(Map map);

    int updateProducts(List<Product> Products);

    int deleteProductById(int id);

    int deleteProductByIds(List ids);
}

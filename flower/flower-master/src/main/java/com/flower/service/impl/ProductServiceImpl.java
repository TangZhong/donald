package com.flower.service.impl;

import com.flower.bean.Product;
import com.flower.dao.ProductDao;
import com.flower.dto.ResponseDto;
import com.flower.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public ResponseDto searchByWord(String word) {
        Map map = new HashMap();
        map.put("name", word);
        List<Product> products = productDao.findProductByCondition(map);
//        map.put("extra",word);
//        map.put("")
        return new ResponseDto("200","",products);
    }

    @Override
    public ResponseDto searchByType(String type) {
        List<Product> products;
        //如果type为空，则默认查找所有商品
        if (type==null || type.equals("") || type.equals("0")){
            products = productDao.findProductAll();
        }else {
            Map map = new HashMap();
            map.put("type", type);
            products = productDao.findProductByCondition(map);
        }
        return new ResponseDto("200","",products);
    }

    @Override
    public ResponseDto findOne(int id) {
        List list = new ArrayList();
        list.add(id);
        List<Product> products = productDao.findProductByIds(list);
        return new ResponseDto("200","",products);
    }
}

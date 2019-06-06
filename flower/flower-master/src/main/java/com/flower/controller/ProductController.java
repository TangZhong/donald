package com.flower.controller;

import com.flower.dto.ResponseDto;
import com.flower.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    /**
     * 根据关键字查找商品
     * @param key
     * @return 返回封装了
     */
    @RequestMapping(value = "/product/search")
    public ResponseDto searchByWord(String key){
        //判断传输的关键字是否为空
        if (!StringUtils.isEmpty(key)){
            return productService.searchByWord(key);
        }
        return new ResponseDto("200","搜索关键字不能为空");
    }

    /**
     * 根据商品类型查找商品
     * @param type
     * @return
     */
    @RequestMapping(value = "/product/type")
    public ResponseDto searchByType(String type){
        //判断传输的关键字是否为空
        if (!StringUtils.isEmpty(type)){
            return productService.searchByType(type);
        }
        return new ResponseDto("200","类型不能为空");
    }

    /**
     * 查找单个商品的详细
     * @param id
     * @return
     */
    @RequestMapping(value = "/product/detail")
    public ResponseDto getOne(int id){
        if (id!=0){
            return productService.findOne(id);
        }
        return new ResponseDto("200","id不能为0");
    }
}

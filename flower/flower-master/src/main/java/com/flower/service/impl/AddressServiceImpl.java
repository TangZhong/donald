package com.flower.service.impl;

import com.flower.bean.Address;
import com.flower.dao.AddressDao;
import com.flower.dto.ResponseDto;
import com.flower.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Equator on 2019/5/27
 **/

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    @Transactional
    public ResponseDto addAddress(Address address) {
        Map map = new HashMap();
        map.put("userId",address.getUserId());
        map.put("name",address.getName());
        map.put("phone",address.getPhone());
        map.put("isDefault",address.getIsDefault());
        map.put("province",address.getProvince());
        map.put("city",address.getCity());
        map.put("area",address.getArea());
        map.put("detail",address.getDetail());
        if (address.getIsDefault()==1){
            //默认地址，将其它改为非默认
            Map queryMap = new HashMap();
            queryMap.put("userId",address.getUserId());
            queryMap.put("isDefault",1);
            addressDao.findAddressByCondition(queryMap).forEach(a->{
                Map temp = new HashMap();
                temp.put("id",a.getId());
                temp.put("isDefault",2);
                addressDao.updateAddress(temp);
            });
        }
        if (addressDao.insertAddress(map)>0){
            return new ResponseDto("200","地址添加成功",null);
        }else {
            return new ResponseDto("500","地址添加失败",null);
        }
    }

    @Override
    public ResponseDto removeAddress(Integer addressId) {
        if (addressDao.deleteAddressById(addressId)>0){
            return new ResponseDto("200","地址删除成功",null);
        }else {
            return new ResponseDto("500","地址删除失败",null);
        }
    }

    @Override
    public ResponseDto updateAddress(Address address) {
        Map map = new HashMap();
        map.put("id",address.getId());
        map.put("userId",address.getUserId());
        map.put("name",address.getName());
        map.put("phone",address.getPhone());
        map.put("isDefault",address.getIsDefault());
        map.put("province",address.getProvince());
        map.put("city",address.getCity());
        map.put("area",address.getArea());
        map.put("detail",address.getDetail());
        if (addressDao.updateAddress(map)>0){
            return new ResponseDto("200","地址更新成功",null);
        }else {
            return new ResponseDto("500","地址更新失败",null);
        }
    }

    @Override
    public ResponseDto getAddressByUserId(Integer userId) {
        Map map = new HashMap();
        map.put("userId",userId);
        return new ResponseDto("200","获取成功",addressDao.findAddressByCondition(map));
    }
}

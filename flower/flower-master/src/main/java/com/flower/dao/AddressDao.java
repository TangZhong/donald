package com.flower.dao;

import com.flower.bean.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface AddressDao {
    List<Address> findAddressAll();

    List<Address> findAddressByCondition(Map map);

    List<Address> findAddressByIds(List list);

    int insertAddress(Map map);

    int insertAddresss(List<Address> Addresss);

    int updateAddress(Map map);

    int updateAddresss(List<Address> Addresss);

    int deleteAddressById(int id);

    int deleteAddressByIds(List ids);
}

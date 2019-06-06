package com.flower.service;

import com.flower.bean.Address;
import com.flower.dto.ResponseDto;
import org.springframework.stereotype.Service;

public interface AddressService {
    ResponseDto addAddress(Address address);
    ResponseDto removeAddress(Integer addressId);
    ResponseDto updateAddress(Address address);
    ResponseDto getAddressByUserId(Integer userId);
}

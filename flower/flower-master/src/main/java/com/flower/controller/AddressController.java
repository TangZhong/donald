package com.flower.controller;

import com.flower.bean.Address;
import com.flower.dto.ResponseDto;
import com.flower.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Equator on 2019/5/27
 **/
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressServiceImpl addressService;

    @RequestMapping("/addAddress")
    public ResponseDto addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @RequestMapping("/deleteAddress")
    public ResponseDto deleteAddress(@RequestBody Address address){
        return addressService.removeAddress(address.getId());
    }

    @RequestMapping("/updateAddress")
    public ResponseDto updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    @RequestMapping("/getAddress")
    public ResponseDto getAddress(@RequestBody Address address){
        return addressService.getAddressByUserId(address.getUserId());
    }
}

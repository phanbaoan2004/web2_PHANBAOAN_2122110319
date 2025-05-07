package com.example.phanbaoan.service;

import java.util.List;

import com.example.phanbaoan.entity.Address;
import com.example.phanbaoan.payloads.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO);

    List<AddressDTO> getAddresses();

    AddressDTO getAddress(Long addressId);

    AddressDTO updateAddress(Long addressId, Address address);

    String deleteAddress(Long addressId);
}
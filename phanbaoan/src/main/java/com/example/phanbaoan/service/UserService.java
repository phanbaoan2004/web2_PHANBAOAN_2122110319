package com.example.phanbaoan.service;
import com.example.phanbaoan.payloads.UserDTO;
import com.example.phanbaoan.payloads.UserResponse;
public interface UserService {
  UserDTO registerUser(UserDTO userDTO);

  UserResponse getAllUsers(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

  UserDTO getUserById(Long userId);

  UserDTO updateUser(Long userId, UserDTO userDTO);

  String deleteUser(Long userId);

UserDTO getUserByEmail(String email);
}
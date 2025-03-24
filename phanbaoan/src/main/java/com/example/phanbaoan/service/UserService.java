package com.example.phanbaoan.service;

import com.example.phanbaoan.entity.User;
import com.example.phanbaoan.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lấy tất cả người dùng
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Thêm người dùng mới
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Lấy người dùng theo ID
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    // Xóa người dùng theo ID
    public boolean deleteUserById(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true; 
        }
        return false; 
    }

    // Cập nhật người dùng
    public User updateUser(int id, User newUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(newUser.getName());
            user.setRole(newUser.getRole());
            user.setPhone(newUser.getPhone());
            user.setAddress(newUser.getAddress());
            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            return userRepository.save(user);
        }).orElse(null);
    }
}

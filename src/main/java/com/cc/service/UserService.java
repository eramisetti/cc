package com.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.aspect.Loggable;
import com.cc.data.entity.User;
import com.cc.data.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Loggable
    public List<User> getAll(){
        return (List<User>) this.userRepository.findAll();
    }

    @Loggable
    public User findOne(Long id){
        return this.userRepository.findOne(id);
    }
    
    @Loggable
    public User save(User user) {
    	return userRepository.save(user);
    }
}

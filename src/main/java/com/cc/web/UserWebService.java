package com.cc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.data.entity.User;
import com.cc.service.UserService;

@RestController
public class UserWebService {

    @Autowired
    private UserService userService;

    @GetMapping("/cc/login")
    public String login(){
        return null;
    }
    
    @GetMapping("/cc/user")
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("/cc/user/{id}")
    public User getOne(@PathVariable("id")Long id){
        return this.userService.findOne(id);
    }
    
    /* TODO: stop user to update the user. As of now user can update user with same method.*/
    @PostMapping("/cc/user")
    User creatUser(@RequestBody User user) {
		return userService.save(user);
	}
    
    /* TODO: stop user to update the user. As of now user can update user with same method.*/
    @PutMapping("/cc/user")
    User updateUser(@RequestBody User user) {
		return userService.save(user);
	}

}

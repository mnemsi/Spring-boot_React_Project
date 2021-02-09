package com.Mejdeddine.Springbootbackend.controller;


import com.Mejdeddine.Springbootbackend.model.User;
import com.Mejdeddine.Springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

   @GetMapping({"/users","/Users","/USERS"})
  //@GetMapping("users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

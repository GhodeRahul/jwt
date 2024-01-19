package com.jwtexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtexample.entity.User;
import com.jwtexample.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	UserService userService ;
  
	//http://localhost:8080/home/users
	
	@GetMapping("/users")
	 public List<User> getUser() {
		 
		System.out.println("getting users");
		 
		 
		 return userService.getUser();
	 }
}
 
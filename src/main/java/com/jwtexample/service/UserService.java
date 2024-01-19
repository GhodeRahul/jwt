package com.jwtexample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtexample.entity.User;
@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	  public UserService() {
		  
		  
		   store.add(new User(UUID.randomUUID().toString(),"rahul","rahul@gmail.com"));
		   store.add(new User(UUID.randomUUID().toString(),"amul","amul@gmail.com"));
		   store.add(new User(UUID.randomUUID().toString(),"akash","akash@gmail.com"));
		   store.add(new User(UUID.randomUUID().toString(),"yogesh","yogesh@gmail.com"));
		  
	  }
	
	   public List<User> getUser(){
		   
		   return this.store;
	   }
	
}

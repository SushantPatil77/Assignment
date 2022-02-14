package com.example.demo.services;

import java.util.List;


import com.example.demo.Model.User;
public interface UserService {
	 public User saveUser(User user);
	    public List<User> listUser();
	    public User updateUser(User user);
	    public String deleteUser(User user);
}

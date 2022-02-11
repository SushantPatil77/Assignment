package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.services.UserService;


@Service
public class UserServiceImpl implements UserService {
 @Autowired
  private UserRepo userRepo;
	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public List<User> listUser() {
		
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}



}

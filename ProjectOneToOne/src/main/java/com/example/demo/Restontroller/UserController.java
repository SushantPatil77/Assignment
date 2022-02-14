package com.example.demo.Restontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.services.UserService;
import com.example.demo.servicesImp.UserServiceImpl;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceI;
	
	@RequestMapping("m")
	public String add()
	{
		return"Welcome to Spring";
	}
	@PostMapping("save")
    public User saveUser(@RequestBody User user) {
        return userServiceI.saveUser(user);
    }
	@GetMapping("Read")
    public List<User> findUser() {
        return userServiceI.listUser();
    }
	
	
	

}

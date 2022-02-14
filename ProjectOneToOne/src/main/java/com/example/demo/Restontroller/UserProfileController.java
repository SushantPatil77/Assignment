package com.example.demo.Restontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.UserProfile;
import com.example.demo.services.UserProfileService;
import com.example.demo.servicesImp.UserProfileServiceImpl;

@RestController
@RequestMapping("UserProfile")
public class UserProfileController {
	
	@Autowired 
	UserProfileServiceImpl userProfileServiceI;
	@PostMapping("save")
    public UserProfile saveUserProfile(@RequestBody UserProfile userProfile) {
        return userProfileServiceI.saveUserProfile(userProfile);
    }
	@GetMapping("Read")
    public List<UserProfile> findUser() {
        return userProfileServiceI.listUserProfile();
    }
	

}

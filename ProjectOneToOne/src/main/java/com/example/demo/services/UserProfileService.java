package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.UserProfile;

public interface UserProfileService {
	 public UserProfile saveUserProfile(UserProfile userProfile);
	    public List<UserProfile> listUserProfile();
	    public UserProfile updateUserProfile(UserProfile userProfile);
	    public String deleteUserProfile(UserProfile userProfile);

}
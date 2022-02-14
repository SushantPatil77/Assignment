package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserProfile;
import com.example.demo.Repo.UserProfileRepo;
import com.example.demo.services.UserProfileService;
@Service
public class UserProfileServiceImpl implements UserProfileService {
  @Autowired
   UserProfileRepo userProfileRepo;
	@Override
	public UserProfile saveUserProfile(UserProfile userProfile) {
		
		return userProfileRepo.save(userProfile);
	}

	@Override
	public List<UserProfile> listUserProfile() {
		
		return userProfileRepo.findAll();
	}

	@Override
	public UserProfile updateUserProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.example.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserDetails;
import com.example.demo.repo.UserDetailsRepo;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {
	  @Autowired
	    private UserDetailsRepo detailsRepository;

	    @GetMapping("/all")   // http://localhost:8080/user/all
	    public List<UserDetails> getAllUser() {
	        return detailsRepository.findAll();
	    }

	    @PostMapping("/save") // http://localhost:8080/user/save
	    public UserDetails saveUser(@RequestBody UserDetails details) {
	        return detailsRepository.save(details);
	    }

	    @PutMapping("/update") // http://localhost:8080/user/update
	    public UserDetails updateUser(@RequestBody UserDetails details) {
	        return detailsRepository.save(details);
	    }

	    @DeleteMapping("/delete") // http://localhost:8080/user/update
	    public String deleteUser(@RequestBody UserDetails details) {
	        detailsRepository.delete(details);
	        return "Deleted Successfully"+details;
	    }
}

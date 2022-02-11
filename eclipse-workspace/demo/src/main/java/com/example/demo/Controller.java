package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	MyService service;
    @GetMapping("/m")
	public String printMyStsaus() 
	{
		return "I am the king of springboot";
		

	}
    @GetMapping("/m1")
    public String MySerives() 
    {
    	return service.helloMan();
    	
    	
    }
	
}

package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Laptop;
import com.example.demo.repo.LaptopRepository;
import com.example.demo.services.LaptopService;

public class LaptopServiceImpl implements LaptopService {

	   @Autowired
	    private LaptopRepository laptopRepository;
	 
	    @Override
	    public Laptop saveLaptop(Laptop laptop) {
	        // TODO Auto-generated method stub
	        return laptopRepository.save(laptop);
	    }
	 
	    @Override
	    public List<Laptop> listLaptop() {
	        // TODO Auto-generated method stub
	        return laptopRepository.findAll();
	    }
	 
	    @Override
	    public Laptop updateLaptop(Laptop laptop) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public String deleteLaptop(Laptop laptop) {
	        // TODO Auto-generated method stub
	        return null;
	    }

}

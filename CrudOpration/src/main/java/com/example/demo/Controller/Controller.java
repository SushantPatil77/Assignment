package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentRepo.StudentRepo;
import com.example.demo.enitiy.Student;

@RestController
public class Controller 
{
   @Autowired 
   StudentRepo studentrepo;
    @PostMapping("save")
   public String Create(@RequestBody Student student)
   {
	 try {
		studentrepo.save(student);
		return "StudentIsAddSuccefulIn database";
	} catch (Exception e) {
		e.printStackTrace();
		return "Not add a Student in database";
	}
	

   }
   @GetMapping("read")
    public List<Student> Readopration() 
    {
      List<Student>list=studentrepo.findAll();
      return list;

    }
    @RequestMapping("/readBy{id}")
      public Student getbyId(@PathVariable int id)
       {
		try {
			
		    return studentrepo.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
    @DeleteMapping("Delete{id}")
    public String Delete(@PathVariable int id)
    {
		try {
			studentrepo.deleteById(id);
			return "Delete succesful from database";
		} catch (Exception e) 
		{
			e.printStackTrace();
			return "Id Are Not Matched from database ";
		}

	}
    
    @PutMapping("Update{id}")
    
    public List<Student> updateData(@RequestBody Student s,@PathVariable int id) 
    {
		 Student student= studentrepo.findById(id).get();
		  student.setStudentName(s.getStudentName());
		  student.setMark(s.getMark());
		  studentrepo.save(student);
		  return studentrepo.findAll();
	
		 
    }
}

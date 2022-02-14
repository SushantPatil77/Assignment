package com.example.demo.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitiy.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> 
{
    
}

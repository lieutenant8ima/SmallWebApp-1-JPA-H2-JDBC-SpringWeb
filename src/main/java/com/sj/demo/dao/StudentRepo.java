package com.sj.demo.dao;



import org.springframework.data.repository.CrudRepository;

import com.sj.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student,Integer> 
{

	
  
}

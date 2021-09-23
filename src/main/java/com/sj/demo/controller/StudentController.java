package com.sj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sj.demo.dao.StudentRepo;
import com.sj.demo.model.Student;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Student student)
	{
		repo.save(student);
		return "home";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam Integer sid)
	{
		ModelAndView mv = new ModelAndView("showStudent");
		Student student = repo.findById(sid).orElse(new Student());
		repo.save(student);
		mv.addObject(student);
		
		return mv;
	}
	
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam Integer sid)
	{
		ModelAndView mv = new ModelAndView("showStudent");
		Student student = repo.findById(sid).orElse(new Student());
		repo.delete(student);
		mv.addObject(student);
		
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(@RequestParam Integer sid)
	{
		ModelAndView mv = new ModelAndView("update");
		Student student = repo.findById(sid).orElse(new Student());
		repo.delete(student);
		mv.addObject(student);
		
		return mv;
	}




}

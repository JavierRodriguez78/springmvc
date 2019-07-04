package com.geekshubsacademy.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.geekshubsacademy.springmvc.models.User;
import com.geekshubsacademy.springmvc.services.UsersFactoryService;

@Controller
@RequestMapping("/example")
public class ExampleController {

	@Autowired
		private UsersFactoryService usersFactoryService;
	
	
	@GetMapping("")
	public String inicio()
	{
		return "index";
	}
	
	@GetMapping("/view1")
	public ModelAndView view1()
	{
		return new ModelAndView("index");
		
	}
	
	
	
	@GetMapping("/view2")
	public ModelAndView view2()
	{
		ModelAndView mav = new ModelAndView("index2");
		mav.addObject("name","Xavi");
		return mav;
	}
	
	@GetMapping("/user")
	public ModelAndView userView()
	{
		ModelAndView mav = new ModelAndView("user");
		mav.addObject("User", new User("xavi","bragasdeesparto"));
		return mav;
	}
	
	@GetMapping("/users")
	public ModelAndView usersView() {

		ModelAndView mav = new ModelAndView("userslayout");
		mav.addObject("Users",usersFactoryService.getUsers());
		return mav;
	}
	
	
	@GetMapping("/errorin")
	public ModelAndView errorIn() {
		ModelAndView mav = new ModelAndView("userslayout");
		int result=5/0;
		mav.addObject("Users",usersFactoryService.getUsers());
		return mav;
	}
	
	@GetMapping("/request")
	public ModelAndView request(@RequestParam(name="name") String name) {
		ModelAndView mav = new ModelAndView("request");
		mav.addObject("nombre", name);
		return mav;
		
	}
	
	@GetMapping("/request1/{nombre}")
	public ModelAndView request1(@PathVariable("nombre") String name)
	{
		ModelAndView mav = new ModelAndView("request");
		mav.addObject("nombre", name);
		return mav;
	}
}

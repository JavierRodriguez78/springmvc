package com.geekshubsacademy.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.geekshubsacademy.springmvc.components.ExampleComponent;
import com.geekshubsacademy.springmvc.models.User;

@Controller
public class PetitionsController {

	private static final Log logger = LogFactory.getLog("PetitionsController.class");
	
	@Autowired
	@Qualifier("ExampleComponent")
	private ExampleComponent exampleComponent;
	
	@GetMapping("/form")
	public ModelAndView showForm()
	{
		logger.info("Iniciando el formulario");
		exampleComponent.newComponent();
		ModelAndView mv = new ModelAndView("formexample");
		mv.addObject("user", new User());
		return mv;
	}
	
	@PostMapping("/adduser")
	public ModelAndView addUser(@ModelAttribute("user") User user)
	{
		logger.info("El usuario recibido ->"+user);
		ModelAndView mav = new ModelAndView("adduser");
		mav.addObject("user",user);
		return mav;
		
	}
	
	
}

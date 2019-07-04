package com.geekshubsacademy.springmvc.controllers;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.geekshubsacademy.springmvc.domain.services.IUserService;

@Controller
public class DataController {

	private static final Log logger = org.apache.commons.logging.LogFactory.getLog("DataCotroller.class");
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/listarusuarios")
	public ModelAndView listarDatos()
	{
		
		logger.info("Listado usuarios" + userService.findAll());
		ModelAndView mv = new ModelAndView("tabladatos");
		mv.addObject("Users",userService.findAll());
		return mv;
				
	}
	
	@GetMapping("/listarusuario")
	public String listarUsuario()
	{
		
		logger.info("Listado usuarios" + userService.findOne((long)1).toString());
		
		return "null";
				
	}
}

package com.geekshubsacademy.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public ModelAndView showInternalServerError(HttpServletRequest req, Exception ex)
	{
		ModelAndView mav = new ModelAndView("error/500");
		mav.addObject("url", req.getRequestURL());
		mav.addObject("exception", ex);
		
		return mav;
	}
}

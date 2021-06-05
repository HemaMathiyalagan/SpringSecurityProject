package com.hema.springsecurityapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}

}

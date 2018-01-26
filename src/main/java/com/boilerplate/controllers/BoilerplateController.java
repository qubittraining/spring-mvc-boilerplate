package com.boilerplate.controllers;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class BoilerplateController {

	@RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
	public String hello() {
		return "about";
	}
}
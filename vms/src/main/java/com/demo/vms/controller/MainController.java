package com.demo.vms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value = {"/","/home"})
	public String test() {
		return "index";
	}

}

package com.demo.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.vms.model.VisitorRegistrastion;
import com.demo.vms.service.VisitorService;

@Controller
@RequestMapping("/visitor")
public class VisitorController {
	
	@Autowired
	private VisitorService visitorService;
	
	@GetMapping("/visitorForm")
	public String visitorForm(Model model) {
		VisitorRegistrastion visitorRegistrastion = new VisitorRegistrastion();
		model.addAttribute("visitor",visitorRegistrastion);
		return "vistor_form";
	}
	
	@PostMapping("/save")
	public String createVisitor(@ModelAttribute ("visitor") VisitorRegistrastion visitor,RedirectAttributes redirAttrs) {
		System.out.println("Test");
		//if flat exist then register
		if(visitorService.getFlatByFlatNo(visitor.getFlatNo())) {
			visitorService.createVisitor(visitor);
			redirAttrs.addFlashAttribute("msg", "Registred Sucessfully");
			return "redirect:/visitor/visitorForm";
			
		}else {
			redirAttrs.addFlashAttribute("msg", "Flat Does not Exist");
			return "redirect:/visitor/visitorForm";
		}
		
		
	}


}

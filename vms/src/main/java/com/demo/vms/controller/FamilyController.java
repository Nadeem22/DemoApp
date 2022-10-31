package com.demo.vms.controller;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.vms.model.FamilyRegInfo;
import com.demo.vms.service.EntryExitService;
import com.demo.vms.service.FamilyService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/family")
@Slf4j
public class FamilyController {

	@Autowired
	private FamilyService familyService;
	@Autowired
	private EntryExitService entryExitService;
	
	@GetMapping("/regform")
	public String getfamilyRegForm(Model model) {
		FamilyRegInfo familyInfo = new FamilyRegInfo();
		model.addAttribute("familyInfo", familyInfo);
		return "family_info";
	}

	@PostMapping("/familyInfo/save")
	public String createFamily(@Valid @ModelAttribute("familyInfo") FamilyRegInfo familyRegInfo, BindingResult result,
			RedirectAttributes redirAttrs) {
		String viewName;
		if (result.hasErrors()) {
			viewName = "redirect:/family/regform";
		} else {
			if (familyService.getFaltByFlatNo(familyRegInfo.getFlatNo())) {
				redirAttrs.addFlashAttribute("msg", "Flat Already Registred");
				viewName = "redirect:/family/regform";
			} else {
				familyService.createFamily(familyRegInfo);
				redirAttrs.addFlashAttribute("msg", "Registred Sucessfully");
				viewName = "redirect:/family/regform";
			}
		}
		return viewName;
	}

	@GetMapping("/existingFamily")
	public String getExistingFamily(Model model) {
		model.addAttribute("familyList", familyService.getAllFamily());
		return "exising_family";
	}
	
	
	@PostMapping(value = "/entryExit", params="entry")
	public String familyEntryTiming(Model model, ServletRequest request,RedirectAttributes redirAttrs) {
		String flatNumber =request.getParameter("flatNumber");
		FamilyRegInfo family= familyService.getFamilyByFlatNumber(flatNumber);
		if(family!=null) {
         entryExitService.createEntryByFamily(family);
         redirAttrs.addFlashAttribute("msg","Entry have done sucessfully");
		}
		return "redirect:/family/regform";
	}
	
	@PostMapping(value = "/entryExit", params="exit")
	public String familyExitTiming(Model model, ServletRequest request,RedirectAttributes redirAttrs) {
		String flatNumber =request.getParameter("flatNumber");
		FamilyRegInfo family= familyService.getFamilyByFlatNumber(flatNumber);
		if(family!=null) {
         entryExitService.createExitByFamily(family);
         redirAttrs.addFlashAttribute("msg","Exit entry have done sucessfully");
		}
		return "redirect:/family/regform";
	}

}

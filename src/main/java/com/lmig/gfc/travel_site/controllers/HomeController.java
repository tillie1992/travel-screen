package com.lmig.gfc.travel_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView defaultPage() {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("travel");
				return mv;

	}
}
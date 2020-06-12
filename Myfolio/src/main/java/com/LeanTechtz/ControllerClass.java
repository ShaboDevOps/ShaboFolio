package com.LeanTechtz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping("/")
	public ModelAndView display() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index.jsp");
		
		return model;
	}
}

package com.codingdojo.DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
    public String result(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language,@RequestParam(value="comment") String comment, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		System.out.println(name + location+ language + comment);
		return "result.jsp";
	}
	
	
	@RequestMapping("/goback")
	public String resetAttribute(Model model) {
		model.addAttribute("name", null );
		model.addAttribute("location", null);
		model.addAttribute("langauge", null);
		model.addAttribute("comment", null);
		
		return "redirect:/";
	}
	
}

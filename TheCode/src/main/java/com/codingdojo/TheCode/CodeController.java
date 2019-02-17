package com.codingdojo.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String code() {
		
		return "code.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String index(@RequestParam(value="code") String code, Model model) {
		System.out.println(code);
		
		if( code.equals("bushido") ) {
			return "redirect:/code";
		} else {
			return "redirect:/createError";
			
		}
		
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
	}
	
	
}

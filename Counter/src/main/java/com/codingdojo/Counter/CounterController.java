package com.codingdojo.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		Integer count = (Integer) session.getAttribute("count");
		if(count != null ) {
			session.setAttribute("count", count+1);
		} else {
			session.setAttribute("count", 1);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null ) {
			
			session.setAttribute("count", 0);
		} else  {
			model.addAttribute("count");
		}
		
		
		return "counter.jsp";
	}
}

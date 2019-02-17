package com.codingdojo.DisplayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, ' the 'd'th of ' MMMM , yyyy");
		
		model.addAttribute("date", dateFormatter.format(now));
		return "date.jsp";
	}	
	@RequestMapping("/time")
	public String time(Model model) {
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm a");
		
		model.addAttribute("time", dateFormatter.format(now));
		return "time.jsp";
	}
	
}

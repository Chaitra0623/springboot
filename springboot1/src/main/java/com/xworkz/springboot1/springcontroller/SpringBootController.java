package com.xworkz.springboot1.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	public SpringBootController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("clickhere")
	public String onClick() {
		System.out.println("Invoked clickhere");
		return "entry.jsp";
	}

	@RequestMapping("entry")
	public String WelcomeMessage(String from, String message, String to, Model model) {
		try {
			System.out.println("Invoked welcome page and redirecting to exit.jsp");

			model.addAttribute("from", from);
			model.addAttribute("message", message);
			model.addAttribute("to", to);
		} catch (Exception e) {
			System.err.println("Exception in welcome controller " + e);
		}
		return "exit.jsp";
	}
	
}






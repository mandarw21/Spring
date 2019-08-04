package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@PostMapping("/valid")	
	public String validate(User user,ModelMap map) {
		//Model map is used to store business logic result	
		if (user.getUsername().equalsIgnoreCase("PickleRick") && user.getPassword().equals("Morty123")) {
			map.addAttribute("user", user);
			return "success";
			
		} else {
			map.addAttribute("loginError","Invalid Username Password");
			return "login";
		}
		
		
	}
	
}

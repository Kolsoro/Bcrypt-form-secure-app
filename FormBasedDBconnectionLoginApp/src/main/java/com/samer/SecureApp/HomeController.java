package com.samer.SecureApp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}

	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@GetMapping("/logout-success")
	public String logout() {
		return "logout.jsp";
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}

}

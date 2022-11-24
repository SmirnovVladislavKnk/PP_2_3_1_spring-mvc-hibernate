package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {

	@GetMapping(value = "/")
	public String showAllUsers() {
		return "all-users";
	}
	
}
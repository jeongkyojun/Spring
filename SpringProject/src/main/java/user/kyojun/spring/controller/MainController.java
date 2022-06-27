package user.kyojun.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	
	@GetMapping(value = {"/","/index"})
	privte String index(HttpSesstion session)
	{
		return "index";
	}
}

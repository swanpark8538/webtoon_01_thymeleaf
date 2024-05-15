package com.webtoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String home() {
		return "index";
	}
	
	@GetMapping(value="/ref")
	public String ref() {
		return "ref";
	}
}

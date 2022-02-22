package com.codingdojo.peru.full_time_2022.hello_human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name,
    					@RequestParam(value = "last_name", required = false) String last_name,
    					@RequestParam(value = "times", required = false) int times) {
		if (name == null) {
			name = "Human";
		}
		if (last_name == null) {
			last_name = "";
		}
        return ("Hello " + name + " " + last_name + " ").repeat(times);
    }
}

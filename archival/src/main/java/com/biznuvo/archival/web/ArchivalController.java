package com.biznuvo.archival.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArchivalController {
	@GetMapping("/archive")
	@ResponseBody
	public String archive(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
		    return new String("archival");
	
	
	}

}

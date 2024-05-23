package com.mvcpract.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvcpract.mvc.entity.Education;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class MvcController {
	@GetMapping
	public String getEdu(Education education) {
		
		return education.toString();
	}
	@PostMapping
	public String postEdu(@RequestBody Education education) {
		
		return education.toString();
	}
	@PutMapping
	public String putEdu()
	{
		System.out.println("Hello");
		return "post method";
	}

	@DeleteMapping
	public String deleteEdu()
	{
		return "post method";
	}



}

package com.vinay.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/posts")
public class Messages {

	@RequestMapping(path="/messages" , method=RequestMethod.GET)
	public String getMessages(){
		System.out.println("Got in rest");
		return "vinay kumar";
	}
	
	@RequestMapping(path="/scripts" , method=RequestMethod.GET)
	public String getScripts(){
		System.out.println("Got in rest");
		return "vinay kumar";
	}	
}

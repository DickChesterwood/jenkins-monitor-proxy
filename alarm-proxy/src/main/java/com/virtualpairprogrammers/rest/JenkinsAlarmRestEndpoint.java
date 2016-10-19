package com.virtualpairprogrammers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsAlarmRestEndpoint 
{
	@RequestMapping(method=RequestMethod.GET, value="/")
	public String handlePing()
	{
		System.out.println("\n\n\n\n\nOUCH!");
		return "Ouch!";
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/alarm")
	public String getAlarmStatus()
	{
		double alarm = Math.random() * 10;
		if (alarm < 3)
			return "Green";
		if (alarm >= 3 && alarm < 7)
			return "Yellow";
		return "Red";
	}
}

package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
	@GetMapping("/addition")
	public int add(int a, int b)
	{
		return a+b;
	}
	@GetMapping("/substract")
	public int substract(int a, int b)
	{
		return a-b;
	}
	@GetMapping("/division")
	public int division(int a, int b)
	{
		return a/b;
	}
	@GetMapping("/multiply")
	public int multiply(int a, int b)
	{
		return a*b;
	}
	@GetMapping("/contact")
	public String concat(String a, String b)
	{
		String c= "";
		c=c+a;
		c=c+b;
		return c;
	}	

}

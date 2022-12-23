package com.example.ms1Pro;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nisha")
public class FirstProgram {
	
	@GetMapping(value = "/hello")
	public String hi() {
		return "nisha";
	}
	
	@GetMapping(value="/hi/{name}")
	public String wel (@PathVariable String name) {
		return "Welcome " + name;
	}
	
	@GetMapping(value="/lastChar/{name}")
	public char find(@PathVariable String name) {
		char temp='n';
		for(int i=0;i<name.length();i++) {
			temp=name.charAt(name.length()-1);
		}
		return temp;
	}
	
	@GetMapping(value="/add/{num1}/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return num1+num2;
	}
	
	@GetMapping(value="/print/{num}")
	public int print(@PathVariable int num){
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	@GetMapping(value="/numbers/{b}")
	public List<Integer> show1(@PathVariable int b){
		List<Integer>a = new ArrayList<>();
		for(int i=0;i<=b;i++) {
			a.add(i);
		}
		return a;
	}
	
	@GetMapping(value="/prime/{num}")
	public List<Integer> primePro(@PathVariable int num){
		List<Integer>a=new ArrayList<>();
		boolean temp=true;
		for(int i=1;i<=num;i++) {
			temp=true;
			for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				temp=false;
				break;
			}
			else {
				a.add(i);
			}
			}
		}
		return a;
		
	}
	
		
	

}



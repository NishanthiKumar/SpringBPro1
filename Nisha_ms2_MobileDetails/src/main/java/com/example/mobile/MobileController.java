package com.example.mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	
	@Autowired
	MobileService ms;
	
	@PostMapping(value="/posting")
	public String posting(@RequestBody List<Mobile>a) {
		return ms.posting(a);
	}
	
	
	//this method is used to get the object which is greater than 20000
	@GetMapping(value="/highcost/{amount}")
	public List<Mobile> cost(@PathVariable int amount){
		return ms.cost(amount);
	}
	
	@GetMapping(value="/getByBrand/{brand}")
	public List<Mobile> getByBrand(@PathVariable("brand") String b){
		return ms.getByBrand(b);
	}
	
	@GetMapping(value="/getByRange/{a}/{b}")
	public List<Mobile> getByRange (@PathVariable int a, @PathVariable int b){
		return ms.getByRange(a,b);
	}
	
	@GetMapping(value= "/getMaxObj")
	public Mobile getMaxObj() {
		return ms.getMaxObj();
	}
	
	

}

package com.example.stdDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdController {
	
	@Autowired
	StdService ss;
	
	@PostMapping(value="/post")
	public String post(@RequestBody List<Std> s) {
		return ss.post(s);
	}
	
	@GetMapping(value="/getByDept/{d}")
	public List<Std> getByDept(@PathVariable String d){
		return ss.getByDept(d);
	}
	
	@GetMapping(value="/getMaxAvg")
	public Std getMaxAvg() {
		return ss.getMaxAvg();
	}

}

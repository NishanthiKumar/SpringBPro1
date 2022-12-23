package com.example.deptDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	
	@Autowired
	DeptService ds;
	
	@PostMapping(value="/posting")
	public String posting(@RequestBody List<Dept>d) {
		return ds.posting(d);
	}

}

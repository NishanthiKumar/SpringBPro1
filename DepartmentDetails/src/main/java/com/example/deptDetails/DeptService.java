package com.example.deptDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
	
	@Autowired
	DeptDao dd;

	public String posting(List<Dept> d) {
		return dd.posting(d);
	}

}

package com.example.deptDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDao {
	
	@Autowired
	DeptRepository dr;

	public String posting(List<Dept> d) {
		dr.saveAll(d);
		return "Dept Posted Successsfully";
	}

}

package com.example.stdDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StdDao {
	
	@Autowired
	StdRepository sr;

	public String post(List<Std> s) {
		sr.saveAll(s);
		return " Std Posted Successfully";
	}

	public List<Std> getByDept(String d) {
		return sr.getByDept(d);
	}

	public Std getMaxAvg() {
		return sr.getMaxAvg();
	}

}

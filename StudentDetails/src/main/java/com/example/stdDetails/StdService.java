package com.example.stdDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StdService {
	
	@Autowired
	StdDao sd;

	public String post(List<Std> s) {
		return sd.post(s);
	}

	public List<Std> getByDept(String d) {
		return sd.getByDept(d);
	}

	public Std getMaxAvg() {
		return sd.getMaxAvg();
	}

}

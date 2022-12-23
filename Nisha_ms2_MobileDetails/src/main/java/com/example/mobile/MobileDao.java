package com.example.mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MobileDao {
	
	@Autowired
	MobileRepository mr;

	public String posting(List<Mobile> a) {
		mr.saveAll(a);
		return "Saved Successfully";
	}

	public List<Mobile> getHighCostObj(int amount) {
		return mr.getHighCostObj(amount);
	}

	public List<Mobile> getByBrand(String b) {
		return mr.getByBrand(b);
	}

	public List<Mobile> getByRange(int a, int b) {
		return mr.getByRange(a,b);
	}

	public Mobile getMaxObj() {
		return mr.getMaxObj();
	}
	
	

}

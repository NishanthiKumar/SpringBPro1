package com.example.mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	
	@Autowired
	MobileDao md;

	public String posting(List<Mobile> a) {
		return md.posting(a);
	}

	public List<Mobile> cost(int amount) {
		return md.getHighCostObj(amount);
	}

	public List<Mobile> getByBrand(String b) {
		return md.getByBrand(b);
	}

	public List<Mobile> getByRange(int a, int b) {
		return md.getByRange(a,b);
	}

	public Mobile getMaxObj() {
		return md.getMaxObj();
	}

	
	

}

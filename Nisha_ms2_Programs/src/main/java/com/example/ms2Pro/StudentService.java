package com.example.ms2Pro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String store(List<Std> s) {
		return sd.store(s);
	}

	public List<Std> getting() {
		return sd.getting();
	}
	
	public String update(List<Std> u) {
		return sd.update(u);
	}
	
	public String delete(int id) {
		return sd.delete(id);
	}
	
	public Std find(int a) {
		return sd.find(a);
	}

	public String changeName(String a, int id) {
		return sd.changeName(a, id);
	}

	public List<Std> evenId() {
		List<Std> x =  sd.evenId();
		List<Std> z = new ArrayList<Std>();
		x.forEach(y-> {
			if(y.getId()%2==0) {
				z.add(y);
			}
		});
		return z;
	}

	public String newStd(List<Std> a) {
		List<Std> x= a;
		List<Std> y=new ArrayList<>();
		List<Std> z=new ArrayList<>();
		x.forEach(b->{
			if(b.getName().length()<8) {
				y.add(b);
			}
			else {
				z.add(b);
			}
		});
		return sd.newStd(y);
	}
	
	
	
	

}

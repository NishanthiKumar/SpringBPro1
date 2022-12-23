package com.example.ms2Pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository sr;
	
	public String store(List<Std> s) {
		sr.saveAll(s);
		return "Success";                    // findById().get()  save()  deleteById()
	}                                        // deleteAll()   

	public List<Std> getting() {
		return sr.findAll();
	}

	public String update(List<Std> u) {
		sr.saveAll(u);                           //089401000025795  
		return "Updated";
	}
	
	public String delete(int id) {
		sr.deleteById(id);
		return "Deleted";
	}
	
	public Std find(int a) {
		return sr.findById(a).get();
	}

	public String changeName(String a, int id) {
		Std x = sr.findById(id).get();
		x.setName(a);
		sr.save(x);
		return "Changed successfully";
	}

	public List<Std> evenId() {
		return sr.findAll();
		
	}

	public String newStd(List<Std> a) {
		sr.saveAll(a);
		return "Successs";
	}

}

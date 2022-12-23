package com.example.ms2Pro;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/posting")
	public String store(@RequestBody  List<Std> s) {
		return ss.store(s);
	}
	
	@GetMapping(value="/getting")
	public List<Std> getting() {
		return ss.getting();
	}
	
	@PutMapping(value="/updating")
	public String update(@RequestBody List<Std> u) {
		return ss.update(u);
	}
	
	@DeleteMapping(value="/deleting/{id}")
	public String delete(@PathVariable int id) {
		return ss.delete(id);
	}
	
	@GetMapping(value="/find/{a}")
	public Std find(@PathVariable int a) {
		return ss.find(a);
	}
	
	@PutMapping(value="/changename/{a}/{id}")
	public String changeName(@PathVariable String a, @PathVariable int id) {
		return ss.changeName(a, id);
	}
	
	@GetMapping(value="/evenid")
	public List<Std> evenId(){
		return ss.evenId();
	}
	
	@PostMapping(value="/newStd")
	public String newStd(@RequestBody List<Std> a){
		return ss.newStd(a);
	}
	
}

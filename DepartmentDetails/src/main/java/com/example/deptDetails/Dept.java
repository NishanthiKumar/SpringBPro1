package com.example.deptDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dept_details")
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String deptname;
	private int fees;
	private String hod;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	
	public Dept(int id, String deptname, int fees, String hod) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.fees = fees;
		this.hod = hod;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptname=" + deptname + ", fees=" + fees + ", hod=" + hod + "]";
	}
	
	
	

}

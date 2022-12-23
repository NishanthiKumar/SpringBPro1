package com.example.ms2Pro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_details")
public class Std {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int examNum;
	private char sec;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExamNum() {
		return examNum;
	}
	public void setExamNum(int examNum) {
		this.examNum = examNum;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", examNum=" + examNum + ", sec=" + sec + "]";
	}
	
	

}

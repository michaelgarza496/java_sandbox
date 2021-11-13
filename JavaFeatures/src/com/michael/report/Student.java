package com.michael.report;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String name;
	private Map<String, Integer> term1;
	private Map<String, Integer> term2;

	public Student(String name) {
		super();
		this.name = name;
		term1 = new HashMap<>();
		term2 = new HashMap<>();
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", term1=" + term1 + ", term2=" + term2 + "]";
	}



	// getters and setters
	public Map<String, Integer> getTerm1() {
		return term1;
	}

	public void setTerm1(Map<String, Integer> term1) {
		this.term1 = term1;
	}

	public Map<String, Integer> getTerm2() {
		return term2;
	}

	public void setTerm2(Map<String, Integer> term2) {
		this.term2 = term2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

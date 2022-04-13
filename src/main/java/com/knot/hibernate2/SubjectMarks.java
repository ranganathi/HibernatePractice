package com.knot.hibernate2;

public class SubjectMarks {

	@Override
	public String toString() {
		return "SubjectMarks [sub=" + sub + ", marks=" + marks + "]";
	}

	private String sub;
	
	private int marks;
	
	
	
	
	

	public SubjectMarks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectMarks(String sub, int marks) {
		super();
		this.sub = sub;
		this.marks = marks;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
	
	
}

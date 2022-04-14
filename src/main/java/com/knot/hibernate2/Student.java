package com.knot.hibernate2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student" )
public class Student  {
	
	
	@Column(name="studentid")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@OneToMany(mappedBy="stu",cascade=CascadeType.PERSIST)
	private List<subject> subs =new ArrayList<>();

	//student
	
	
	
	public List<subject> getSubs() {
		return subs;
	}

	public void setSubs(List<subject> subs) {
		this.subs = subs;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	


}

package com.knot.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="subject")
@NamedQuery(name="fetchsubjects",query="from subject a")
public class subject {
	
	@Id
	@Column(name="subject_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int SubjectId;
	
	@Column(name="subname")
	private String subName;
	
	@Column(name="marks")
	private int marks;

	@ManyToOne
	@JoinColumn(name="studentid")
	private Student stu;
	
	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
	
	
	
	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public subject(int subjectId, String subName, int marks) {
		super();
		SubjectId = subjectId;
		this.subName = subName;
		this.marks = marks;
	}

	public subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

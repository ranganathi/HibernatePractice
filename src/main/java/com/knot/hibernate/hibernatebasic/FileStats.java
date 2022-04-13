package com.knot.hibernate.hibernatebasic;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="file_stats")
public class FileStats {


	@Id
	@Column(name="statid")
	private int statid;
	
	@Column(name="file_type")
	private String fileType;
	
	@Column(name="filesystem")
	private String fileSystem;

	@ManyToOne
	@JoinColumn(name="fileid")
	private FileInfo info;
	
	
	
	public FileStats() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FileStats(int statid, String fileType, String fileSystem, FileInfo info) {
		super();
		this.statid = statid;
		this.fileType = fileType;
		this.fileSystem = fileSystem;
		this.info = info;
	}



	public int getStatid() {
		return statid;
	}



	public void setStatid(int statid) {
		this.statid = statid;
	}



	public String getFileType() {
		return fileType;
	}



	public void setFileType(String fileType) {
		this.fileType = fileType;
	}



	public String getFileSystem() {
		return fileSystem;
	}



	public void setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}



	public FileInfo getInfo() {
		return info;
	}



	public void setInfo(FileInfo info) {
		this.info = info;
	}



	

	
	
	
}

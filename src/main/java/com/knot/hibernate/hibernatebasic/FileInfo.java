package com.knot.hibernate.hibernatebasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.FilterJoinTable;


@Entity
@Table(name="File_info")
public class FileInfo {

	
	
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="file_id")
private int fileId;

@Column(name="filename")
private String FileName;
@Column(name="fileCount")
private int fileCnt;

@Temporal(TemporalType.TIMESTAMP)
@Column(name="creation_date")
private Date creationDate;

@OneToMany(mappedBy="info",cascade=CascadeType.ALL)
private List<FileStats> stats=new ArrayList<FileStats>();

/*
@ElementCollection
@JoinTable(name="File_stats",
joinColumns=@JoinColumn(name="fileID"))
private Collection<FileStats> filestat = new ArrayList<FileStats>();

*/





public FileInfo() {
	// TODO Auto-generated constructor stub
}

public int getFileId() {
	return fileId;
}

public void setFileId(int fileId) {
	this.fileId = fileId;
}

public String getFileName() {
	return FileName;
}

public void setFileName(String fileName) {
	FileName = fileName;
}

public int getFileCnt() {
	return fileCnt;
}

public void setFileCnt(int fileCnt) {
	this.fileCnt = fileCnt;
}

public Date getCreationDate() {
	return creationDate;
}

public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}

public List<FileStats> getStats() {
	return stats;
}

public void setStats(List<FileStats> stats) {
	this.stats = stats;
}

public FileInfo(int fileId, String fileName, int fileCnt, Date creationDate, List<FileStats> stats) {
	super();
	this.fileId = fileId;
	FileName = fileName;
	this.fileCnt = fileCnt;
	this.creationDate = creationDate;
	this.stats = stats;
}






	

}

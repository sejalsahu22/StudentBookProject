package com.student_book_project.MavenHibernateProject.Dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_Book")
public class BookDto implements Serializable{
	
	@Id
	@GeneratedValue(generator="inc")
	@GenericGenerator(name = "inc" , strategy="increment")
	private int Bookid;
	private String BookName;
	private String booKAutherName;
	private String BookEdition;
	
	@ManyToOne
	private StudentDto students;
	public StudentDto getStudents() {
		return students;
	}


	public void setStudents(StudentDto students) {
		this.students = students;
	}


	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBooKAutherName() {
		return booKAutherName;
	}
	public void setBooKAutherName(String booKAutherName) {
		this.booKAutherName = booKAutherName;
	}
	public String getBookEdition() {
		return BookEdition;
	}
	public void setBookEdition(String bookEdition) {
		BookEdition = bookEdition;
	}
	@Override
	public String toString() {
		return "BookDto [Bookid=" + Bookid + ", BookName=" + BookName + ", booKAutherName=" + booKAutherName
				+ ", BookEdition=" + BookEdition + "]";
	}
	
	
	
	

}

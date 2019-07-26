package com.student_book_project.MavenHibernateProject.Dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "table_Student")
public class StudentDto implements Serializable{
	
	@Id
	@GeneratedValue(generator="inc")
	@GenericGenerator(name = "inc" , strategy="increment")
	private int Rollno;
	private String Name;
	private String Subject;
	private String Stream;
	private int Semester;
	private int Year;
	
	@OneToMany(mappedBy= "Student")
	List<BookDto> Books;
	
	public List<BookDto> getBooks() {
		return Books;
	}

	public void setBooks(List<BookDto> books) {
		Books = books;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public int getSemester() {
		return Semester;
	}

	public void setSemester(int semester) {
		Semester = semester;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
	@Override
	public String toString() {
		return "StudentDto [Rollno=" + Rollno + ", Name=" + Name + ", Subject=" + Subject + ", Stream=" + Stream
				+ ", Semester=" + Semester + ", Year=" + Year + "]";
	}

	

}

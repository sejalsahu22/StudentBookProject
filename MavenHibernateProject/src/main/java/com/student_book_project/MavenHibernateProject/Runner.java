package com.student_book_project.MavenHibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student_book_project.MavenHibernateProject.Dto.BookDto;
import com.student_book_project.MavenHibernateProject.Dto.StudentDto;

public class Runner {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		StudentDto sejal = new StudentDto();
		sejal.setName("Sejal");
		sejal.setSemester(5);
		sejal.setSubject("Data structure");
		sejal.setStream("CSE");
		sejal.setYear(3);
		
		BookDto Ds = new BookDto();
		Ds.setBookName("GeeksforGeeks");
		Ds.setBooKAutherName("geeks");
		Ds.setBookEdition("6th");
		Ds.setStudents(sejal);
		
		BookDto Java = new BookDto();
		Java.setBookName("java cookbook");
		Java.setBooKAutherName("java");
		Java.setBookEdition("7th");
		Java.setStudents(sejal);
		
		List<BookDto> listOfSejalBooks = new ArrayList<BookDto>();
		listOfSejalBooks.add(Java);
		listOfSejalBooks.add(Ds);
		
		sejal.setBooks(listOfSejalBooks);
		
		session.save(sejal);
		session.save(Java);
		session.save(Ds);
		
		transaction.commit();
		
		factory.close();
		session.close();
	}

}

package com.student_book_project.MavenHibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	
	// 1. step to create a static variable

			private static SessionFactory factory = null;
			static {
				Configuration configuration = new Configuration();
				configuration.configure();
				factory =configuration.buildSessionFactory();
				
			}
			public static  SessionFactory getSessionFactory() {
			
				return factory;
			}
			private  HibernateUtils() {
				super();
				// TODO Auto-generated constructor stub
}
}
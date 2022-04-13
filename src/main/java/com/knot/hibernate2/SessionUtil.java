package com.knot.hibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.knot.hibernate.hibernatebasic.FileInfo;
import com.knot.hibernate.hibernatebasic.FileStats;

public class SessionUtil {

	//session util
	public static SessionFactory getSession() {
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();

		MetadataSources metadataSources = new MetadataSources(ssr);

		metadataSources.addAnnotatedClass(Student.class);
		metadataSources.addAnnotatedClass(subject.class);

		//metadataSources.addAnnotatedClass(FileStats.class);
		
		Metadata metaData=metadataSources.buildMetadata();
		
		return metaData.buildSessionFactory();

		
		
	}
	
}

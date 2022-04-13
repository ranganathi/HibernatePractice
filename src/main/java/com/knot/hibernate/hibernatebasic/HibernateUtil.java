package com.knot.hibernate.hibernatebasic;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	public static SessionFactory getSession() {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();

		MetadataSources metadataSources = new MetadataSources(ssr);

		metadataSources.addAnnotatedClass(FileInfo.class);
		metadataSources.addAnnotatedClass(FileStats.class);
		
		Metadata metaData=metadataSources.buildMetadata();
		
		return metaData.buildSessionFactory();

	}

}

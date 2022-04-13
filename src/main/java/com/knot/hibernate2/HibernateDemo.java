package com.knot.hibernate2;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

public class HibernateDemo {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory sf=SessionUtil.getSession();
		
		Session session= sf.openSession();
		
		Student st=new Student();
		st.setName("ranganath");
		st.setAge(26);
		
		
		subject sb1=new subject();
		//subject sb2=new subject();

		sb1.setMarks(67);
		sb1.setSubName("hibernate");
		sb1.setStu(st);
//		sb2.setMarks(0);
//		sb2.setSubName("Billing");
	
		st.getSubs().add(sb1);
		//st.getSubs().add(sb2);
		
		session.beginTransaction();
		
//		
//		List<Object[]> submark =session.createNativeQuery("select * from file_info where file_id > :fileid" ).setParameter("fileid",10).getResultList();
//
//			//List<SubjectMarks> submark=qr.getResultList();
//		
//		for(Object[] mark:submark)
//			System.out.println(mark[0]+" ,"+mark[1]+" "+mark[2]);
		
		
		session.getNamedQuery("fetchsubjects").getResultList();
		
			
		//	        qr
		
		
		
//	Iterator<subject> ite=subs.iterator();
//	while(ite.hasNext())
//			System.out.println(ite.next().getMarks());
//		//Student stu=session.get(Student.class, 49);
		
		//session.delete(stu);
		session.getTransaction().commit();		
		session.close();
		
	}

}

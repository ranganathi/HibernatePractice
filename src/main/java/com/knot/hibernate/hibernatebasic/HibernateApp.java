package com.knot.hibernate.hibernatebasic;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.knot.hibernate2.SubjectMarks;

/**
 * Hello world!
 *
 */
public class HibernateApp 
{
	
	
	
	
    public static void main( String[] args )
    {
    	
    	
    	
    	
    	List<SubjectMarks> li= new ArrayList<SubjectMarks>();
    	
    	
    	li.add(new SubjectMarks("telugu",90));
    	li.add(new SubjectMarks("hindi", 85));
    	li.add(new SubjectMarks("maths",71));
    	
    	
    	Integer sil=li.stream().filter(t->t.getMarks()>80).map(t->t.getMarks()).reduce(1,(a,b)->a*b);
    	
    	
    	System.out.println(sil);
    	
//    	li.sort((sb1,sb2)->{
//    		if(sb1.getMarks()>sb2.getMarks())
//    			return -1;
//    		else if(sb1.getMarks()<sb2.getMarks())
//    			return 1;
//    		else 
//    			return 0;
//    	});
//    	
//    	System.out.println(li);
//    	
//    			
       
//    	SessionFactory sef=HibernateUtil.getSession();
//    	Session session=	sef.openSession();
//    	
//    	
//    	FileInfo info=new FileInfo();
//    	info.setFileName("queryresults_20220311172111.xls");
//    	info.setFileCnt(233487);
//       info.setCreationDate(new Date());
//       info.getStats().add(new FileStats(105,"ssms_mt","rtx",info));
//   //  FileStats stat=new FileStats(101,"ms","FIH",info);
//    	session.beginTransaction();
//    	
//    	
////    	
//  	session.remove(session.get(FileInfo.class, 45));
////    	session.save(new FileStats(102,"ssms_mt","rtx",info));
////    		//session.save(stat);
//    	
//    	
//  //  FileInfo fi=session.get(FileInfo.class, 24);
//  
// 
//     
//    	session.getTransaction().commit();
//    	session.close();
//    //	System.out.println(fi.getFilestat());
    	
    	
    	
    }
}

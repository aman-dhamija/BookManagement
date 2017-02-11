package com.myhib;

import java.util.List;


import org.hibernate.Session;

public class BmFunctions implements BmInterface{
	
	public int userlogin( String uname,String pass){   
		Session s=HibernateUtil.getSessionFactory().openSession();	
		List<User> u= s.createQuery("From User  U Where U.username='"+uname+"'"+" and U.userpassword='"+pass+"'").list();
		if(u.isEmpty())
			return 0;
		else
			return 1;
	}
	public int adminlogin( String aname,String pass){   
		Session s=HibernateUtil.getSessionFactory().openSession();	
		List<User> u= s.createQuery("From Admin  A Where A.adminname='"+aname+"'"+" and A.adminpassword='"+pass+"'").list();
		if(u.isEmpty())
			return 0;
		else
			return 1;
	}
   public void signup(String name,String pass){  
	   Session s=HibernateUtil.getSessionFactory().openSession();
       s.beginTransaction();
       User u=new User(name,pass);
       s.save(u);
       s.getTransaction().commit();
       s.close();
   }
   public void addBook(Book u){
	   Session s=HibernateUtil.getSessionFactory().openSession();
       s.beginTransaction();
       s.save(u);
       s.getTransaction().commit();
       s.close();
   }
   public void updatebook(int bid,String name,String author,int price,int quantity){   
	   Session s=HibernateUtil.getSessionFactory().openSession();
	   s.beginTransaction();
	   Session r=HibernateUtil.getSessionFactory().openSession();
       List<Book> book= r.createQuery("From Book  B Where B.bookid='"+bid+"'").list();
       for(Book b:book){
    	   b.setBookid(bid);
    	   if(name.equals("0"));
    	   else
    		   b.setBookname(name);
    	   if(author.equals("0"));
    	   else
    		   b.setBookauthor(author);
    	   if(price!=0)
    		   b.setBookprice(price);

    	   if(quantity!=0)
    		   b.setBookquantity(quantity);
    	   s.update(b);

       }
	   s.getTransaction().commit();
	   s.close();
   }
   public void removebook(int value){ 
	   Session s=HibernateUtil.getSessionFactory().openSession();
	   s.beginTransaction();	   
	   Book u = new Book();
	   u.setBookid(value);
	   s.delete(u);
	   s.getTransaction().commit();
	   s.close();
   }
   
   public void removeuser(int value){ 
	   Session s=HibernateUtil.getSessionFactory().openSession();
	   s.beginTransaction();	   
	   User u = new User();
	   u.setUserId(value);
	   s.delete(u);
	   s.getTransaction().commit();
	   s.close();
    }
   public List<Book> searchbook(int id,String name,String author,int lowprice,int highprice){
	   Session s=HibernateUtil.getSessionFactory().openSession();
	   String hql="From Book B Where";
	   
	   if(name.equals("0"))
		   hql=hql+" B.bookname like '%'";
	   else
		   hql=hql+" B.bookname like '"+name+"'";
	   if(author.equals("0"))
		   hql=hql+" and B.bookauthor like '%'";
	   else
		   hql=hql+" and B.bookauthor like '"+author+"'";
	   if(id!=0)
		   hql=hql+" and B.bookid='"+id+"'";
	   if(lowprice<=highprice && lowprice!=0 && highprice!=0)
		   hql=hql+" and B.bookprice BETWEEN '"+lowprice+"'"+"and '"+highprice+"'";
	   System.out.println(hql);
	   List<Book> bk=s.createQuery(hql).list();
	   return bk;
	   
	  
   }
}

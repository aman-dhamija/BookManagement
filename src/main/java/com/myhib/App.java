package com.myhib;

import java.util.List;
import java.util.Scanner;

import com.myhib.BmFunctions;
import com.myhib.Book;

public class App 
{
    public static void main( String[] args ){
     
    	 int choice;
         BmFunctions obj=new BmFunctions();
         Scanner sc=new Scanner(System.in);
         System.out.println("Menu:");
         System.out.println("1.Login");
         System.out.println("2.Signup"); 
         choice=sc.nextInt();

         if(choice==1){
              System.out.println("Login as\n1.Admin \n2.User");
         	  int choice2=sc.nextInt();
         	  if(choice2==1){
         	    System.out.println("ADMIN");
         		sc.nextLine();
         	    int r=0;
         	    while(r==0)
         	    {System.out.println("Enter username:");
         	    String name=sc.nextLine();
         	    System.out.println("Enter password:");
         	    String pass=sc.nextLine();
         	    r=obj.adminlogin(name,pass);
         	    if(r==1)
         	    	break;
         	    System.out.println("Wrong!Enter Again");
         	    }
         	    
         	   while(true){
         	   System.out.println("Options: \n1)Add Book \n2)Update Book \n3)Delete Book or User\n4)Exit"); 
         	   int choice1=sc.nextInt();
         	   if(choice1==1){
       	       sc.nextLine();
       		   System.out.println("Enter Book name");
       		   String name=sc.nextLine();
       		   System.out.println("Enter Book author");
       		   String author=sc.nextLine();
       		   System.out.println("Enter Book price");
       		   int price=sc.nextInt();
       		   System.out.println("Enter Book quantity");
       		   int quantity=sc.nextInt();
               Book b= new Book(name,author,price,quantity);
       		   obj.addBook(b);
       		   System.out.println("Book added");
       		   
       	   }
         	   else if(choice1==2){
         	   
         		   System.out.println("Update : \nEnter Book id");
         		   int bid=sc.nextInt();
         		   sc.nextLine();
         		   System.out.println("Enter new value :  (Enter 0 for unchanged values)");
         		   System.out.println("Enter Book name");
         		   String name=sc.nextLine();
         		   System.out.println("Enter Book author");
         		   String author=sc.nextLine();
         		   System.out.println("Enter Book price");
         		   int price=sc.nextInt();
         		   System.out.println("Enter Book quantity");
         		   int quantity=sc.nextInt();
         		   obj.updatebook(bid,name, author, price, quantity);
         		   System.out.println("Book Updated");
         		   
         		   
         		   
         	   }
         	   else if(choice1==3){
         	    
         		   System.out.println("\n1)Delete Book\n2)Delete User");
         		   int ch=sc.nextInt();
         		   if(ch==1){
         		     System.out.println("\nEnter book id:");
         			 int bid=sc.nextInt();
         			 obj.removebook(bid);
         			 System.out.println("Book removed");
         			   
         		   }
         		   else if(ch==2){
         		   
         			   System.out.println("\nEnter user id:");
         			   int uid=sc.nextInt();
         			   obj.removeuser(uid);
         			   System.out.println("User removed");
         		   }
         		   
         		   }
         	   else if(choice1==4)
         		   break;
         	   }
         	   }
         	  else if(choice2==2){
         	    System.out.println("USER");
         		sc.nextLine();
         		int r=0;
         	    while(r==0){
         	     System.out.println("Enter username:");
         	     String name=sc.nextLine();
         	     System.out.println("Enter password:");
         	     String pass=sc.nextLine();
         	     r=obj.userlogin(name,pass);
         	     if(r==1)
         	    	break;
         	     System.out.println("Wrong!Enter Again");
         	    }
         	    while(true){
         		 System.out.println("Options:\n1)Search Book\n2)Purchase");
         		 int choice1=sc.nextInt();
         		 if(choice1==1)
         		 {
         			 System.out.println("SEARCH OPTIONS:\n1)By name\n2)By author\n3)By price\n4)By Id ");
         			 int choice3=sc.nextInt();
         			 
         			 if(choice3==1){
         			     sc.nextLine();
         				 System.out.println("\nEnter book's name:");
         				 String name=sc.nextLine();
         				 List<Book> x=obj.searchbook(0,name,"0",0,0);
         				for(Book j:x)
     					   System.out.println(j.getBookid()+" "+j.getBookname()+" "+j.getBookauthor());;
         			 }
         		 
         		 else if(choice3==2){   
         			     sc.nextLine();
        				 System.out.println("\nEnter book's author name:");
        				 String aname=sc.nextLine();
        				 List<Book> x=obj.searchbook(0,"0",aname,0,0);
        				 for(Book j:x)
      					   System.out.println(j.getBookid()+" "+j.getBookname()+" "+j.getBookauthor());;
        			 }
        		 
         		 else if(choice3==3){
         			    sc.nextLine();
         				 System.out.println("\nEnter minimum price:");
         				 int low=sc.nextInt();
         				 System.out.println("\nEnter maximum price:");
         				 int high=sc.nextInt();
         				 List<Book> x=obj.searchbook(0,"0","0",low,high);
         				for(Book j:x)
     					   System.out.println(j.getBookid()+" "+j.getBookname()+" "+j.getBookauthor());;
         			 }
         		 else if(choice3==4){
        			     sc.nextLine();
        				 System.out.println("\nEnter book's id:");
        				 int bid=sc.nextInt();
        				 List<Book> x =obj.searchbook(bid,"0","0",0,0);
        				 for(Book j:x)
        					   System.out.println(j.getBookid()+" "+j.getBookname()+" "+j.getBookauthor());;
        				 
        			 }
         		 }
         		 else if(choice1==2){
         			 
         		 }
         		
         	   }
         	  }
         }
         else if(choice==2){   
          sc.nextLine();
       	  System.out.println("SIGN UP");
   	      System.out.println("\nUsername:");
   	      String name=sc.nextLine();
   	      System.out.println("\nPassword:");
   	      String pass=sc.nextLine();
       	  obj.signup(name,pass);
         }
        

    }
}

package Firsthibernate.com.myhib;

import com.myhib.BmFunctions;
import com.myhib.BmInterface;
import com.myhib.Book;

import junit.framework.TestCase;

import java.util.List;

import org.junit.Test;
public class AddBookTest extends TestCase {
	
	@Test
	public void testbook(){
		
		BmInterface obj=new BmFunctions();
		Book b=new Book(23,"invinsible","brown",23,5);
		obj.addBook(b);
		List<Book> x= obj.searchbook(23,"0","0",0,0);
	
		
		for(Book j:x){
			
			assertEquals(j.getBookname(), "invinsible");
			assertEquals(j.getBookauthor(), "brown");
			assertEquals(j.getBookprice(), 23);
			assertEquals(j.getBookquantity(), 5);
			
		}
	  
			  
	}
}

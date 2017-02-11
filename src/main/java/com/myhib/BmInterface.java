package com.myhib;

import java.util.List;

/**
 * @author amandhamija
 *
 */

public interface BmInterface {
	
	/**
	 * @param name Username
	 * @param pass User password
	 * This function is used by users for registering to management system
	 */
	public void signup(String name,String pass);
	/**
	 * @param uname Username
	 * @param pass User password
	 * @return
	 * This function is used by userd to login into system
	 */
	public int userlogin(String uname,String pass);
	/**
	 * @param uname Admin name
	 * @param pass Admin password
	 * @return
	 * This function is used by admin to login into system.
	 */
	public int adminlogin(String uname,String pass);
	/**
	 * @param name Book name
	 * @param author book author
	 * @param price Book price
	 * @param quantity Book quantity
	 * This function is used by admin to add books into system.
	 */
	public void addBook(Book b);
	/**
	 * @param value Book id
	 * This function is used by admin to remove bokk
	 */
	public void removebook(int value);
	/**
	 * @param value User id.
	 * This function is used by admin to delete user.
	 */
	public void removeuser(int value);
	/**
	 * @param bid Book id
	 * @param name Book name
	 * @param author Book author
	 * @param price Book price
	 * @param quantity Book quantity
	 * This function is used by admin to update book info.
	 */
	public void updatebook(int bid,String name,String author,int price,int quantity);
	/**
	 * @param name Book name
	 * @param author Book author
	 * @param lowprice Book lowest price in range
	 * @param highprice Book highest price in range
	 */
	public List<Book> searchbook(int id,String name,String author,int lowprice,int highprice);
}

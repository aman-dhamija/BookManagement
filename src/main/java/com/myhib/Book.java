package com.myhib;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="id")
    private int bookid;
	@Column(name="name")
    private String bookname;
	@Column(name="author")
    private String bookauthor;
	@Column(name="price")
    private int bookprice ;
	@Column(name="quantity")
    private int bookquantity;
	public int getBookid() {
		return bookid;
	}

	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public int getBookquantity() {
		return bookquantity;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public void setBookquantity(int bookquantity) {
		this.bookquantity = bookquantity;
	}
	public Book(){}
	public Book(String bookname, String bookauthor, int bookprice, int bookquantity) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.bookquantity = bookquantity;
	}

	public Book(int bookid, String bookname, String bookauthor, int bookprice, int bookquantity) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.bookquantity = bookquantity;
	};
	
	
}

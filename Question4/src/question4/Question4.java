/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;


/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Question4 {
	public static void main(String[] args) 
        {
        System.out.println("Answer4: Vinod Kumar Reddy Nellore");  
	Book book1 = new Book(111,"Learn Java",500.0);
	book1.display();
	//Creating Book class reference referring to Subclass SpecialEditionBook object
	Book book2 = new SpecialEditionBook(222,"Learn Python",800.0,100.0);
	book2.display();//invokes display() of SpecialEditionBook class
	}

}
class Book
{
	private int bookId;
	private String bookName;
	private double bookPrice;
	public Book(int bookId, String bookName, double bookPrice) 
        {
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	}
	public Book() {}
	public void display()
	{
	System.out.println("Book Id : "+bookId);
	System.out.println("Book Name : "+bookName);
	System.out.println("Book Price : "+bookPrice);
	}
}
class SpecialEditionBook extends Book
{
	private double discount;

	public SpecialEditionBook(int bookId, String bookName, double bookPrice, double discount) 
        {
	  super(bookId, bookName, bookPrice);
	  this.discount = discount;
	}
	public SpecialEditionBook() {}
	public void display()
	{
	  super.display();//invokes the Book class display()
	  System.out.println("Discount : "+discount);
	}
}
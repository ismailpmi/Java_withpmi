package pmi;

import java.util.Scanner;

public class Book {
	int isbn,price;
	String title,author;
	public Book(int isbn, int price, String title, String author) {
//		super();
//		this.isbn = isbn;
//		this.price = price;
//		this.title = title;
//		this.author = author;
		System.out.println("Enter a choice 1-To view deatails 2-To for discount price");
		Scanner sc = new Scanner(System.in);
		int sl=sc.nextInt();
		sl.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int isbn=1,price=200;
		String title="There You are!",author="by  pmi";
//		System.out.println("Enter a choice 1-To view deatails 2-To for discount price");
//		Scanner sc = new Scanner(System.in);
		Book book=new Book(isbn, price, title, author);
		
	}

	public void displaydetail(){
		
	}
	public void discountprice(){
	}	
}

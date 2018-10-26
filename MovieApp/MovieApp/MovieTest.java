package MovieApp;

import java.util.Scanner;

public class MovieTest {
	static Movie movie = new Movie();
public static void main(String[] args) {
	int ch;
	
	Scanner sc = new Scanner(System.in);
	do
	{
		System.out.println("***************BOOK_MY_SHOW***************");
		System.out.println("1.Available Movies\n2.Book Ticket\n3.Cancel Ticket \n4.Display All\n5.Exit\nEnter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:MovieDao.displayMovies();break;
		case 2:MovieDao.bookTicket(MovieService.addCustomer());break;
		case 3:System.out.println("Enter the name you want to delete:");
		      String name=sc.next();
		       movie.setCustomer_name(name);
			   MovieDao.CancelTicket(movie);break;
		case 4:MovieDao.customerDetails();break;
		case 5:break;
		default:System.out.println("Invalid choice....");
		
		}
		
		
	}while(ch!=5);
}
}

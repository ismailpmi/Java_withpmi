package MovieApp;

import java.util.Scanner;

public class MovieService {
	static Movie movie = new Movie();
	
	public static Movie addCustomer()
    {
		Scanner	 scanner = new Scanner(System.in);
		System.out.println("Enter the  id:");
		int id=scanner.nextInt();
		System.out.println("Enter the name:");
		String name=scanner.next();
		System.out.println("Enter the No of Tickets:");
		int tickets=scanner.nextInt();
		 movie= new Movie(id,name,tickets);
		//System.out.println(movie.toString());
		return movie;
	}


}

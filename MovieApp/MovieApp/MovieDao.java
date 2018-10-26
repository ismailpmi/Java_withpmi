package MovieApp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Project4Ondatabase.ClassConnection;

public class MovieDao {
	public static void bookTicket(Movie movie)
	{
		Connection con=ClassConnection.getConnection();
		
		PreparedStatement psmt;
		System.out.println(movie.toString());
		try
		{
		  psmt=con.prepareStatement("insert into Book_movie values(?,?,?)");
		  psmt.setInt(1, movie.getMovie_id());
		  psmt.setString(2, movie.getCustomer_name());
		  psmt.setInt(3, movie.getNo_of_tickets());
		  int rows=psmt.executeUpdate();
		  System.out.println("Number of rows affected:"+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void displayMovies()
	{
		
		System.out.println("1.Koi Mil Gaya..");
		System.out.println("2.Boss Baby..");
		System.out.println("3.Lupt");
		System.out.println("4.BahuBali");

		
		
	}
	public static void customerDetails()
	{
		Connection con=ClassConnection.getConnection();
		
		Statement stmt;
		try
		{
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from Book_movie");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void CancelTicket(Movie movie)
	{
		Connection con=ClassConnection.getConnection();
		
		PreparedStatement psmt;
		//System.out.println(movie.toString());
		try
		{
		  psmt=con.prepareStatement("delete from Book_movie where name=?");
		  psmt.setString(1, movie.getCustomer_name());
		  int rows=psmt.executeUpdate();
		  System.out.println("Number of rows affected:"+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

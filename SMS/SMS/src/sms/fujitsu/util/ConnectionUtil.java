package sms.fujitsu.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionUtil {

	public static  Connection getConnection(){
		Connection connection=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pmi","root","1234");
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return connection;
	}
	
}

package connection.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
		public static Connection con = null;
		public static Connection establishConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("mydbinstance.clfjvtauxahi.ap-south-1.rds.amazonaws.com","fujitsu","password");
			System.out.println("Connection Successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Connection Error!");
		}
		return con;				
	}
//		public static void main(String[] args) {
//			establishConnection();
//		}
}

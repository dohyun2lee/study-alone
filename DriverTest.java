package chapter11;

import java.sql.*;

public class DriverTest {
	public static void main(String args[]) {
		Connection con;
		
			
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Seoul&useSSL=false","root","1234");
//			jdbc:mysql://localhost/mydb?autoReconnect=true&verifyServerCertificate=false&useSSL=true
			System.out.println("Success");
		}
		
		catch(SQLException ex) {System.out.println("SQLException"+ex);}
		catch(Exception ex) {System.out.println("Exception:"+ex);}
	}
}


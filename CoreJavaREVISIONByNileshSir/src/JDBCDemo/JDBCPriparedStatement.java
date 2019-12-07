package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPriparedStatement {

	
	private static Connection con;
	private static PreparedStatement pstm;
	private static ResultSet rs;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("yyyyyyyyyyyyy");
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB","root", "root");
			
			pstm=con.prepareStatement("insert into emp values(?,?)");
			
			pstm.setInt(1,2);
			pstm.setString(2,"Balasaheb");
			
			int i=pstm.executeUpdate();
			
			System.out.println("Insert Successfully..............");
			
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
}

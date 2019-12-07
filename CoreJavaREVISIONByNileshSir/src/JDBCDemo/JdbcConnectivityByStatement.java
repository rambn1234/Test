package JDBCDemo;
import java.sql.*;
public class JdbcConnectivityByStatement {

	private static Connection con;
	private static Statement stm;
	private static ResultSet rs;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("YYYYYYYYYYYYYYY");
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDB", "root", "root");
			
			stm=con.createStatement();
			
			String sql="select * from emp";
			rs=stm.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
			System.out.println(" Yes Connection Done......................");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
	
	
	
	
 
}

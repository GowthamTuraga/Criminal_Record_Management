import java.sql.*;
public class connect
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			if(conn !=null)
				System.out.println("Connected");
			else
				System.out.println("Not Connected");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



			              
			         
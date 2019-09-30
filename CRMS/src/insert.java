 import java.sql.*; 
 import java.util.Scanner;

public class insert
{ 
	public void insertion()
	{ 
	
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			Scanner in = new Scanner(System.in);
			int Id = in.nextInt();
			String Name = in.next();
			String Place = in.next();
			String blood = in.next();
			String reason = in.next();
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO CrimeRecord VALUES(?,?,?,?,?)");
			ps.setInt(1, Id);
			ps.setString(2, Name);
			ps.setString(3, Place);
			ps.setString(4, blood);
			ps.setString(5, reason);
			 
			int x = ps.executeUpdate(); 
			if (x > 0)			 
				System.out.println("Successfully Inserted");			 
			else			
				System.out.println("Insert Failed"); 
			
			conn.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
	} 
} 

 import java.sql.*; 
 import java.util.Scanner;

public class insert
{ 
	public void insertion()
	{ 
		//String Id = "1002"; 
		//String Name = "James"; 
		//String Place = "Kolkata"; 
		//String blood = "A+"; 
		//String reason = "Murder";
		
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
	
			//Statement st = conn.createStatement(); 
			
			// Inserting data in database 
			//String q1 = "insert into CrimeRecord values('" +Id+ "', '" +Name+"', '" +Place+ "', '" +blood+ "','" +reason+ "')"; 
			 
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

import java.sql.*; 
import java.util.Scanner;

public class update 
{ 
	public void updation() 
	{  
		try
		{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","gowtham");
			Statement st = conn.createStatement(); 
			Scanner in = new Scanner(System.in);
		
			System.out.println("Enter Id number");
			int newId = in.nextInt();
			System.out.println("Enter previous crime name");
			int Id = in.nextInt();
			
			String q1 = "update CrimeRecord set Id = '" + newId + "' where Id = '" + Id + "' ";

			
			st.executeUpdate(q1);
            System.out.println("Updation Completed");
			
			int x = st.executeUpdate(q1); 
			
			if (x > 0)			 
				System.out.println("Data Successfully Updated");			 
			else			
				System.out.println("ERROR OCCURED :("); 
			
			conn.close(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
	} 
}

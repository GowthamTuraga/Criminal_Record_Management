import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		{
			String take = null;
			Scanner in = new Scanner(System.in);
			
			do
			{
			int choice = 0 ;
			
			System.out.println("Welcome to Login Page:\n\nEnter Your GmailID");
			String user = in.next();
			Pattern p = Pattern.compile("^[a-z0-9._]{5,45}$");
			Matcher m = p.matcher(user);
			if(m.find())
			{
				System.out.println("Enter your Password:");
				String password = in.next();
				Pattern p1 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
				Matcher m1 = p1.matcher(password);
				if(m1.find() && m1.group().equals(password))
				{
					System.out.println("Sucessfully Completed login\n\nType 1 to Check Connection\nType 2 to Insert Data\nType 3 to View  Records\nType 4 to Update Records\nType 5 to Delete Records");
					choice = in.nextInt();
					switch(choice)
					{
					case 1:
						  connect conn = new connect();
						  conn.Connection();
						  System.out.println("\n");
					break;
					
					case 2 :
						insert ins = new insert();
						ins.insertion();
						System.out.println("\n");
						break;
					
					case 3 :
						view vw = new view();
						vw.viewing();
						System.out.println("\n");
						break;
						
					case 4 :
						update upd = new update();
						upd.updation();
						System.out.println("\n");
						break;

						
					case 5 :
						delete del = new delete();
						del.deletion();
						System.out.println("\n");
						break;
						
						default :
							System.out.println("Incorrect option");
							System.out.println("\n");
							break;
					
					}
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
			else
			{
				System.out.println("Invalid Username ");
			}
			System.out.println("Type Exit to return to the login page");
	           take = in.next();
		}while(take.equals("Exit"));
		
		in.close();
		}
		

	}

}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginClass extends FoodOrder {
	public Connection conn;
	public Statement stmt;
	String UserId;
	String Password;
	
public  LoginClass() {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","12345");
	stmt =conn.createStatement();
	}
	catch (SQLException  e) {
		// TODO: handle exception
		System.out.println(e);
	}
	catch (Exception  e) {
		// TODO: handle exception
		System.out.println(e);
	}
 
 

	
}	
public void Login()
{
	String  q="select * from users where userId = ? AND Password= ?";
	try {
		String user;
		String pass;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserId");
		user=sc.next();
		System.out.println("Enter Password");
		pass=sc.next();
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		pstmt.setString(1, user);
		pstmt.setString(2, pass);
		
		ResultSet  rSet=pstmt.executeQuery();
		if (rSet.next()) {
			System.out.println("Login Succesfull");
			menuDisplay();
			order();
			
		}
		else {
			System.out.println("Invalid UserId & Password");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}



public void Registration()  
{
	try {
		String q="Create table if not exists users(UserId varchar(20) primary key,Password varchar(20))" ;
		PreparedStatement p=conn.prepareStatement(q);
		p.executeUpdate();
	}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
		//User Through
		
		String q1="insert into users(UserId,Password)values(?,?)";
		PreparedStatement p1=conn.prepareStatement(q1);
		

		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter UserId");
		String UserId=b.readLine();
		System.out.println("Enter Password");
		String Password=b.readLine();
		p1.setString(1,UserId);
		p1.setString(2,Password);
		p1.executeUpdate();
		System.out.println("User registered successfully");
		System.out.println("=====================================");
		System.out.println("Please Login");
//		b.close();
	
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}








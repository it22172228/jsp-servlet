package project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtill {
	
	boolean issuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<User> getUser(String emailu)
{
	ArrayList<User>cus = new ArrayList<>();
	
	try {
		
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "select * from customer where email='"+emailu+"'";
			rs = stmt.executeQuery(sql); 
			
		 	while(rs.next()) {
			String name = rs.getString(1);
			String email = rs.getString(2);
		    String mobileNumber = rs.getString(3);
			String password = rs.getString(4);
			String address = rs.getString(5);
			
			User c = new User(name, email, mobileNumber , password, address);
			cus.add(c);
			
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return cus;
}

	public static boolean validate(String email,String password)
	{
		boolean issuccess = false;
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "select * from customer where email ='"+email+"'and password ='"+password+"'";
			 rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				issuccess = true;
			}
			else {
				issuccess = false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issuccess;
		

	}
	
	public static boolean updatePW(String email, String password)
	{
          boolean issuccess = false; 
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "update customer set password = '"+password+"'"
			+ "where email = '"+email+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				issuccess = true;
			}
			else {
				issuccess = false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issuccess;
		
		
	}
	
	public static boolean validateSignup(String email)
	{
		boolean issuccess = false;
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "select * from customer where email='"+email+"'";
			 rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				issuccess = true;
			}
			else {
				issuccess = false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issuccess;
		

	}
	
	public static boolean insertuser(String name,String email,String mobileNumber,String password,String address)
	{
		boolean issuccess = false;
		
		
		
	try {
		
		con =  DBConnection.getCon();
		stmt= con.createStatement();
		String sql = "insert into customer values ('"+name+"','"+email+"','"+mobileNumber+"','"+password+"','"+address+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0)
		{
			issuccess = true;
		}
		else {
			issuccess = false;
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return issuccess;
	

	}
	
	public static boolean addEmployee(String eid,String name,String email,String address,String phone ,String department)

	{
		boolean issuccess = false;
		
		
		
	try {
		
		con =  DBConnection.getCon();
		stmt= con.createStatement();
		String sql = "insert into Employee values ('"+eid+"','"+name+"','"+email+"','"+address+"','"+phone+"','"+department+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0)
		{
			issuccess = true;
		}
		else {
			issuccess = false;
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return issuccess;
	

	}


	
	public static boolean updateUser(String name,String email,String mobileNumber,String address, String password)
	{
          boolean issuccess = false; 
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "update customer set name = '"+name+"', address='"+address+"',mobileNumber ='"+mobileNumber+"',password = '"+password+"'"
			+ "where email = '"+email+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				issuccess = true;
			}
			else {
				issuccess = false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issuccess;
		
		
	}
	
	public static List<User> getUserDetails(String emailu)
	{
         ArrayList<User>cus = new ArrayList<>();
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "select * from customer where email='"+emailu+"'";
			 rs = stmt.executeQuery(sql); 
			
			while(rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String mobileNumber = rs.getString(3);
				String password = rs.getString(4);
				String address = rs.getString(5);
				
				User c = new User(name, email, mobileNumber , password, address);
				cus.add(c);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cus;
	}


	

	
	
	
	public static boolean deleteUser(String email)
	{
         boolean issuccess = false; 
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "delete from customer where email = '"+email+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				issuccess = true;
			}
			else {
				issuccess = false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issuccess;
	}
	



}

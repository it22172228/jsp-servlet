package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import project.DBConnection;

public class AdminDBUtil {
	
	boolean issuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
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

	
	public static boolean updateEmployee(String eid,String name,String email,String address,String phone ,String department)
	{
		boolean issuccess = false; 
		
		
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "update Employee set Name = '"+name+"',Email ='"+email+"', Address='"+address+"',Mobile ='"+phone+"',Department = '"+department+"'"
			+ "where eid = '"+eid+"'";
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


	public static boolean deleteEmployee(String email)
	{
         boolean issuccess = false; 
         
		
		try {
			
			con =  DBConnection.getCon();
			stmt= con.createStatement();
			String sql = "delete from Employee where Email = '"+email+"'";
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

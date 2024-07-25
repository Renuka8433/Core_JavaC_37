import java.util.*;
import java.sql.*;
public class Jdbcdemo {
	public static void main(String[]args) throws Exception
	{
		
		readRecords();
	   insertRecord();
	    insertVar();
	    insertUsingPst();
	    delete();
		
	}
	public static void readRecords()throws Exception
	{
	    
	String url="jdbc:mysql://localhost:3306/Jdbcdemo";
	String username="root";
	String password="Renu23@#";
	Connection con=DriverManager.getConnection(url,username,password);
	
	
	//statement and query
	String query="select*from employee";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	System.out.println("id is"+rs.getInt(1));
	System.out.println("name is"+rs.getString(2));
	System.out.println("salary is"+rs.getInt(3));
	con.close();
	}
	
	//insert query
	public static void insertRecord()throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String passWord ="Renu23@#";
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
		
		String query="insert into  employee values(36,'Gugan',250000)";
		Statement st=  con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: "+rows);
		con.close();
	}
	

	//insert with variables
	public static void insertVar() throws Exception
	{
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "Renu23@#";
		
		int id=39;
		String name = "Varun";
		int salary = 300000;
		
		// "insert into employee values(4,'varun',300000);"
		String query = "insert into employee values (" + id + ",'" + name + "'," + salary + ");";

		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: " + rows);		
		con.close();
	}
	//insert with prepared statement
	public static void insertUsingPst() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "Renu23@#";
		
		int id=17;
		String name = "Nila";
		int salary = 300000;
		
		// "insert into employee values(5,'varun',300000);"
		String query = "insert into employee values (?,?,?);";

		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();
		
		System.out.println("Number of rows affected: " + rows);	
		con.close();
		
	}
	//delete
	public static void delete() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "Renu23@#";
		
		int id=5;

		String query = "delete from employee where emp_id = " + id;

		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: " + rows);		
		con.close();
	}
	
		
	
}


		
	
	
	



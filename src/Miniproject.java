import java.util.*;
import java.sql.*;
public class Miniproject {
       //Read
	   public static void read()throws Exception {
	    String url="jdbc:mysql://localhost:3306/miniproject";
		String username="root";
		String password="Renu23@#";
		Connection con=DriverManager.getConnection(url,username,password);
		
		String query="select*from employee";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
	
		System.out.println("emp_id is:"+rs.getInt(1));
		System.out.println("name is:"+rs.getString(2));
		System.out.println("email_is is:"+rs.getString(3));
		System.out.println("job description is:"+rs.getString(4));
		System.out.println("salary is:"+rs.getInt(5));
		con.close();
		
		}
       //insert 
	    public static void insert()throws Exception{
		String url = "jdbc:mysql://localhost:3306/miniproject";
		String userName = "root";
		String passWord = "Renu23@#";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emp_id");
		int emp_id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the name");
		String name =s.nextLine();
		System.out.println("Enter the email_id");
		String email_id=s.nextLine();
		System.out.println("Enter the jobdescription");
		String job_description=s.nextLine();
		System.out.println("Enter the salary");
		int salary =s.nextInt();
	    String query = "insert into employee values (?,?,?,?,?);";
        Connection con = DriverManager.getConnection(url,userName,passWord);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, emp_id);
		pst.setString(2, name);
		pst.setString(3,email_id);
		pst.setString(4,job_description);
		pst.setInt(5, salary);
		int rows = pst.executeUpdate();
		System.out.println("Number of rows affected: " + rows);	
		con.close();
		}
	//delete
    public static void delete() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/miniproject";
		String userName = "root";
		String passWord = "Renu23@#";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emp_id");
		int emp_id=s.nextInt();
		String query="delete from employee where emp_id = " + emp_id;
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected: " + rows);		
		con.close();
	}
	public static void update()throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/miniproject";
		String userName = "root";
		String passWord = "Renu23@#";
		System.out.println("1.change name \n 2.change email_id \n 3.change job_description \n 4.change salary");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		switch(c) {
		case 1:
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("enter the emp_id");
			int emp_id=sc.nextInt();
			String query="update employee set name='"+name+"'where emp_id="+emp_id;
			Connection con = DriverManager.getConnection(url,userName,passWord);
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			System.out.println("Number of rows affected: " + rows);		
			con.close();
			break;
		case 2:
			Scanner sca=new Scanner(System.in);
			System.out.println("enter the email_id");
			String email_id=sca.nextLine();
			System.out.println("enter the emp_id");
			int emp_id1=sca.nextInt();
			String query1="update employee set email_id='"+email_id+"'where emp_id="+emp_id1;
			Connection con1 = DriverManager.getConnection(url,userName,passWord);
			Statement st1 = con1.createStatement();
			int rows1= st1.executeUpdate(query1);
			System.out.println("Number of rows affected: " + rows1);		
			con1.close();
			break;
		case 3:
			Scanner sca1=new Scanner(System.in);
			System.out.println("enter the job_description");
			String job_description=sca1.nextLine();
			System.out.println("enter the emp_id");
			int emp_id2=sca1.nextInt();
			String query2="update employee set job_description='"+job_description+"'where emp_id="+emp_id2;
			Connection con2 = DriverManager.getConnection(url,userName,passWord);
			Statement st2 = con2.createStatement();
			int rows2= st2.executeUpdate(query2);
			System.out.println("Number of rows affected: " + rows2);		
			con2.close();
			break;
		case 4:
			Scanner sca2=new Scanner(System.in);
			System.out.println("enter the salary");
			int salary=sca2.nextInt();
			System.out.println("enter the emp_id");
			int emp_id3=sca2.nextInt();
			String query3="update employee set salary='"+salary+"'where emp_id="+emp_id3;
			Connection con3 = DriverManager.getConnection(url,userName,passWord);
			Statement st3 = con3.createStatement();
			int rows3= st3.executeUpdate(query3);
			System.out.println("Number of rows affected: " + rows3);		
			con3.close();
			break;
			
		}
		
		
		
	}
	public static void main(String []args)throws Exception
	{
		Scanner c1=new Scanner(System.in);
		System.out.println("Do you want to Execute\n1.yes\n 2.no");
		int i=c1.nextInt();
		while(i==1) 
		{
		 System.out.println("1.Read\n 2.Insert\n 3.Delete\n 4.Update");
	   Scanner c=new Scanner(System.in);
      System.out.println("Enter the option");
      int n=c.nextInt();
     switch(n) {
      case 1:
    	  read();
    	  break;
      case 2:
    	  insert();
    	  break;
      case 3:
    	  delete();
    	  break;
      case 4:
    	  update();
    	  break;
      default:
    	  System.out.println("enter the valid number");
     }
     

     System.out.println("Do you want to Execute Again\n1.yes\n2.n0");
     i=c1.nextInt();
		}
		System.out.println("task completed");
		c1.close();
     
    }
	
}


	
	




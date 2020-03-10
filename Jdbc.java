package activity;
import java.lang.Class;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

public static void main(String []args) throws ClassNotFoundException, SQLException
{
	
		Class.forName("org.h2.Driver");
		Driver d =new org.h2.Driver();
	//	DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test;user=sa");
		Statement smt=con.createStatement();
		String str="SELECT * FROM CUSTOMERS";
	//	String ins="Insert into CUSTOMERS values(6,'adam','34','coimbatore','12000')";
		//int count=smt.executeUpdate(ins);
		ResultSet rs=smt.executeQuery(str);
		//	System.out.println("umber of rows inserted is"+ count);
		System.out.println("id1     name     age    address    salary");
	while(rs.next())
	{
		String id1=rs.getString("id");
		String name1=rs.getString("NAME");
		String age1=rs.getString("AGE");
		String address=rs.getString("ADDRESs");
		String salary=rs.getString("SALARY");
		System.out.println(id1+"\t" +name1+"\t" +age1+"\t"+address+"\t " +salary);
		
	}
	//String del="DELETE FROM CUSTOMERS WhERE ID='7'";
	//int delete=smt.executeUpdate(del);
	//System.out.println("the number of rows delted is "+delete);
	//String mod="UPDATE CUSTOMERS SET ADDRESS='madurai' WHERE ID='5'";
	//int modify=smt.executeUpdate(mod);

	
}
	
	
}

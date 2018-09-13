package datastructure;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

public class UseArrayList {


	public static Connection connect=null;
	public static Statement statement=null;
	public static PreparedStatement ps=null;
	public static ResultSet rs=null;

	public static Properties loadproperties()throws IOException {
		Properties prop=new Properties();
		InputStream ism=new FileInputStream("src/secret.properties");
		prop.load(ism);
		ism.close();
		return prop;

	}
	public static Connection connectMySql() throws Exception{
		Properties prop=loadproperties();
		String driverClass=prop.getProperty("MYSQLJDBC.driver");
		String url=prop.getProperty("MYSQLJDBC.url");
		String username=prop.getProperty("MYSQLJDBC.userName");
		String password=prop.getProperty("MYSQLJDBC.password");
		Class.forName(driverClass);
		connect= DriverManager.getConnection(url,username,password);

		System.out.println("Database is Connected");
		return connect;

	}

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<String> stName1 = new ArrayList<String>();
		stName1.add("AMI");
		stName1.add("TMI");
		stName1.add("SE");
		stName1.add("TAHARA");
		stName1.add("ammmm");
		List<Integer> stID2 = new ArrayList<Integer>();
		stID2.add(101);
		stID2.add(102);
		stID2.add(103);
		stID2.add(104);
		List<String> stDOB3 = new ArrayList<String>();
		stDOB3.add("1=02-1988");
		stDOB3.add("2-4-1942");
		stDOB3.add("3-4-1983");
		stDOB3.add("5-1-1535");

		Map<String,List<String>>stName11=new HashMap<String, List<String>>();
		stName11.put("stName",stName1);

		Map<String,List<Integer>>stName22=new HashMap<String, List<Integer>>();
		stName22.put("stID",stID2);

		Map<String,List<String>>stName33=new HashMap<String, List<String>>();
		stName33.put("stDOB",stDOB3);




		/*Iterator it = stName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for (String S : stName) {
			System.out.println("Listed Names are -:" +stName);
		}*/

		try{
			Connection myCon=connectMySql();
			statement=myCon.createStatement();
			ps=connect.prepareStatement("insert into students Values "+stName11+","+stName22+","+stName33);
			ps.executeUpdate();
			rs=statement.executeQuery("select*from students");
			while(rs.next()){
				System.out.println("Data "+rs.getString("stName")+" "+rs.getString("stID")+" "+rs.getString("stDOB"));
			}
		}catch(Exception e)
		{e.printStackTrace();}

	}
}


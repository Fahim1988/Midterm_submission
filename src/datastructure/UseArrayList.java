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
		List<String> list = new ArrayList<String>();
		list.add("AMI");
		list.add("TMI");
		list.add("SE");
		list.add("TAHARA");
		list.remove(2);

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for (String S : list) {
			System.out.println("Listed Names are -:" + S);
		}

		try{
			Connection myCon=connectMySql();
			statement=myCon.createStatement();
			ps=connect.prepareStatement("insert into students Values('KBM Siddique',103,'02-13-1981')");
			ps.executeUpdate();
			rs=statement.executeQuery("select*from students");
			while(rs.next()){
				System.out.println("Data "+rs.getString("st_name")+" "+rs.getString("st_ID")+" "+rs.getString("st_DOB"));
			}
		}catch(Exception e)
		{e.printStackTrace();}

	}
}


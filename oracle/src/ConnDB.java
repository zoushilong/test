

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConnDB {
	
	
	
	
//	static String driver="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	static String name="scott";
	static String pass="tiger";
	//开始实现代码重用
	static Connection conn1 =null;
	public static void main(String[] args)
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("注册驱动类成功");
			conn1=DriverManager.getConnection(url, name, pass);
		    System.out.println("数据库连接成功");
		} catch (Exception e)
		{
			System.out.println("数据库连接失败");
		}
	}
	
	
}
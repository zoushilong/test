

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
	//��ʼʵ�ִ�������
	static Connection conn1 =null;
	public static void main(String[] args)
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("ע��������ɹ�");
			conn1=DriverManager.getConnection(url, name, pass);
		    System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e)
		{
			System.out.println("���ݿ�����ʧ��");
		}
	}
	
	
}
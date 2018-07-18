package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class DataAccess {
	public static String xmlPath = "database.conf.xml";
	public static String xsdPath = "database.conf.xsd";
	public static String driver = null;
	public static String url = null;
	public static String user = null;
	public static String password = null;
	public static Connection conn=null;
	public static Connection getConnection() {
		if (XmlValidator.validator(xmlPath, xsdPath)){
			HashMap<String,String> hm = XmlParser.parser(xmlPath);
			driver = hm.get("driver");
			url = hm.get("url");
			user = hm.get("user");
			password = hm.get("password");
		}else{
			System.out.println("��֤���ɹ�");
		}
		//------------------------------------------
		
		
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			
			
		}catch (ClassNotFoundException e) {
			System.out.println("�ļ��Ҳ�����������ܳ�����mysql��jar��û������");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("���ӳ���");
				e.printStackTrace();
			}
		return conn;
	}
	public static void closeConnection(Connection conn){
		try{
			if(conn!=null)
				conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}

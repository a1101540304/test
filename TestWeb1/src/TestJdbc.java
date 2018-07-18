import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DataAccess;

public class TestJdbc {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from score");
			while(rs.next()){
				System.out.println(rs.getString("userid"));
				System.out.println(rs.getInt("coursescore"));
			}
			
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(rs!=null)
					    rs.close();
					if(stat!=null)
					    stat.close();
					if(conn!=null)
	    		        conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			}
	}
}

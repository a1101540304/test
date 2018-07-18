package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dto.User;
import util.DataAccess;

public class UserDao {
	public String login(String username,String password){
		//连接数据库，判断对应的用户名和密码是否正确,并取出对应用户的权限值
		String superuser = null;
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs = null;
		try {
			conn=DataAccess.getConnection();
			prep=conn.prepareStatement("select * from user where UserID = ? and password = ?");
			
			prep.setString(1, username);
			prep.setString(2, password); 
			rs = prep.executeQuery();
			if (rs.next()){
				superuser = rs.getString("superuser");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
				    rs.close();
				if(prep!=null)
				    prep.close();
				if(conn!=null)
    		        conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		
		
		
		return superuser;
		/*String un = username;
		String pw = password;
		if(un.equals("123")&&pw.equals("123"))
		    return true;
		else
			return false;*/
		/*boolean flag = false;
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		Statement stmt = null;
		PreparedStatement prep=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			String sql ="select * from user where username= '"+username+"' and password='"+password+"'";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				flag = true;
				}
			//flag = true;
		}catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if(prep!=null)
					    prep.close();
					if(conn!=null)
	    		        conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		 return flag;*/
	}
	
	
	public String name(String username){
		//连接数据库，判断对应的用户名和密码是否正确,并取出对应用户的权限值
		String Username = null;
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs = null;
		try {
			conn=DataAccess.getConnection();
			prep=conn.prepareStatement("select * from user where UserID = ?");
			
			prep.setString(1, username); 
			rs = prep.executeQuery();
			if (rs.next()){
				Username = rs.getString("UserName");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
				    rs.close();
				if(prep!=null)
				    prep.close();
				if(conn!=null)
    		        conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}		
		return Username;
	}
	
	public String idid(String username,String password){
		//连接数据库，判断对应的用户名和密码是否正确,并取出对应用户的权限值
		String userid = null;
		Connection conn=null;
		PreparedStatement prep=null;
		ResultSet rs = null;
		try {
			conn=DataAccess.getConnection();
			prep=conn.prepareStatement("select * from user where UserID = ? and password = ?");
			
			prep.setString(1, username);
			prep.setString(2, password); 
			rs = prep.executeQuery();
			if (rs.next()){
				userid = rs.getString("UserID");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
				    rs.close();
				if(prep!=null)
				    prep.close();
				if(conn!=null)
    		        conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return userid;
	}
	
	public boolean register(User u){
		boolean flag = false;
		Connection conn=null;
		PreparedStatement prep=null;
		try {
			conn=DataAccess.getConnection();
			prep=conn.prepareStatement("insert into User values(?,?,?,?)");
			
			prep.setString(1, u.getUserID());
			prep.setString(2, u.getUserName());
			prep.setInt(3, u.getSuperuser());
			prep.setString(4, u.getPassword());
			prep.execute();
			flag = true;
		}catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if(prep!=null)
					    prep.close();
					if(conn!=null)
	    		        conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		 return flag;
	}
	
	public User getUserInfoById(String id){
		User m=new User();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from User where UserID='"+id+"'");
			
			while(rs.next()){
				m.setUserID(rs.getString("UserID"));
				m.setUserName(rs.getString("UserName"));
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
		return m;
	}
	/*
	 * 
	 */
	public Vector<User> getAllUser(){
		Vector<User> v=new Vector<User>();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from User");
			
			while(rs.next()){
				User m=new User();
				m.setUserID(rs.getString("UserID"));
				m.setUserName(rs.getString("UserName"));
				m.setSuperuser(rs.getInt("superuser"));
				m.setPassword(rs.getString("password"));
				v.add(m);
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
		return v;
	}
	public static boolean updataUser(String id,User usr)
	{
		Connection conn=DataAccess.getConnection();
		int count=0;
		try
		{
			conn.setAutoCommit(false);
			String sql="update user set password=? where UserID=?";
			PreparedStatement prep=(PreparedStatement) conn.prepareStatement(sql);
			prep.setString(1, usr.getPassword());
			prep.setString(2, id);
			count=prep.executeUpdate();
			conn.commit();
			DataAccess.closeConnection(conn);
		}
		catch(Exception e)
		{
			try
			{
				conn.rollback();
			}
			 catch (SQLException e1) 
			{
					e1.printStackTrace();
			}
		}
		if(count==0)
			return false;
		return true;
	}
	
	public boolean deleteuser(String id){
		boolean flag = false;
		Connection conn = null;
		Statement stat = null;
		try { 
			conn = DataAccess.getConnection();
			stat = conn.createStatement();//创建SQL语句对象并执行
			String sql = "delete from Buy where userid = '"+id+"'";
			String sql1 = "delete from User where userid = '"+id+"'";
			stat.executeUpdate(sql);
			stat.executeUpdate(sql1);
			flag = true;
		} catch (SQLException e) {
			System.out.println("运行SQL语句时出现错误");
			e.printStackTrace();
		} finally{
			try {
				if(stat!=null){
					stat.close();
					stat=null;
				}	    
				if(conn!=null){
					conn.close();
					conn=null;
				}									
			} catch (SQLException e) {
				System.out.println("关闭连接、语句及结果集总是出现错误");
				e.printStackTrace();
			}
		}	
		return flag;		
	}
	
	public boolean deleteallbuy(String id){
		boolean flag = false;
		Connection conn = null;
		Statement stat = null;
		try { 
			conn = DataAccess.getConnection();
			stat = conn.createStatement();//创建SQL语句对象并执行
			String sql = "delete from Buy where merchID = '"+id+"'";
			stat.executeUpdate(sql);
			flag = true;
		} catch (SQLException e) {
			System.out.println("运行SQL语句时出现错误");
			e.printStackTrace();
		} finally{
			try {
				if(stat!=null){
					stat.close();
					stat=null;
				}	    
				if(conn!=null){
					conn.close();
					conn=null;
				}									
			} catch (SQLException e) {
				System.out.println("关闭连接、语句及结果集总是出现错误");
				e.printStackTrace();
			}
		}	
		return flag;		
	}
}



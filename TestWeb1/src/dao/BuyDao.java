package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dto.Buy;
import dto.MerchInfo;
import dto.User;
import util.DataAccess;

public class BuyDao {
	public Vector<Buy> findAllBuy(){
		Vector<Buy> b = new Vector<Buy>();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs = null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs = stat.executeQuery("select * from Buy");
			while(rs.next()){
				Buy bu = new Buy();
				bu.setMerchID(rs.getString("merchID"));
				bu.setMerchName(rs.getString("merchName"));
				bu.setUserID(rs.getString("userID"));
				bu.setUserName(rs.getString("userName"));
				bu.setMerchPrice(rs.getInt("merchPrice"));
				b.add(bu);
			}
		}catch (SQLException e) {
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
				e.printStackTrace();
			} 
		}
		
		
		return b;
	}
	
	public boolean insertbuy(Buy u){
		boolean flag = false;
		Connection conn=null;
		PreparedStatement prep=null;
		try {
			conn=DataAccess.getConnection();
			prep=conn.prepareStatement("insert into Buy values(?,?,?,?,?)");
			prep.setString(1, u.getMerchID());
			prep.setString(2, u.getMerchName());
			prep.setString(3, u.getUserID());
			prep.setString(4, u.getUserName());
			prep.setInt(5, u.getMerchPrice());
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
	
	public static Boolean getBuyInfoById(String id1,String id2,String id3,String id4,int id5){
		Buy b=new Buy();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		PreparedStatement prep=null;
		Boolean flag = false;
		try {
			conn=DataAccess.getConnection();
//			stat=conn.createStatement();
//			rs=stat.executeQuery("insert into buy values(?,?,?,?,?)");//("insert into buy values('"+id1+"','"+id2+"','"+id3+"','"+id4+"','"+id5+"'");
			prep=conn.prepareStatement("insert into Buy values(?,?,?,?,?)");
			prep.setString(1, id1);
			prep.setString(2, id2);
			prep.setString(3, id3);
			prep.setString(4, id4);
			prep.setInt(5, id5);
			rs = prep.executeQuery();
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
		//return b;
		return flag;
	}
	/*
	 * 
	 */
	public Vector<Buy> getAllBuy(String name){
		Vector<Buy> v=new Vector<Buy>();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from Buy where UserName='"+name+"'");
			
			while(rs.next()){
				Buy m=new Buy();
				m.setMerchID(rs.getString("merchid"));
				m.setMerchName(rs.getString("MerchName"));
				m.setUserID(rs.getString("userid"));
				m.setUserName(rs.getString("UserName"));
				m.setMerchPrice(rs.getInt("MerchPrice"));
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
	/*
	 * 
	 */
	
	
	public Buy getBuyId(String id){
		Buy m=new Buy();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from Buy where UserID='"+id+"'");
			
			while(rs.next()){
				m.setMerchID(rs.getString("MerchID"));
				m.setMerchName(rs.getString("MerchName"));
				m.setUserID(rs.getString("UserID"));
				m.setUserName(rs.getString("UserName"));
				m.setMerchPrice(rs.getInt("MerchPrice"));
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
	
	
	public boolean deletebuy(String id){
		boolean flag = false;
		Connection conn=null;
		PreparedStatement prep=null;
		conn=DataAccess.getConnection();
		int count=0;
		try
		{
			conn.setAutoCommit(false);
			String sql="delete from Buy where UserID = ?";
			prep=(PreparedStatement) conn.prepareStatement(sql);
			prep.setString(1, id);
			count=prep.executeUpdate();
			conn.commit();
			DataAccess.closeConnection(conn);
		}catch(Exception e)
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
	
	
	public boolean deletecommodity(String id){
		boolean flag = false;
		Connection conn=null;
		PreparedStatement prep=null;
		conn=DataAccess.getConnection();
		int count=0;
		try
		{
			conn.setAutoCommit(false);
			String sql1="delete from Buy where merchID = ?";
			prep=(PreparedStatement) conn.prepareStatement(sql1);
			prep.setString(1, id);
			count=prep.executeUpdate();
			conn.commit();
			DataAccess.closeConnection(conn);
		}catch(Exception e)
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

	


	public static Vector<String> vt1=new Vector<String>();
	public static boolean deleteUser(String id)
	{
		Connection conn=DataAccess.getConnection();
		int count=0;
		String sql=null;
		PreparedStatement prep = null;
		try
		{
			conn.setAutoCommit(false);
			sql="update Buy set MerchID=?,UserID=?,MerchName=?,UserName=? where UserID=?;";
			prep=(PreparedStatement) conn.prepareStatement(sql);
			prep.setString(1, "");
			prep.setString(2, "");
			prep.setString(3, "");
			prep.setString(4, "");
			//prep.setString(5, "");
			prep.setString(5, id);
			vt1.add(id);
			count =prep.executeUpdate();
			conn.commit();
			DataAccess.closeConnection(conn);
		}
		catch(Exception e)
		{
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
		if(count==0)
			return false;
		return true;
	}
}








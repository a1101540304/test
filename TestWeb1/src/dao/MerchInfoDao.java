package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dto.MerchInfo;
import dto.User;
import util.DataAccess;

public class MerchInfoDao {
	public MerchInfo getMerchInfoById(String id){
		MerchInfo m=new MerchInfo();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from MerchInfo where MerchID='"+id+"'");
			
			while(rs.next()){
				m.setMerchID(rs.getString("MerchID"));
				m.setMerchName(rs.getString("MerchName"));
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
	/*
	 * 
	 */
	public Vector<MerchInfo> getAllMerchInfo(){
		Vector<MerchInfo> v=new Vector<MerchInfo>();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from MerchInfo");
			
			while(rs.next()){
				MerchInfo m=new MerchInfo();
				m.setMerchID(rs.getString("MerchID"));
				m.setMerchName(rs.getString("MerchName"));
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
	
	public static boolean updataMerchInfo(String id,MerchInfo usr)
	{
		Connection conn=DataAccess.getConnection();
		int count=0;
		try
		{
			conn.setAutoCommit(false);
			String sql="update MerchInfo set MerchPrice =? where MerchID =?";
			PreparedStatement prep=(PreparedStatement) conn.prepareStatement(sql);
			prep.setInt(1, usr.getMerchPrice());
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
	public MerchInfo getMerchInfoName(String id){
		MerchInfo m=new MerchInfo();
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try {
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
			rs=stat.executeQuery("select * from MerchInfo where MerchName='"+id+"'");
			
			while(rs.next()){
				m.setMerchID(rs.getString("MerchID"));
				m.setMerchName(rs.getString("MerchName"));
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
}



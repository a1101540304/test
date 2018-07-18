package test;

import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.util.Vector;

import dao.BuyDao;
import dao.MerchInfoDao;
import dao.UserDao;
import dto.Buy;
import dto.MerchInfo;
import dto.User;

public class Test {
	public static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("-------------------------------欢迎光临塔米商城--------------------------------");
		System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
		String str=in.next();
		while(!str.equals("#")){
		    switch(Integer.parseInt(str)){
		        case 1:getAll();break;
		        case 2:Search();break;
		        case 3:getBuy();break;
		        case 4:getAllMerch();break;
		        case 5:try {
					removeUser();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}break;
		        case 6:getUserInfoById();break;
		        case 7:getAllUser();break;
		        case 8:try {
					changeUser();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        //case 2:getMerchInfoById();break;
	        	//case 3:getAllMerchInfo();break;
	        	//case 4:getUserInfoById();break;
	        	//case 5:getAllUser();break;
        		default:System.out.println("");
    		}
		str=in.next();
		}
		System.out.println("-------------------结束----------------------");
	}
	public static void getAll(){
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
	    for(int i=1;i<=8;i++){
	    	m=mdao.getMerchInfoById("m0"+i);
	    	System.out.println(m.getMerchID()+"           "+m.getMerchName());
	    	System.out.println("                                          商品价格："+m.getMerchPrice()+"元");
	    }
	    System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
	}
	public static void Search(){
		System.out.println("请选择：1.根据编号选择 2.根据商品名选择");
		String str=in.next();
		while(!str.equals("#")){
		    switch(Integer.parseInt(str)){
		        case 1:getMerchInfoById();break;
	        	case 2:getMerchInfoName();break;
        		default:System.out.println("chongxin");
    		}
		}
	}
	public static void getMerchInfoById(){
		System.out.println("---------输入商品编号(m01~m08),输入#结束----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getMerchInfoById(str);
			if(m.getMerchName()!=null)
			    System.out.println(m.getMerchName()+"          "+m.getMerchPrice()+"元");
			else
				System.out.println("---------找不到该商品----------");
			str=in.next();
		}
		System.out.println("-------------查找商品结束--------------");
		while(str.equals("#"))
			main(null);
	}
    public static void getMerchInfoName(){
    	System.out.println("---------输入商品名,输入#结束----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getMerchInfoName(str);
			if(m.getMerchID()!=null)
			    System.out.println(m.getMerchID()+"          "+m.getMerchPrice()+"元");
			else
				System.out.println("---------找不到该商品----------");
			str=in.next();
		}
		System.out.println("-------------查找商品结束--------------");
		while(str.equals("#"))
			main(null);
	}
    public static void getBuy(){
		System.out.println("---------请输入要购买的商品编号(m01~m08)----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str1=in.next();//商品编号
		while(!str1.equals("#")){
			m=mdao.getMerchInfoById(str1);
			if(m.getMerchID()!=null){
			    System.out.println("请问您是否要购买 "+m.getMerchName()+ "？（输入Y或N）");
			    String stry=in.next();//购买
			    if(stry.equals("Y")||stry.equals("y")){
			    	System.out.println("---------请输入您的购物号--------");
			    	UserDao udao=new UserDao();
			    	User u=new User();
			    	String strg=in.next();//购物号
			    	while(!strg.equals("#")){
			    		u=udao.getUserInfoById(strg);
			    		if(u.getUserID()!=null)
			    		{
			    		    System.out.println(u.getUserID()+"        "+u.getUserName());
			    		    System.out.println("请确认您是否是 "+u.getUserName()+ "本人？（输入Y或N）");
			    		    String strr=in.next();//确认本人
				    		if(strr.equals("Y")||strr.equals("y")){
				    			System.out.println("--------出单成功！---------");
				    			PutIn(str1,strg);
				    			main(null);
				    		}
				    		else{
				    			break;
					    		//main(null);
				    		}
				    			
			    		}
			    		else
			    			System.out.println("---------购物号错误----------");
			    		System.out.println("-----请重新输入您的购物号，或输入#结束-------");
			    		strg=in.next();
			    }
			    	
			    }
			    else
			  		main(null);
			    }
			else{
				System.out.println("--------商品编号错误----------");
				main(null);
				}
		}
    }
    public static void PutIn(String p1,String p2){
    	MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		m=mdao.getMerchInfoById(p1);
		String m2=m.getMerchName();
		int m3=m.getMerchPrice();
		UserDao udao=new UserDao();
    	User u=new User();
    	u=udao.getUserInfoById(p2);
    	String u2=u.getUserName();
    	BuyDao bdao=new BuyDao();
    	bdao.getBuyInfoById(p1,m2,p2,u2,m3);
    }
    public static void getAllMerch(){
    	System.out.println("---------请输入您的购物号,输入#结束--------");
		BuyDao mdao=new BuyDao();
    	Vector<Buy> m=new Vector<Buy>();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getAllBuy(str);
			if(m!=null){
				int a=0;
				for(Buy st : m)
				{
				    System.out.println(st.getMerchName()+"          "+st.getMerchPrice()+"元");
				    a=a+st.getMerchPrice();
				}
				System.out.println("您好，您的账单总计为："+a+"元");
				str=in.next();
			}else
			System.out.println("---------找不到----------");
		}
		System.out.println("-------------查找商品结束--------------");
		while(str.equals("#"))
			main(null);
    }
public static void getUserInfoById(){
	System.out.println("---------请输入ID,输入#结束----------");
	UserDao udao=new UserDao();
	User u=new User();
	String str=in.next();
	while(!str.equals("#")){
		u=udao.getUserInfoById(str);
		if(u.getUserID()!=null)
		    System.out.println(u.getUserName());
		else
			System.out.println("---------找不到该用户----------");
		str=in.next();
	}
	System.out.println("-------------查找商品结束--------------");
	System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
}
public static void getAllUser(){
	UserDao udao=new UserDao();
	Vector<User> v2=new Vector<User>();
	User m=new User();
	v2=udao.getAllUser();
	if(v2!=null){
		for(User st : v2)
		    System.out.println(st.getUserID()+"        "+st.getUserName());
		//in.next();
		System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
	}else
		System.out.println("---------找不到----------");
}

	public static void removeUser() throws Exception
    {
		Scanner in =new Scanner(System.in);
		BuyDao bdao=new BuyDao();
		Buy b=new Buy();
		System.out.println("请输入要删除的编号：");
		String id=in.next();
		b=bdao.getBuyId(id);
		//System.out.println(b.getMerchID());
		if(bdao.getBuyId(id)==null){
			System.out.println("ID不存在！");
			return;
		}
		if(b.getMerchID()!=null)
		{
			bdao.deleteUser(id);
			//System.out.println(b.getMerchID());
			System.out.println("删除成功！");
		}
		else
			System.out.println("删除失败！");
		//System.out.println(b.getMerchID());
		System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
	}
	
	public static void changeUser() throws Exception
	{
		Scanner in =new Scanner(System.in);
		UserDao udao=new UserDao();
		System.out.println("--------请输入要修改的ID---------");
		String id=in.next();
		if(udao.getUserInfoById(id)==null){
			System.out.println("--------ID不存在！--------");
			return;
		}
		System.out.println("--------请输入新的用户名-------");
		User usr=new User();
		usr.setUserName(in.next());
		if(udao.updataUser(id, usr))
			System.out.println("--------修改成功！-------");
		else
			System.out.println("---------修改失败！---------");
		System.out.println("请选择：1.商品一览表 2.查找商品 3.购买商品 4.查找购物车5.删除购买记录6.用户搜索7.用户一览表8.修改用户信息");
	}
}
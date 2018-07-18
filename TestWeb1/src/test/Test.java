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
		System.out.println("-------------------------------��ӭ���������̳�--------------------------------");
		System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
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
		System.out.println("-------------------����----------------------");
	}
	public static void getAll(){
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
	    for(int i=1;i<=8;i++){
	    	m=mdao.getMerchInfoById("m0"+i);
	    	System.out.println(m.getMerchID()+"           "+m.getMerchName());
	    	System.out.println("                                          ��Ʒ�۸�"+m.getMerchPrice()+"Ԫ");
	    }
	    System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
	}
	public static void Search(){
		System.out.println("��ѡ��1.���ݱ��ѡ�� 2.������Ʒ��ѡ��");
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
		System.out.println("---------������Ʒ���(m01~m08),����#����----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getMerchInfoById(str);
			if(m.getMerchName()!=null)
			    System.out.println(m.getMerchName()+"          "+m.getMerchPrice()+"Ԫ");
			else
				System.out.println("---------�Ҳ�������Ʒ----------");
			str=in.next();
		}
		System.out.println("-------------������Ʒ����--------------");
		while(str.equals("#"))
			main(null);
	}
    public static void getMerchInfoName(){
    	System.out.println("---------������Ʒ��,����#����----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getMerchInfoName(str);
			if(m.getMerchID()!=null)
			    System.out.println(m.getMerchID()+"          "+m.getMerchPrice()+"Ԫ");
			else
				System.out.println("---------�Ҳ�������Ʒ----------");
			str=in.next();
		}
		System.out.println("-------------������Ʒ����--------------");
		while(str.equals("#"))
			main(null);
	}
    public static void getBuy(){
		System.out.println("---------������Ҫ�������Ʒ���(m01~m08)----------");
		MerchInfoDao mdao=new MerchInfoDao();
		MerchInfo m=new MerchInfo();
		String str1=in.next();//��Ʒ���
		while(!str1.equals("#")){
			m=mdao.getMerchInfoById(str1);
			if(m.getMerchID()!=null){
			    System.out.println("�������Ƿ�Ҫ���� "+m.getMerchName()+ "��������Y��N��");
			    String stry=in.next();//����
			    if(stry.equals("Y")||stry.equals("y")){
			    	System.out.println("---------���������Ĺ����--------");
			    	UserDao udao=new UserDao();
			    	User u=new User();
			    	String strg=in.next();//�����
			    	while(!strg.equals("#")){
			    		u=udao.getUserInfoById(strg);
			    		if(u.getUserID()!=null)
			    		{
			    		    System.out.println(u.getUserID()+"        "+u.getUserName());
			    		    System.out.println("��ȷ�����Ƿ��� "+u.getUserName()+ "���ˣ�������Y��N��");
			    		    String strr=in.next();//ȷ�ϱ���
				    		if(strr.equals("Y")||strr.equals("y")){
				    			System.out.println("--------�����ɹ���---------");
				    			PutIn(str1,strg);
				    			main(null);
				    		}
				    		else{
				    			break;
					    		//main(null);
				    		}
				    			
			    		}
			    		else
			    			System.out.println("---------����Ŵ���----------");
			    		System.out.println("-----�������������Ĺ���ţ�������#����-------");
			    		strg=in.next();
			    }
			    	
			    }
			    else
			  		main(null);
			    }
			else{
				System.out.println("--------��Ʒ��Ŵ���----------");
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
    	System.out.println("---------���������Ĺ����,����#����--------");
		BuyDao mdao=new BuyDao();
    	Vector<Buy> m=new Vector<Buy>();
		String str=in.next();
		while(!str.equals("#")){
			m=mdao.getAllBuy(str);
			if(m!=null){
				int a=0;
				for(Buy st : m)
				{
				    System.out.println(st.getMerchName()+"          "+st.getMerchPrice()+"Ԫ");
				    a=a+st.getMerchPrice();
				}
				System.out.println("���ã������˵��ܼ�Ϊ��"+a+"Ԫ");
				str=in.next();
			}else
			System.out.println("---------�Ҳ���----------");
		}
		System.out.println("-------------������Ʒ����--------------");
		while(str.equals("#"))
			main(null);
    }
public static void getUserInfoById(){
	System.out.println("---------������ID,����#����----------");
	UserDao udao=new UserDao();
	User u=new User();
	String str=in.next();
	while(!str.equals("#")){
		u=udao.getUserInfoById(str);
		if(u.getUserID()!=null)
		    System.out.println(u.getUserName());
		else
			System.out.println("---------�Ҳ������û�----------");
		str=in.next();
	}
	System.out.println("-------------������Ʒ����--------------");
	System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
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
		System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
	}else
		System.out.println("---------�Ҳ���----------");
}

	public static void removeUser() throws Exception
    {
		Scanner in =new Scanner(System.in);
		BuyDao bdao=new BuyDao();
		Buy b=new Buy();
		System.out.println("������Ҫɾ���ı�ţ�");
		String id=in.next();
		b=bdao.getBuyId(id);
		//System.out.println(b.getMerchID());
		if(bdao.getBuyId(id)==null){
			System.out.println("ID�����ڣ�");
			return;
		}
		if(b.getMerchID()!=null)
		{
			bdao.deleteUser(id);
			//System.out.println(b.getMerchID());
			System.out.println("ɾ���ɹ���");
		}
		else
			System.out.println("ɾ��ʧ�ܣ�");
		//System.out.println(b.getMerchID());
		System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
	}
	
	public static void changeUser() throws Exception
	{
		Scanner in =new Scanner(System.in);
		UserDao udao=new UserDao();
		System.out.println("--------������Ҫ�޸ĵ�ID---------");
		String id=in.next();
		if(udao.getUserInfoById(id)==null){
			System.out.println("--------ID�����ڣ�--------");
			return;
		}
		System.out.println("--------�������µ��û���-------");
		User usr=new User();
		usr.setUserName(in.next());
		if(udao.updataUser(id, usr))
			System.out.println("--------�޸ĳɹ���-------");
		else
			System.out.println("---------�޸�ʧ�ܣ�---------");
		System.out.println("��ѡ��1.��Ʒһ���� 2.������Ʒ 3.������Ʒ 4.���ҹ��ﳵ5.ɾ�������¼6.�û�����7.�û�һ����8.�޸��û���Ϣ");
	}
}
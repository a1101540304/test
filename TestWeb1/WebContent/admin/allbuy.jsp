<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    
<%@page import="java.util.*"%>
<%@page import="dto.*"%>
<%@page import="dao.*"%>
   
<% 
Vector v = (Vector)session.getAttribute("buy"); 
Vector<Buy> v1 =null;
BuyDao b = new BuyDao();
v=b.findAllBuy();
session=request.getSession();
session.setAttribute("buy", v1);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />  
</head>

<style>
body{font-family:Arial; font-size:14px;line-height:180%;padding-top: 20px;} /*�ܿ��ƣ��ɺ��Դ���*/
table tr:first-child{background:#ff8080; color:#fff;font-weight:bold;} 
.market {font-size: 24px;text-align: center;color: #F33;align:center;}
table{border-top:1pt solid #C1DAD7;border-left:1pt solid #C1DAD7;margin: 0 auto;} 
td{ padding:5px 10px; text-align:center;border-right:1pt solid #C1DAD7;border-bottom:1pt solid #C1DAD7;}
tr:nth-of-type(odd){ background:#F5FAFA;} /* odd ��ʶ�����У�even��ʶż���� */
tr:hover{ background: #E0F0F0;} /*�����ͣ����񱳾���ɫ*/


button{
  background:#ff8080;
  color:#fff;
  border:none;
  position:relative;
  height:60px;
  font-size:1.6em;
  padding:0 2em;
  cursor:pointer;
  transition:800ms ease all;
  outline:none;
}
button:hover{
  background:#fff;
  color:#ff8080;
}
button:before,button:after{
  content:'';
  position:absolute;
  top:0;
  right:0;
  height:2px;
  width:0;
  background: #ff8080;
  transition:400ms ease all;
}
button:after{
  right:inherit;
  top:inherit;
  left:0;
  bottom:0;
}
button:hover:before,button:hover:after{
  width:100%;
  transition:800ms ease all;
}
</style>


<body>
<p align="right"><%=session.getAttribute("username") %>����ӭ����<a href="/TestWeb1/login.jsp">�˳�</a></p>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;"><img src="images/01.png" width="50" height="50" align="absmiddle" />ƤƤϺ���</p>
</div>
<div id="a"><a href="admin.jsp"  class="button green">��ҳ</a><a href="searchuser.jsp" class="button green">�鿴�ͻ�</a><a href="allbuy.jsp" class="button green">�鿴���й��ﳵ��Ϣ</a><a href="allmerch.jsp" class="button green">�޸���Ʒ�۸�</a></div>
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>������
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="98%" />
</form>

    <table width='80%' border='0' cellspacing='0' cellpadding='0' align='center'>
    <tr>
      <td>��Ʒ���</td><td>��Ʒ����</td><td>�û�ID</td><td>�û���</td><td>�۸�</td><td>
    </tr>
<%
  		for(int i=0;i<v.size();i++){
  			Buy bo = (Buy)v.get(i);
    	%>
	<tr>
      <td><%=bo.getMerchID()%></td><td><%=bo.getMerchName()%></td><td><%=bo.getUserID()%></td>
      <td><%=bo.getUserName()%></td><td><%=bo.getMerchPrice()%></td>
       <td><a href="deleteallbuyServlet?merchID=<%=bo.getMerchID()%>">ɾ��</a></td>
      
    </tr>
       <%
  		}
   %>
    </table>  

<hr>

<hr>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    
<%@page import="java.util.*"%>
<%@page import="dto.*"%>
<%@page import="dao.*"%>
   
<% 
Vector v = (Vector)session.getAttribute("alluser"); 
Vector<MerchInfo> v1 =null;
MerchInfoDao b = new MerchInfoDao();
v=b.getAllMerchInfo();
session=request.getSession();
session.setAttribute("alluser", v1);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />  
</head>

<style>
body{font-family:Arial; font-size:14px;line-height:180%;padding-top: 20px;} /*总控制，可忽略此行*/
table tr:first-child{background:#ff8080; color:#fff;font-weight:bold;} 
.market {font-size: 24px;text-align: center;color: #F33;align:center;}
table{border-top:1pt solid #C1DAD7;border-left:1pt solid #C1DAD7;margin: 0 auto;} 
td{ padding:5px 10px; text-align:center;border-right:1pt solid #C1DAD7;border-bottom:1pt solid #C1DAD7;}
tr:nth-of-type(odd){ background:#F5FAFA;} /* odd 标识奇数行，even标识偶数行 */
tr:hover{ background: #E0F0F0;} /*鼠标悬停后表格背景颜色*/


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
<p align="right"><%=session.getAttribute("username") %>，欢迎您！<a href="/TestWeb1/login.jsp">退出</a></p>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;"><img src="images/01.png" width="50" height="50" align="absmiddle" />皮皮虾书城</p>
</div>
<div id="a"><a href="admin.jsp"  class="button green">首页</a><a href="searchuser.jsp" class="button green">查看客户</a><a href="allbuy.jsp" class="button green">查看所有购物车信息</a><a href="allmerch.jsp" class="button green">修改商品价格</a></div>
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>搜索：
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="98%" />
</form>

    <table width='80%' border='0' cellspacing='0' cellpadding='0' align='center'>
    <tr>
      <td>商品编号</td><td>商品名称</td><td>价格</td>
    </tr>
<%
  		for(int i=0;i<v.size();i++){
  			MerchInfo bo = (MerchInfo)v.get(i);
    	%>
	<tr>
      <td><%=bo.getMerchID()%></td><td><%=bo.getMerchName()%></td><td><%=bo.getMerchPrice()%></td>
    </tr>
       <%
  		}
   %>
    </table>  
    
    
    <p align="center"><strong style="font-size: 18px;text-align: center;color: red;align:center;"><br>
<%=session.getAttribute("username") %>，您好<br>请输入需要修改的商品ID：</strong>
  <form method="post" action="/TestWeb1/updateMerchInfoServlet" >
  <div align="center">
	    <input name="merchid"  required type="text"><br>
	    </div>
	    <div align="center">
	    <strong style="font-size: 18px;text-align: center;color: #F33;align:center;">
<br>请输入需要修改商品的价格：</strong><br>
	    <input name="merchprice" type="text">
		  <input value="修改" style="width:10%;" type="submit">
		  </div>
		  </p>
  </form>
<hr>

<hr>


</body>
</html>
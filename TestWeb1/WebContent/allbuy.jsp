<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK" import="java.util.*,dto.Buy" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>皮皮虾书城</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />   
<link rel="stylesheet" href="css/main.css" type="text/css" />
<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="js/imagesloaded.pkgd.min.js"></script>
<script src="js/jquery.hslider.js"></script>
</head>
<body>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;"><img src="images/01.png" width="50" height="50" align="absmiddle" />皮皮虾书城</p>
</div>
<div id="a"><a href="ok.jsp" class="button green">首页</a><a href="merchinfo.jsp" class="button green">购买商品</a><a href="user.jsp" class="button green">修改密码</a><a href="" target="_blank" class="button green">合作</a></div>
  <p class="ys2">
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>搜索：
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="98%" />
</form>

<form action="findAllBuy">
  <input type="submit" value="查看所有购物信息">
</form>

<form method="post">
  <table width="499" border="0">
    <tr>
      <td>商品编号</td><td>商品名称</td><td>用户ID</td><td>用户名</td><td>价格</td>
    </tr>
    <%
    Vector<Buy> b = (Vector<Buy>)session.getAttribute("allbuy");
    Iterator<Buy> it = b.iterator();
    Buy bo = null;
      while(it.hasNext()){
    	  bo = it.next();
    %>
    
    <tr>
      <td><%=bo.getMerchID()%></td><td><%=bo.getMerchName()%></td><td><%=bo.getUserID()%></td><td><%=bo.getUserName()%></td><td><%=bo.getMerchPrice()%></td>
    </tr>
  
    <%
      }
    %>
    </table>
 </form> 



</body>
</html>
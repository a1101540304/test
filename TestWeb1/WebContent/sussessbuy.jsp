<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>ƤƤϺ���</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />   
<link rel="stylesheet" href="css/main.css" type="text/css" />
</head>
<body>
<p align="right"><%=session.getAttribute("username") %>����ӭ����<a href="login.jsp">�˳�</a></p>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: color: gray; text-align: center;"><img src="images/01.png" width="50" height="50" align="absmiddle" />ƤƤϺ���</p>
</div>
<div id="a"><a href="ok.jsp" class="button green">��ҳ</a><a href="merchinfo.jsp" class="button green">������Ʒ</a><a href="user.jsp" class="button green">�޸�����</a><a href="" target="_blank" class="button green">����</a></div>
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>������
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="98%" />
</form>
<p align="center" style="font-size: 36px; font-weight: bold; color: #F00; text-align: center;">
<img src="images/cg.jpg" width="400" height="400" align="absmiddle" />
</p>


</body>
</html>
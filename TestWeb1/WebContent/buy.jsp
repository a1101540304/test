<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    
    <%@page import="java.util.*"%>
<%@page import="dto.*"%>
<%@page import="dao.*"%>

<% Vector v = (Vector)session.getAttribute("buy"); 
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
<title>�����̳�</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />   
<link rel="stylesheet" href="css/main.css" type="text/css" />
<link href="css/zzsc.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<LINK href="css/lanrenzhijia.css"rel=stylesheet>
<SCRIPT src="js/lanrenzhijia.js"></SCRIPT>
<link href="css/style.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>

<link rel="stylesheet" type="text/css" href="css/zzsc-demo.css">
<link rel="stylesheet" type="text/css" href="css/style1.css">

</head>
<body>
	<div class="chl-poster simple" id=header>
		<div id=site-nav>
			<UL class=quick-menu>
			<li><%=session.getAttribute("username") %><a>����ӭ��</a></li>
			  <LI class=home><A href="http://www.lanrenzhijia.com">�����ҳ</A> </LI>
			  <LI><A href="http://www.lanrenzhijia.com" target=_top>��Ҫ��</A></LI>
			  <form method="post" action="findBuyServlet" >
			  <p>
	          <p hidden>
	          <input name="username" value="<%=session.getAttribute("username") %>" required type="text"></p>
			  <LI class=cart ><A target=_top rel=nofollow href="buy.jsp" ><S></S>���ﳵ </A></LI></form>
			  <LI class=favorite><A href="http://www.lanrenzhijia.com" target=_top rel=nofollow>�ղؼ�</A></LI>
			  <LI class="search menu-item">
				  <div class=menu><SPAN class=menu-hd><S></S>����<B></B></SPAN> 
					  <div class=menu-bd>
						  <div class=menu-bd-panel>
							  <FORM name=topSearch action=http://s.taobao.com/search?ssid=s0><INPUT 
							  maxLength=60 name=q value="www.lanrenzhijia.com"><BUTTON type=submit>�� ��</BUTTON> <INPUT type=hidden 
							  value=newsearch name=shopf> </FORM>
						  </div>
					  <S class=r></S><S class=rt></S><S class=lt></S><S class=b></S><S class="b b2"></S><S class=rb></S><S class=lb></S>
					  </div>
				  </div>
			  </LI>
		    </UL>
		</div>
	</div>
<SCRIPT type=text/javascript>
	TB.Header.init();
</SCRIPT>

    <form action="findAllBuy">
  <input type="submit" value="�鿴���й�����Ϣ">
</form>


    
    <form method="post" action="findBuyServlet" >
      <p>
	<p hidden>
	    <input name="username" value="<%=session.getAttribute("username") %>" required type="text"></p>
		  <input value="��ѯ" style="width:10%;" type="submit">
	  </p>
  </form>
  
  
  
  <br><br><br><br><br><br><br><br><br>
  <form method="post" action="findBuyServlet" >
      <p>
	<p hidden>
	    <input name="username" value="<%=session.getAttribute("username") %>" required type="text"></p>
  <h3 class="center">�鿴���ﳵ��Ϣ��</h3>
<a class="button" href="#">YES</a>	  
</p>
  </form>
    
<a onMousedown="alert('����ɹ���');
document.bgColor='black';
document.fgColor='White';"><input value="����" style="width:50%;" type="submit"></a>
    
</body>
</html>
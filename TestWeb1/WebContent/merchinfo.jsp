<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>皮皮虾书城</title>
  <link href="css/main.css" rel="stylesheet" type="text/css" />   
<link rel="stylesheet" href="css/main.css" type="text/css" />
<link href="css/zzsc.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<LINK href="css/lanrenzhijia.css"rel=stylesheet>
<SCRIPT src="js/lanrenzhijia.js"></SCRIPT>
<link href="css/style.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
</head>
<body>

	<div class="chl-poster simple" id=header>
		<div id=site-nav>
			<UL class=quick-menu>
			<li><%=session.getAttribute("username") %>，欢迎您</li>
			  <LI class=home><A href="ok.jsp">书城首页</A> </LI>
			  <LI><A href="">我要买</A></LI>
			  <form method="post" action="findBuyServlet" >
			  <p>
	          <p hidden>
	          <input name="username" value="<%=session.getAttribute("username") %>" required type="text"></p>
			  
			  <LI class="search menu-item">
				  <div class=menu><SPAN class=menu-hd><S></S>购物车<B></B></SPAN> 
					  <div class=menu-bd>
						  <div class=menu-bd-panel>
	<form method="post" action="findBuyServlet" >
   
	<p hidden>
	<input name="username" value="<%=session.getAttribute("username") %>" required type="text"></p>
	<input value="查询" style="width:80%;" type="submit">
    </form>
						  </div>
					  <S class=r></S><S class=rt></S><S class=lt></S><S class=b></S><S class="b b2"></S><S class=rb></S><S class=lb></S>
					  </div>
				  </div>
			  </LI>
			  <li><a href="login.jsp">退出</a></li>
		    </UL>
		</div>
	</div>
<SCRIPT type=text/javascript>
	TB.Header.init();
</SCRIPT>
<body>
<div id="header">
 <div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;">皮皮虾书城</p>
</div>
</div>
<script src="/demos/googlegg.js"></script>
<div class="tabox">
  <div class="hd">
	<ul>
	  <li class=" ">疯狂抢购</li>
	  <li class=" ">猜您喜欢</li>
	  <li class=" ">热卖商品</li>
	  <li class=" ">热评商品</li>
	  <li class="on">新品上架</li></ul>
  </div>
  <div class="bd">
	<ul class="lh" style="display: none;">
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/01.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK1</a></div>
		  
		<div class="p-price">价格：
		  <strong>￥22.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m01" required type="text">   
       <input name="merchname" value="BOOK1" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="22" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/02.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK2</a></div>
		<div class="p-price">价格：
		  <strong>￥42.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m02" required type="text">   
       <input name="merchname" value="BOOK2" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="42" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/03.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK3</a></div>
		<div class="p-price">价格：
		  <strong>￥30.00<br>
<form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m03" required type="text">   
       <input name="merchname" value="BOOK3" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="30" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/04.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK4</a></div>
		<div class="p-price">价格：
		  <strong>￥28.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m04" required type="text">   
       <input name="merchname" value="BOOK4" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="28" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/05.png"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK5</a></div>
		<div class="p-price">价格：
		  <strong>￥53.00<br>
	<form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m05" required type="text">   
       <input name="merchname" value="BOOK5" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="53" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	</ul>
	<ul class="lh" style="display: none;">
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/08.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK6</a></div>
		<div class="p-price">价格：
		  <strong>￥60.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m06" required type="text">   
       <input name="merchname" value="BOOK6" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="60" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>
		  </strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/09.png"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK7</a></div>
		<div class="p-price">价格：
		  <strong>￥51.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m07" required type="text">   
       <input name="merchname" value="BOOK7" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="51" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>
		  </strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/10.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK8</a></div>
		<div class="p-price">价格：
		  <strong>￥38.00<br>
<form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m08" required type="text">   
       <input name="merchname" value="BOOK8" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="38" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>
		  </strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/09.png">
		</div>
		<div class="p-name">BOOK7</div>
		<div class="p-price">价格：
		  <strong>￥51.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m07" required type="text">   
       <input name="merchname" value="BOOK7" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="51" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>
		  </strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/05.png"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK5</a></div>
		<div class="p-price">价格：
		  <strong>￥53.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m05" required type="text">   
       <input name="merchname" value="BOOK5" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="53" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	</ul>
	<ul class="lh" style="display: none;">
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/01.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK1</a></div>
		<div class="p-price">价格：
		  <strong>￥22.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m01" required type="text">   
       <input name="merchname" value="BOOK1" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="22" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/02.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK2</a></div>
		<div class="p-price">京东价：
		  <strong>￥42.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m02" required type="text">   
       <input name="merchname" value="BOOK2" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="42" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/03.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK3</a></div>
		<div class="p-price">价格：
		  <strong>￥30.00<br>
<form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m03" required type="text">   
       <input name="merchname" value="BOOK3" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="30" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/04.jpg"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK4</a></div>
		<div class="p-price">价格：
		  <strong>￥28.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m04" required type="text">   
       <input name="merchname" value="BOOK4" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="28" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
		  <a href="">
			<img src="images/05.png"></a>
		</div>
		<div class="p-name">
		  <a href="">BOOK5</a></div>
		<div class="p-price">价格：
		  <strong>￥53.00<br>
	<form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m05" required type="text">   
       <input name="merchname" value="BOOK5" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="53" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	</ul>
	<ul class="lh" style="display: none;">
	  <li>
		<div class="p-img ld">
			<img src="images/03.jpg">
		</div>
		<div class="p-name">BOOK3</div>
		<div class="p-price">价格：
		  <strong>￥30.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m03" required type="text">   
       <input name="merchname" value="BOOK3" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="30" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/04.jpg">
		</div>
		<div class="p-name">BOOK8</div>
		<div class="p-price">价格：
		  <strong>￥38.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m08" required type="text">   
       <input name="merchname" value="BOOK8" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="38" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/01.jpg">
		</div>
		<div class="p-name">BOOK6</div>
		<div class="p-price">价格：
		  <strong>￥60.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m06" required type="text">   
       <input name="merchname" value="BOOK6" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="60" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/09.png">
		</div>
		<div class="p-name">BOOK4</div>
		<div class="p-price">价格：
		  <strong>￥28.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m04" required type="text">   
       <input name="merchname" value="BOOK4" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="28" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>
</strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/02.jpg">
		</div>
		<div class="p-name">BOOK7</div>
		<div class="p-price">价格：
		  <strong>￥51.00<br><form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m07" required type="text">   
       <input name="merchname" value="BOOK7" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="51" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	</ul>
	<ul class="lh" style="display: block;">
	  <li>
		<div class="p-img ld">
			<img src="images/08.jpg"></a>
		</div>
		<div class="p-name">BOOK5</div>
		<div class="p-price">价格：
		  <strong>￥53.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m05" required type="text">   
       <input name="merchname" value="BOOK5" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="53" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/09.png"></a>
		</div>
		<div class="p-name">BOOK2</div>
		<div class="p-price">价格：
		  <strong>￥42.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m02" required type="text">   
       <input name="merchname" value="BOOK2" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="42" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/10.jpg"></a>
		</div>
		<div class="p-name">BOOK1</div>
		<div class="p-price">价格：
		  <strong>￥22.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m01" required type="text">   
       <input name="merchname" value="BOOK1" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="22" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/011.jpg"></a>
		</div>
		<div class="p-name">BOOK4</div>
		<div class="p-price">价格：
		  <strong>￥28.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m04" required type="text">   
       <input name="merchname" value="BOOK4" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="28" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form></strong></div>
	  </li>
	  <li>
		<div class="p-img ld">
			<img src="images/03.jpg"></a>
		</div>
		<div class="p-name">BOOK3</div>
		<div class="p-price">价格：
		  <strong>￥30.00<br>
		  <form action="insertBuyServlet">
     <p hidden>
       <input name="merchid" value="m03" required type="text">   
       <input name="merchname" value="BOOK3" required type="text"> 
       <input name="userid" value="<%=session.getAttribute("userid") %>" required type="text">
       <input name="username" value="<%=session.getAttribute("username") %>" required type="text"> 
       <input name="merchprice" value="30" required type="text"></p>
       <input value="购买" style="width:50%;" type="submit">
</form>

</strong></div>
	  </li>
	</ul>
  </div>
</div>

<script type="text/javascript">
	jQuery(".tabox").slide({delayTime: 0});
</script>
</body>
</html>
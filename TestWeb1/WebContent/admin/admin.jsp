<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
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
<script type="text/javascript">       
	$( document ).ready(function() { 
		//$( ".hsldr-container" ).hslider("navBar:false"); // create slider
		$( ".hsldr-container" ).hslider({
		  navBar: true,
		  auto: true,
		  delay: 4000
		});
	});	
</script>
<style type="text/css">

</style>
<script src="SpryAssets/SpryEffects.js" type="text/javascript"></script>
<script type="text/javascript">
function MM_effectAppearFade(targetElement, duration, from, to, toggle)
{
	Spry.Effect.DoFade(targetElement, {duration: duration, from: from, to: to, toggle: toggle});
}
</script>
</head>
<body>
<p align="right"><%=session.getAttribute("username") %>，欢迎您！<a href="/TestWeb1/login.jsp">退出</a></p>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;"><img src="images/01.png" width="50" height="50" align="absmiddle" />皮皮虾书城</p>
</div>
<div id="a"><a href="admin.jsp"  class="button green">首页</a><a href="searchuser.jsp" class="button green">查看客户</a><a href="allbuy.jsp" class="button green">查看所有购物车信息</a><a href="allmerch.jsp" class="button green">修改商品价格</a></div>
 <p class="ys2">
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>搜索：
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="100%" />
</form>
		<figure align="center">
			<img src="images/37.jpg" width="100%" height="500px" />
		</figure>

</body>
</html>
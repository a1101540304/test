<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>ƤƤϺ���</title>

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
<p align="right"><%=session.getAttribute("username") %>����ӭ����<a href="login.jsp">�˳�</a></p>
<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color:gray; text-align: center;"><img src="images/01.png" width="76" height="73" align="absmiddle" />ƤƤϺ���</p>
</div>
<div id="a"><a class="button green">��ҳ</a><a href="merchinfo.jsp" class="button green">������Ʒ</a><a href="user.jsp" class="button green">�޸�����</a><a class="button green">����</a></div>
  <p class="ys2">
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>������
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="98%" />
</form>




<div class="hsldr-container">
		<figure>
			<img src="images/37.jpg" />
		</figure>
		<figure>
			<img src="images/38.jpg" />
		</figure>
		<figure>
			<img src="images/39.jpg" />
		</figure>
		<figure>
			<img src="images/40.jpg" />
		</figure>
		<figure>
			<img src="images/41.jpg" />
		</figure>
	</div>
</body>
</html>
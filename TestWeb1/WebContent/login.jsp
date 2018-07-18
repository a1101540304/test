<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>皮皮虾书城</title> 
<liNK href="css/lanrenzhijia.css" type=text/css rel=stylesheet>
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

<script src="SpryAssets/SpryEffects.js" type="text/javascript"></script>
<script type="text/javascript">
function MM_effectAppearFade(targetElement, duration, from, to, toggle)
{
	Spry.Effect.DoFade(targetElement, {duration: duration, from: from, to: to, toggle: toggle});
}
</script>
<script>
<!--
/*第一种形式 第二种形式 更换显示样式*/
function setTab(name,cursel,n){
for(i=1;i<=n;i++){
var menu=document.getElementById(name+i);
var con=document.getElementById("con_"+name+"_"+i);
menu.className=i==cursel?"hover":"";
con.style.display=i==cursel?"block":"none";
}
}
//-->
</script>
<style type="text/css">
div#a {
	height: 29px;
	width: 100%;
	float: left;
	overflow: hidden;
	background-color: gray;
	color: #000;
	font-size: 24px;
	text-align: center;
}
div#header {
	width: 100%;
	padding-bottom: 0px;
	padding-top: 00px;
	background-color:#FFFFFF;
}
#search input[type="text"] {
	background: url(../images/search-white.png) no-repeat 10px 6px #fcfcfc;
	border: 1px solid #d1d1d1;
	font: bold 12px Arial,Helvetica,Sans-serif;
	color: #bebebe;
	width: 150px;
	padding: 6px 15px 6px 35px;
	-webkit-border-radius: 20px;
	-moz-border-radius: 20px;
	border-radius: 20px;
	text-shadow: 0 2px 3px rgba(0, 0, 0, 0.1);
	-webkit-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.15) inset;
	-moz-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.15) inset;
	box-shadow: 0 1px 3px rgba(0, 0, 0, 0.15) inset;
	-webkit-transition: all 0.7s ease 0s;
	-moz-transition: all 0.7s ease 0s;
	-o-transition: all 0.7s ease 0s;
	transition: all 0.7s ease 0s;
}

#search input[type="text"]:focus {
	width: 200px;
}

/* button 
---------------------------------------------- */
.button {
	display: inline-block;
	zoom: 1;
 /* zoom and *display = ie7 hack for display:inline-block */
	*display: inline;
	vertical-align: baseline;
	margin: 0 2px;
	outline: none;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	font: 14px/100% Arial, Helvetica, sans-serif;
	padding: .5em 1.5em .55em;
	text-shadow: 0 1px 1px rgba(0,0,0,.3);
	-webkit-border-radius: .5em;
	-moz-border-radius: .5em;
	border-radius: .5em;
	-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	-moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	box-shadow: 0 1px 2px rgba(0,0,0,.2);
}

.button:hover {
	text-decoration: none;
}

.button:active {
	position: relative;
	top: 1px;
}

/* green */
.green {
	color: #e8f0de;
	border: solid 1px gray;
	background: gray;
}

.green:hover {
	background: white;}

.green:active {
	color: #F00;
}

.bigrounded {
	-webkit-border-radius: 0em;
	-moz-border-radius: 0em;
	border-radius: 0em;
}

.medium {
	font-size: 12px;
	padding: .4em 1.5em .42em;
}

.small {
	font-size: 11px;
	padding: .2em 1em .275em;
}
</style>

</head>
<body>

<div id="header">
  <p align="center" style="font-size: 36px; font-weight: bold; color: gray; text-align: center;"><img src="images/01.png" width="76" height="73" align="absmiddle" />皮皮虾书城</p>
</div>
<div id="a"><a href="ok.jsp" class="button green">首页</a><a href="merchinfo.jsp" class="button green">购买商品</a><a href="user.jsp" class="button green">修改密码</a><a href="" target="_blank" class="button green">合作</a><a class="button green" href="index.html">登录</a></div>
  <p class="ys2">
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
<div id="bg"></div>
</form> 





 
<script type="text/javascript">
function $(o){ //获取对象
 if(typeof(o) == "string")
 return document.getElementById(o);
 return o;
}
function openBg(state){ //遮照打开关闭控制
 if(state == 1)
 {
  $("bg").style.display = "block";
  var h = document.body.offsetHeight > document.documentElement.offsetHeight ? document.body.offsetHeight : document.documentElement.offsetHeight;
// alert(document.body.offsetHeight);
 //alert(document.documentElement.offsetHeight);
  $("bg").style.height = h + "px";
 }
 else
 {
  $("bg").style.display = "none";
 } 
}
function openSelect(state){ //选择城市层关闭打开控制
 if(state == 1) 
 {
  $("selectItem").style.display = "block";
  $("selectItem").style.left = ($("bg").offsetWidth - $("selectItem").offsetWidth)/2 + "px";
  $("selectItem").style.top = document.body.scrollTop + 100 + "px";  
 }
 else
 {
  $("selectItem").style.display = "none";
 }
}
function showSelect(id){
 for(var i = 0 ; i < grow ;i++)
 {
  $("c0" + i).style.display = "none";
 }
 $("c0" + id).style.display = "block";
 showGrow = id;
}
</script>




  <p class="ys2">
  <hr width="98%" />
  <p class="ys2">  
  <form method="get" action="/search" id="search">
    <p>搜索：
    <input name="q" type="text" size="40" placeholder="Search..." /> 
    </p>
    <hr align="center" width="100%" />
</form>
		<figure>
			<img src="images/37.jpg" width="1000px" height="500px" />
		</figure>

</body>
</html>
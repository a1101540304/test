<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
  <font size=4>
  <p>��ȡ�ı�����Ϣ��
  <%String textContent=request.getParameter("user");%>
  <br>
  <%=textContent %>
  <p>��ȡ��ť���֣�
  <%String buttonName=request.getParameter("submit"); %>
  <br>
  <%=buttonName %>
  </font>
</body>
</html>
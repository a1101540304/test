<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib uri="http://lingnan.edu.cn" prefix="hh" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
    <hh:ht/>
    <br><br>
    
    <c:set var="name" value="zhangsan"></c:set>
    <c:out value="${pageScope.name}"></c:out>
    <c:remove var="name"/>
    <p>${name}</p>
    <c:catch var="error">
        <%=9/0%>
    </c:catch>
    <c:out value="${error}"></c:out>
    <br><br>
    <%
      String[] str = new String[5];
      str[0]="aaaa";
      str[1]="bbbb";
      str[2]="cccc";
      str[3]="dddd";
      str[4]="eeee";
      request.setAttribute("strrr", str);
    %>
    <c:if test="${strrr[0]=='aaaa'}">
      Yes!
    </c:if>
    
    <c:choose>
      <c:when test="${strrr[0]=='aaaa'}">
        !!!
      </c:when>
      <c:otherwise>
        ???
      </c:otherwise>
    </c:choose>
    
    <c:forEach items="${strrr}" var="ss">
      <c:out value="${ss}"></c:out>
    </c:forEach>
    
    <!--c:redirect url="http://www.qq.com"-->
    
    <br><br>
    
    <sql:setDataSource
      driver="com.mysql.jdbc.Driver"
      url="jdbc:mysql://localhost:3306/supermarket?useUnicode=true&amp;characterEncoding=gb2312"
      user="root"
      password="123321"
    />
    <sql:query var="result" sql="select * from Buy"></sql:query>
    <c:forEach items="${result.rows}" var="rr">
      <tr>
        <td><c:out value="${rr.merchID}"></c:out></td>
        <td><c:out value="${rr.merchName}"></c:out></td>
        <td><c:out value="${rr.userID}"></c:out></td>
        <td><c:out value="${rr.userName}"></c:out></td>
        <td><c:out value="${rr.merchPrice}"></c:out></td>
      </tr>
    </c:forEach>
    
    
    
</body>
</html>
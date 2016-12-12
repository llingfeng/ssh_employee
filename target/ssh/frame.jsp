<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/12/1
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工管理系统</title>
</head>
<frameset rows="80,*">
    <frame name="top" src="frame/top.jsp">
    <frameset cols="150,*" id="main">
        <frame src="frame/left.jsp">
        <frame name="right" src="frame/right.jsp">
    </frameset>
</frameset>
</html>

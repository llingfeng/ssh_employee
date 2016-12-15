<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/12/14
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>单个文件上传</h2>
<form action="upload.action" method="post" enctype="multipart/form-data">
    <input type="file" name="upload">
    <input type="submit" value="上传">${result}
</form>
<h2>批量上传</h2>
<form action="upload.action" method="post" enctype="multipart/form-data">
    文件1：<input type="file" name="upload"><br><br>
    文件2：<input type="file" name="upload"><br><br>
    文件3：<input type="file" name="upload"><br><br>
    <input type="submit" value="上传">${result}
</form>
<h2>下载</h2>
<a href="download.action">下载1</a>
<a href="download.action?fileName=img2-lg.jpg">下载1</a>
</body>
</html>

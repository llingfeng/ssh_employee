<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/12/2
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <link href="dtree.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="dtree.js"></script>
    <style>
        body {
            background-color: #DDF0FB;
            padding: 0;
            margin: 0;
        }
    </style>
</head>
<body>
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
    <div class="dtree">
        <script type="text/javascript">
            d = new dTree('d');

            d.add('01', '-1', '员工管理系统');
            d.add('0101', '01', '人力资源部');
            d.add('010101', '0101', '部门管理', 'department_findAll?currentPage=1', '', 'right');

            d.add('010102', '0101', '员工管理', 'listEmployee.jsp', '', 'right');
            document.write(d);
        </script>
    </div>
</table>

</body>
</html>


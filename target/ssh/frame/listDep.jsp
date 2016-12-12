<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/12/2
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <style type="text/css">
        table {
            width: 900px;
        }

        .table1 {
            border: 1px solid #ddd;
            width: 900px;
        }

        thead {
            background-color: lightblue;
        }

    </style>
</head>
<body>
<table>
    <tr>
        <td align="center" style="font-size:24px; color:#666"> 部门管理</td>
    </tr>
    <tr>
        <td align="right"><a href="department_saveUI">添加</a></td>
    </tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
    <thead>
    <tr>
        <th width="33%">部门名称</th>
        <th width="33%">编辑</th>
        <th width="33%">删除</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="list" var="department">
        <tr>
            <td align="center"><s:property value="#department.departmentName"/></td>
            <td align="center"><a href="department_edit?departmentId=<s:property value="#department.departmentId"/> "><img src="<%=request.getContextPath()%>/images/编辑.png"></a></td>
            <td align="center"><a href="department_delete?departmentId=<s:property value="#department.departmentId"/> ">删除</a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<br/>
<table border="0" cellspacing="0" cellpadding="0" width="900px">
    <tr>
        <td align="right">
            <span>第<s:property value="currentPage"/>/<s:property value="totalPage"/> 页</span>
            <span>
                <s:if test="currentPage != 1">
                    <a href="javascript:void(0)" onclick="jumpPage(1)">[首页]</a>&nbsp;&nbsp;
                    <a href="javascript:void(0)" onclick="jumpPage(
                        <s:property value="currentPage-1"/> )">[上一页]</a>&nbsp;&nbsp;
                </s:if>
                <s:if test="currentPage != totalPage">
                    <a href="javascript:void(0)" onclick="jumpPage(
                        <s:property value="currentPage+1"/> )">[下一页]</a>&nbsp;&nbsp;
                    <a href="javascript:void(0)" onclick="jumpPage(
                        <s:property value="totalPage"/> )">[尾页]</a>&nbsp;&nbsp;
                </s:if>
            </span>
        </td>
    </tr>
</table>
</body>
<script type="text/javascript">
    function jumpPage(num) {
        window.location.replace("department_findAll?currentPage=" + num);
    }
</script>
</html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/12/2
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head></head>
<body>
<table border="0" width="600px">
    <tr>
        <td align="center" style="font-size:24px; color:#666"> 部门添加</td>
    </tr>
    <tr>
        <td align="right">
            <a href="javascript:void(0)" onclick="saveDepartment()">保存</a> &nbsp;&nbsp;
            <a href="javascript:history.back(-1)">退回 </a>
        </td>
    </tr>
</table>
<br/>
<br>
<s:form method="POST" action="department_save" id="saveForm" namespace="/" theme="simple">
    <table style="font-size:16px">
        <tr>
            <td>部门名称：</td>
            <td>
                <s:textfield name="departmentName"/>
            </td>
        </tr>
        <tr>
            <td valign="top">部门介绍：</td>
            <td>
                <s:textarea cols="50" rows="5" name="departmentDesc"></s:textarea>
            </td>
        </tr>
    </table>
</s:form>
</body>
<script type="text/javascript">
    function saveDepartment() {
        document.getElementById("saveForm").submit();
    }
</script>
</html>

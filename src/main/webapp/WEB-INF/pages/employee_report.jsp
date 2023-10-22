<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 23-Oct-23
  Time: 12:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Employee Report</title>
</head>
<body>
<c:if test="${!empty resultMsg}">
<h3 style="color: green; text-align: center">${resultMsg}</h3>
</c:if>
<c:choose>
    <c:when test="${!empty empsData}">
        <table border="1" bgcolor="#00ffff" align="center">
            <tr>
                <th>EmpNo</th>
                <th>EmpName</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Operations</th>
            </tr>
            <c:forEach var="emp" items="${empsData}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.sal}</td>
                    <td><a href="edit?no=${emp.empno}"><img src="../../images/edit.png" width="50" height="50"></a> &nbsp;&nbsp;&nbsp;<a onclick="return confirm('Do you want to delete ${emp.ename}?')" href="delete?no=${emp.empno}"><img src="../../images/delete.png" width="50" height="50" ></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1>Records Not Found</h1>
    </c:otherwise>
</c:choose>
<br>
<br>
<h1><a href="add"><img src="../../images/add.png" height="50" width="50">Add Employee</a></h1>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 23-Oct-23
  Time: 1:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Update Employee Form</title>
</head>
<body>


<h1>Edit Employee</h1>
<form:form modelAttribute="emp">
  <table border="1" bgcolor="#00ffff" align="center">
    <tr>
      <th>Employee Number</th>
      <td><form:input path="empno" readonly="true"></form:input></td>
    </tr>
    <tr>
      <th>Employee Name</th>
      <td><form:input path="ename"></form:input></td>
    </tr>
    <tr>
      <th>Employee Designation</th>
      <td><form:input path="job"></form:input></td>
    </tr>
    <tr>
      <th>Employee Salary</th>
      <td><form:input path="sal"></form:input></td>
    </tr>
    <tr>
      <th><input type="submit" value="Edit Employee"></th>
    </tr>

  </table>

</form:form>




</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.12.2014
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="WorkAdd.jsp?idDep=<%=request.getParameter("param1")%>" class="button"> Добавить </a>


    Это все рабочие которые у нас есть




<table align="center">
  <tr>
    <td>Id</td>
    <td>Data</td>
    <td>Name </td>
    <td>Email</td>
    <td>DepId</td>
  </tr>
  <c:forEach var="w" items="${workers}">
    <tr>
      <td>${w.id}</td>
      <td>${w.data}</td>
      <td>${w.name}</td>
      <td>${w.email}</td>
      <td>${w.departId}</td>
      <td> <a href="WorkEdit.jsp?id=${w.id}&data=${w.data}&name=${w.name}&email=${w.email}" class="button"> Редактировать </a></td>
      <td><a href="WorkDelete?nameWorker=${w.name}" class="button"> Удалить </a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>

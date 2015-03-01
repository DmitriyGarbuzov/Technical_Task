<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page isELIgnored="false" %>

<html>
<head>

</head>
<body>

<a href="DepartAdd.jsp" class="button"> Добавить </a>

<table align="center">
    <tr>
        <td>Id</td>
        <td>Data</td>
        <td>Name </td>
        <td>Email</td>

    </tr>
        <c:forEach var="d" items="${depList}">
        <tr>
            <td>${d.id}</td>
            <td>${d.data}</td>
            <td>${d.name}</td>
            <td>${d.email}</td>
            <td><a href="DepartEdit.jsp?param1=${d.id}&param2=${d.data}&param3=${d.name}&param4=${d.email}" class="button" > Редактировать </a></td>
            <td><a href="DepartDelete?param1=${d.name}" class="button"> Удалить</a></td>
            <td><a href="WorkList?param1=${d.id}" class="button"> Список работников </a></td>
        </tr>
        </c:forEach>
</table>
</body>
</html>

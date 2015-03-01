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
<form name="addWorker" method="post" action="WorkAdd?id=<%=request.getParameter("idDep")%>">
  Дата создания : <input type="date" name="wData"/>
  </br>
  </br>
  Имя Рабочего : <input type="text" name="wName"/>
  </br>
  </br>
  Эмейл Рабочего : <input type="email" name="wEmail"/>
  </br>
  </br>
  <input type="submit" value="Добавить"/>
</form>
</body>
</html>

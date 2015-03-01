<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.12.2014
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Это редактирование данных рабочего:
Дата-<%=request.getParameter("data")%>
</br>
Имя-<%=request.getParameter("name")%>
</br>
Эмейл-<%=request.getParameter("email")%>
</br>
</br>
Новые значения:
</br>
</br>
</br>
<form name="EditWorker" method="post" action="WorkEdit?idW=<%=request.getParameter("id")%>">
  </br>
  </br>
  Дата внесения коректив : <input type="date" name="dataW"/>
  </br>
  </br>
  Имя рабочего: <input type="text" name="nameW"/>
  </br>
  </br>
  Эмейл рабочего : <input type="email" name="emailW"/>
  </br>
  </br>
  <input type="submit" value="изменить"/>
</form>
</body>
</html>

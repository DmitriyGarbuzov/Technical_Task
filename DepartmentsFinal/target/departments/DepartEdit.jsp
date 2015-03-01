<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.12.2014
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Это редактирование департамента:
Дата-<%=request.getParameter("param2")%>
</br>
Имя-<%=request.getParameter("param3")%>
</br>
Эмейл-<%=request.getParameter("param4")%>

</br>
Новые значения:
</br>
</br>
</br>
<form name="EditDepart" method="post" action="DepartEdit?id=<%=request.getParameter("param1")%>">
  Дата создания : <input type="date" name="dDataEdit"/>
  </br>
  </br>
  Имя департамента : <input type="text" name="dNameEdit"/>
  </br>
  </br>
  Эмейл департамента : <input type="email" name="dEmailEdit"/>
  </br>
  </br>
  <input type="submit" value="изменить"/>
</form>
</body>
</html>

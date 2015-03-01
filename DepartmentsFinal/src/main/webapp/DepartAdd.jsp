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
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#departname").change(function() {
                $.get("Validation", $(this).serialize(), function(data) {
                    if (!data.valid) {
                        $("#username_message").text("Duplicate name, choose another");
                    }
                });
            });
        });
    </script>
    <style>
        #username_message{
            color:red;
        }
    </style>
</head>
<body>
  <form name="addDepart" method="post" action="DepartAdd" id="formAdd">
      Дата создания : <input type="date" name="departdata"/>

      </br>
      </br>
      Имя департамента : <input type="text" name="departname" id="departname"/>
                            <span id="username_message"></span>
      </br>
      </br>
      Эмейл департамента : <input type="email" name="departemail"/>
      </br>
      </br>
      <input type="submit" value="Добавить"/>
  </form>
</body>
</html>

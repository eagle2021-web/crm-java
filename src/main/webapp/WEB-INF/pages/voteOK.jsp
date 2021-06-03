<%--
  Created by IntelliJ IDEA.
  User: eagle2020
  Date: 2021/5/22
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>vote ok</h1>
<br>address:${address}
<%--master是默认放的--%>
<br>masterName${requestScope.master.masterName}
<br>masterId${requestScope.master.pet.petName}
<%--<br>session : ${sessionScope.myMaster}--%>
<br>session : ${sessionScope.abc}
</body>
</html>

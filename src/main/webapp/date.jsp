<%--
  Created by IntelliJ IDEA.
  User: eagle2020
  Date: 2021/5/22
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--为了让springmvc直接到master对象数据，要求这里的字段名称和对象的属性名保持一致--%>
    <form action="vote/vote07" method="post">
        主人号：<input type="text" name="id"><br>
        主人名：<input type="text" name="masterName"><br>
        宠物名：<input type="text" name="pet.petName"><br>
        <input type="submit" value="添加宠物">
    </form>
</body>
</html>

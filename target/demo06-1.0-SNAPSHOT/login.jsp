<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<h1>登录页面</h1>
<a href="user/login" >user/login</a>
<a href="user/login" method="post">login post</a>
<a href="user/message/aa/bb" method="post">message/**</a>
<a href="user/test?bookId=12" >user/test?bookId=12</a>
<br><a href="user/reg/hsp/10086" >user/reg/hsp/10086</a>
<form action="user/login" method="post">
  u:<input type="text" name="username"><br>
 p:<input type="password" name="password"><br>
  <input type="submit" value="登录">
</form>
</body>
</html>













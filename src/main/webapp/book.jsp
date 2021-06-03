<%--
  Created by IntelliJ IDEA.
  User: eagle2020
  Date: 2021/5/22
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.0.0/jquery.min.js"></script>
    <script>
        console.log(jQuery);
        $(function (){
            alert("ok")
        })
    </script>
</head>
<body>
    <a href="user/book/100" >查询书籍book/getBook/100</a>
    <br>
    <form action="user/book" method="get">
        name:<input name="bookname" type="text">
        <input type="submit" value="添加书籍">
    </form>
    <form action="user/book" method="post">
        name:<input name="bookname" type="text">
        <input type="submit" value="删除书籍">
    </form>
</body>
</html>

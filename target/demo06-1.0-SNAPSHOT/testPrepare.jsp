<%--
  Created by IntelliJ IDEA.
  User: eagle2020
  Date: 2021/5/25
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>testPrepare测试Prepare的使用</h1>
    <a href="vote/vote08">情感求updateMessage</a>
<h1>修改Person信息
</h1>
<%--  当我们需要修改某个javabean信息时，需要保证表单的字段名字
和javabean的属性名字一致
--%>
    <form action="person/update" method="get">
<%--        为了让handler获取到id,将id值放入隐藏域--%>
        <input type="hidden" name="person_id" value="100">
<%--    指定请求方式，让HiddenHttpMethodFilter转换--%>
<%--    <input type="hidden" name="_method" value="post">--%>
<%--        <input type="">--%>
        id:<input type="text" disabled="disabled" name="person_id" value="100">
        名字：<input type="text" name="name" value="jerry">
<%--        地址：<input type="text" name="address" value="shanghai">--%>
        <input type="submit" value="修改信息">
    </form>
</body>
</html>

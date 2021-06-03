<%--
  Created by IntelliJ IDEA.
  User: eagle2020
  Date: 2021/5/27
  Time: 21:17
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
            $("#getJson").click(function (){
                var href = this.href;
                console.log(href);
                var args={"time":new Date()};
                console.log(999999);
                $.post(href,args,function (data){
                    console.log(data);
                    // alert("name= " + data.name + " address=" + data.address);
                },"text/html");
                //防止重复提交
                return true;
            })
        })
    </script>
</head>
<body>
    <a href="json/getJson" id="getJson">getJson</a>
</body>
</html>

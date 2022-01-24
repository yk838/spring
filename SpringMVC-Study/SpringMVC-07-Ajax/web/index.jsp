<%--
  Created by IntelliJ IDEA.
  User: YK
  Date: 2021/6/30
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax异步获取</title>
      <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
      <script>
          function a(){
          $.ajax({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
          success: function (data,status) {
                console.log(data)
                console.log("status="+status);
          }
          });
          }
      </script>
  </head>
  <body>

    <%--失去焦点事件，发送一个请求到后台--%>
  用户名：<input type="text" id="username" onblur="a()">
  </body>
</html>

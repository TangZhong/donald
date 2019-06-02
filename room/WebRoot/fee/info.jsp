<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    


  </head>
  
  <body>
  <%
    
      String newUrl=(String)request.getAttribute("newUrl");
      response.setHeader("refresh","5;url="+newUrl);
  %>
  <h1>提示信息</h1>
  <hr />
  <h2>${empty info?"无提示信息！":info} </h2>
  <h2>页面5秒后跳转！也可以直接<a href="${requestScope.newUrl }">点击</a></h2>
  </body>
</html>

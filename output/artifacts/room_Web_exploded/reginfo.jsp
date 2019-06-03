<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'info.jsp' starting page</title>
  </head>
  
  <body>
 <%
      //String msg1=(String)request.getAttribute("info1");
      //String msg2=(String)request.getAttribute("info2");
      String newUrl=(String)request.getAttribute("newUrl");
      response.setHeader("refresh","10;url="+newUrl);
  %>
  <h1>提示信息</h1>
  <hr />
  <h2>${empty info1?"无提示信息！":info1} </h2>
  <h2>${empty info2?"请重新注册！":info2} </h2>
  <h2>页面10秒后将会跳转！也可以直接<a href="<%=newUrl %>">点击</a></h2>
  </body>
</html>

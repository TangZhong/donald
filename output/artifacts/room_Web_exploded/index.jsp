<%@ page language="java" import="java.util.*,java.text.DateFormat" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <% 
    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL);
    String s=dateFormat.format(new Date());
     %>
     <p>今天的日期是：<%=s %></p>
  <%
    int iCount=1;
    Object o =application.getAttribute("count");
    if(o!=null){
      iCount=((Integer)o).intValue(); 
    }
    if(session.isNew())
    iCount++;
    o=String.valueOf(iCount);
    application.setAttribute("count",iCount);
  %>
    <h2>欢迎访问我们的网站，您是访问网站的第<%=iCount %>个用户</h2>

    <h2> 欢迎您！${empty uname?"您尚未登录！":uname }</h2>
    <hr/> 
     <h3> 
    <fieldset>
    <legend>学生基本操作</legend>
   <a href="login.jsp">寝室成员登录</a><br> 
   <a href="reg.jsp">寝室信息注册</a><br> 
   <a href="usercenter.jsp">寝室信息展示</a><br>
    </fieldset>
     <fieldset> 
    <legend>舍管基本操作</legend> <a href="dormmanager/managerlogin.jsp">宿管登录</a><br>
   <br> 
    </fieldset>
    <p> <a href="admin/adminlogin.jsp"> 系统管理员登录</a></p>
  </h3>


  </body>
</html>

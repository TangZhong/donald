<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>用户中心</title>
    <style type="text/css">
    #wrapper{width:1000px;margin:0 auto;}
    #header{height:120px;background-color:beige;line-height:120px;text-align:center}
    #main{height:600px;background-color:white}
    #main #left{width:220px;float:left;}
    #main #content{width:775px;float:right;}
    #footer{height:90px;background-color:beige;clear: both;line-height:90px; text-align:center}
    </style>
   
  </head>
  
  <body>
  <div id="wrapper">
     <div id="header"><h1>用户中心</h1></div>
     <div id="main">
     <c:if test="${not empty sessionScope.uname}">
        <div id="left">
          <h2>欢迎您，${sessionScope.uname}！</h2>
          <h3><a href="Showuserinfo" target="ifrm">查看个人信息</a></h3>
          <h3><a href="modifyPass.jsp" target="ifrm">修改个人密码</a></h3>
          
          <h3><a href="#" target="_parents">退出登录</a></h3>
          <h3><a href="index1.jsp" >返回主页</a></h3>
       </div>
       <div id="content">
         <iframe name="ifrm" width="775"height="600"src=""frameborder="0"></iframe>
      </div>
      </c:if>
      
      <c:if test="${empty sessionScope.uname}">
      <h1>您尚未登录，请先<a href="login.html">登录</a></h1>
      <h3><a href="index.jsp" target="_parents">返回主页</a></h3>
      </c:if>
      </div>
      <div id="footer">
      <p>版权所有：浙江财经大学东方学院寝室部</p>
      </div>
   </div>
  </body>
</html>

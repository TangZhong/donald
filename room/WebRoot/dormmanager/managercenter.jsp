<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>后台管理</title>
    <style type="text/css">
    #wrapper{width:1050px;margin:0 auto;}
    #header{height:120px;background-color:beige;line-height:120px;text-align:center}
    #main{height:600px;background-color:white}
    #main #left{width:235px;float:left;}
    #main #content{width:775px;float:right;}
    #footer{height:90px;background-color:beige;clear: both;line-height:90px; text-align:center}
    </style>
  

  </head>
  
  <body>
   
  <div id="wrapper">
     <div id="header"><h1>楼层管理</h1></div>
     <div id="main">
     <c:if test="${not empty sessionScope.mname}">
        <div id="left">
        <h3>您好，您是管理员${sessionScope.mname}</h3>
        <fieldset>
             <legend>基本操作</legend>
             <h3><a href="modifyPass.jsp" target="ifrm">修改密码</a></h3>
             <h3><a href="../Logoutservlet" target="_parents">退出登录</a></h3>
        </fieldset>
        <fieldset>
             <legend>寝室评分管理</legend>
               <h3><a href="chengji.jsp" target="ifrm">对寝室进行评分</a></h3>
               <h3><a href="showchengji.jsp" target="ifrm">查看寝室评分情况</a></h3><br><br>
        </fieldset>
        <fieldset>
             <legend>寝室缺勤管理</legend>       
               <h3><a href="record.jsp" target="ifrm">查找学生缺勤情况</a></h3>
               <h3><a href="recordSave.jsp" target="ifrm">记录学生缺勤情况</a></h3><br><br>
             
        <h3><a href="../index.jsp">返回主页</a></h3>
       </div>
       <div id="content">
         <iframe name="ifrm" width="775"height="600"src=""frameborder="0"></iframe>
      </div>
      </c:if>
      
      <c:if test="${empty sessionScope.mname}">
      <h1>您尚未登录，请先<a href="managerlogin.jsp">登录</a></h1>
      <h3><a href="index.jsp">返回主页</a></h3>
      </c:if>
      </div>
      <div id="footer">
      <p>版权所有：浙江财经大学东方学院寝室部</p>
      </div>
   </div>
   
   
   
  </body>
</html>


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
     <div id="header"><h1>后台管理</h1></div>
     <div id="main">
     <c:if test="${not empty sessionScope.aname}">
        <div id="left">
        <h3>您好，您是管理员${sessionScope.aname}</h3>
        <fieldset>
             <legend>基本操作</legend>
             <h3><a href="../admin/modifyPass.jsp" target="ifrm">修改密码</a></h3>
             <h3><a href="#" target="_parents">退出登录</a></h3>
        </fieldset>
        <fieldset>
             <legend>寝室信息管理</legend>
              <h3><a href="../admin/GetUserInfoByPageNoAndUsex?pageNo=1" target="ifrm">查看男生寝室成员信息</a></h3>
               <h3><a href="../admin/GetUserInfoByPageNoAndUsex2?pageNo=1" target="ifrm">查看女生寝室成员信息</a></h3>
              <h3><a href="../admin/showserch.jsp" target="ifrm">查看某寝室成员信息</a></h3>
        </fieldset>
         <fieldset>
             <legend>寝室水电费用管理</legend>
             <h3><a href="../fee/feereg.jsp" target="ifrm">发布寝室水电费用</a></h3>
             <h3><a href="../fee/feeserch.jsp" target="ifrm">更改寝室水电费用</a></h3>
             <h3><a href="../fee/GetFeeInfoByPageNo?pageNo=1" target="ifrm">查看寝室水电费用上缴情况</a></h3>
        </fieldset>
        <h3><a href="../index.jsp">返回主页</a></h3>
       </div>
       <div id="content">
         <iframe name="ifrm" width="775"height="600"src=""frameborder="0"></iframe>
      </div>
      </c:if>
      
      <c:if test="${empty sessionScope.aname}">
      <h1>您尚未登录，请先<a href="adminlogin.jsp">登录</a></h1>
      <h3><a href="index.jsp">返回主页</a></h3>
      </c:if>
      </div>
      <div id="footer">
      <p>版权所有：浙江财经大学东方学院寝室部</p>
      </div>
   </div>
   
   
   
  </body>
</html>


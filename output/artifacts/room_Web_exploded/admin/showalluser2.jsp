<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>

     <style type="text/css">
   
  h1{font-size:22px;color:#333;text-align:center;margin:0px;line-height:1.5em}
  h3{font-size:14px;color:#333;margin:0px;}
 
   #main{
width:775px;
font-size:12px;}
.showuser{
width: 350px;
margin: 5px;
padding: 5px;
border: 1px solid #3CF;
float: left;
}
#footer{
clear: both;
}
  .number {
	font-size: 16px;
	color: #C30;
}

     </style>
  

</head>
  
  <body>
   <h1>所有女生寝室成员信息</h1>
  <div id="main">
   <c:forEach items="${requestScope.userlist}" var="user">
   <div class="showuser">
       <p> <span class="number">${user.uid}</span>&nbsp;&nbsp; <h2>${user.uname }</h2>&nbsp;&nbsp;&nbsp;</p>
       <p><h3>班级：</h3>${user.uclass }&nbsp;&nbsp;&nbsp;<h3>学号：</h3>${user.unumber }&nbsp;&nbsp;&nbsp; </p>
       <p><h3>性别：</h3>${user.usex ?"女":"男" }</p>
       <p><h3>楼号：</h3>${user.udorm } &nbsp;&nbsp;&nbsp; <h3>寝室号：</h3> ${user.uhouse } &nbsp;&nbsp;&nbsp;<h3>床号：</h3> ${user.ubed }&nbsp;&nbsp;&nbsp; </p>
       <p><h3>寝室身份：</h3>${user.uidentity ?"寝室长":"寝室成员" }</p>
       <p><h3>电话号码：</h3>${user.utel } </p>
         <form action="../admin/ProhibitUser" method="get">
             <input type="hidden" name="uid" value="${user.uid}"/>
              <input type="submit" name="prohibitValue" value="${user.uonline?'禁用':'启用'}"/>
       </form>
     </div>
    </c:forEach>
  </div>
<div id="footer"> 
    <p>
    <c:if test="${requestScope.pageNo==1}">
                         第一页  &nbsp;&nbsp;前一页&nbsp;&nbsp;
    </c:if>
    <c:if test="${requestScope.pageNo>1}">
         <a href="../admin/GetUserInfoByPageNoAndUsex2?pageNo=1">第一页</a>&nbsp;&nbsp;
         <a href="../admin/GetUserInfoByPageNoAndUsex2?pageNo=${requestScope.pageNo-1}">前一页</a>&nbsp;&nbsp;
    </c:if>
        <c:if test="${requestScope.pageNo==requestScope.pageCount}">
                         后一页  &nbsp;&nbsp;最后页&nbsp;&nbsp;
    </c:if>
    <c:if test="${requestScope.pageNo<requestScope.pageCount}">
         <a href="../admin/GetUserInfoByPageNoAndUsex2?pageNo=${requestScope.pageNo+1}">后一页</a>&nbsp;&nbsp;
         <a href="../admin/GetUserInfoByPageNoAndUsex2?pageNo=${requestScope.pageCount}">最后页</a>&nbsp;&nbsp;
    </c:if>
    </p>
    </div>
  </body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>

     <style type="text/css">
   
   th{
line-height: 2em;
color:#053；
background-color: #ccc;
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #333；
border-top-width: 1px;
border-top-style: solod;
border-top-color: #FFF;
border-right-width: 1px;
border-right-style: solod;
border-right-color: #FFF;
border-left-width: 1px;
border-left-style: solod;
border-left-color: #FFF;
}
td{
line-height: 1.5em;
font-size: 14px;
text-align: center;
color: #333;
background-color: #ccc;
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #333；
border-top-width: 1px;
border-top-style: solod;
border-top-color: #FFF;
border-right-width: 1px;
border-right-style: solod;
border-right-color: #FFF;
border-left-width: 1px;
border-left-style: solod;
border-left-color: #FFF;
}
table{
border: 1px solid #FFF;
}
h1{font-size:22px;color:#333;text-align:center;margin:0px;line-height:1.5em}
   
   
   
    </style>
  
    



  </head>
  
  
  <body>
<c:if test="${not empty requestScope.ulist}">
   <h1>${requestScope.lou1}寝 &nbsp;${requestScope.qinshi1}室&nbsp;寝室成员信息</h1>
   <table width="650" border="1" align="center" >
     <tr>
       <th>序号</th>
       <th>姓名</th>
        <th>班级</th>
       <th>学号</th>
       <th>性别</th>
       <th>楼号</th>
       <th>寝室号</th>
       <th>床号</th>
       <th>寝室身份</th>
       <th>联系方式</th>
     </tr>
     <c:forEach items="${requestScope.ulist}" var="user">
     <tr>
       <td>${user.uid }</td>
       <td>${user.uname }</td>
       <td>${user.uclass}</td>
       <td>${user.unumber}</td>
       <td>${user.usex ?"女":"男" }</td>
       <td>${user.udorm }</td>
       <td>${user.uhouse } </td>
       <td>${user.ubed }</td>
       <td>${user.uidentity ?"寝室长":"寝室成员" }</td>
       <td>${user.utel }</td>
     </tr>
     </c:forEach>
     </table>
 </c:if>
 <c:if test="${ empty requestScope.ulist }">
 <p>&nbsp;&nbsp;&nbsp;</p>
  <p>&nbsp;&nbsp;&nbsp;</p>
   <p>&nbsp;&nbsp;&nbsp;</p>
   <h1>您输入的楼号及寝室号不存在！</h1>
  <h1>请重新<a href="../admin/admincenter.jsp">输入</a>！</h1>
 </c:if>
  </body>
</html>

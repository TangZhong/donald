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
   <h1>所有水电费用信息</h1>
  <div id="main">
   <c:forEach items="${requestScope.feelist}" var="fee">
   <div class="showuser">
       <p> <span class="number">${fee.fid}</span>&nbsp;&nbsp;</p>
       <p><h3>楼号：</h3>${fee.udorm } &nbsp;&nbsp;&nbsp;  </p>
        <p><h3>寝室号：</h3> ${fee.uhouse } &nbsp;&nbsp;&nbsp; </p>
       <p><h3>水费：</h3>${fee.fw}</p>
       <p><h3>电费：</h3>${fee.fe} </p>
       <p><h3>总和：</h3>${fee.ft } </p>
         <form action="../fee/Feefi" method="get">
              <p><h3>上缴情况：</h3> </p>
              <input type="hidden" name="fid" value="${fee.fid}"/>
              <input type="submit" name="feefi" value="${fee.fi?'未上缴':'已上缴'}"/>
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
         <a href="GetFeeInfoByPageNo?pageNo=1">第一页</a>&nbsp;&nbsp;
         <a href="GetFeeInfoByPageNo?pageNo=${requestScope.pageNo-1 }">前一页</a>&nbsp;&nbsp;
    </c:if>
        <c:if test="${requestScope.pageNo==requestScope.pageCount}">
                         后一页  &nbsp;&nbsp;最后页&nbsp;&nbsp;
    </c:if>
    <c:if test="${requestScope.pageNo<requestScope.pageCount}">
         <a href="GetFeeInfoByPageNo?pageNo=${requestScope.pageNo+1 }">后一页</a>&nbsp;&nbsp;
         <a href="GetFeeInfoByPageNo?pageNo=${requestScope.pageCount}">最后页</a>&nbsp;&nbsp;
    </c:if>
    </p>
    </div>
  </body>
</html>

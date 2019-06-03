<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qszsearch.jsp' starting page</title>
    
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
    <table width="100%%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td >欢迎！${user.uname}登录${user.udorm}楼${user.uhouse}寝
                  </tr>
                </table>
                
                 <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr align="center"  class="t1">
                    <td ><strong>编号</strong></td>
                    <td ><strong>床位</strong></td>
                    <td ><strong>姓名</strong></td>
                    <td ><strong>性别</strong></td>
                    <td ><strong>学号</strong></td>          
                    <td ><strong>班级</strong></td>
                    <td ><strong>电话</strong></td>
                    <td ><strong>修改</strong></td>
                    <td ><strong>确认</strong></td>
                  </tr>
                  <s:iterator id="main" value="list">
                    <tr align="center">
                      <td height="25" align="center">${Student_Username}</td>
                      <td>${user.uid}</td>
                      <td>${user.ubed}</td>
                      <td>${user.uname}</td>
                      <td>${user.usex ?&quot;女&quot;:&quot;男&quot; }</td>
                      <td>${user.unumber}</td>
                      <td>${user.uclass}</td>
                      <td>${user.utel}</td>
                      <td><input type="submit" name="button" id="button" value="修改"></td>
                      <td><input type="button" name="button2" id="button2" value="确认"></td>
        </tr>
                     
                    </tr>
                  </s:iterator>
                    <div id="footer"> 
    <p>
    <c:if test="${requestScope.pageNo==1}">
                         第一页  &nbsp;&nbsp;前一页&nbsp;&nbsp;
    </c:if>
    <c:if test="${requestScope.pageNo>1}">
         <a href="../admin/GetUserInfoByPageNoAndUsex?pageNo=1">第一页</a>&nbsp;&nbsp;
         <a href="../admin/GetUserInfoByPageNoAndUsex?pageNo=${requestScope.pageNo-1}">前一页</a>&nbsp;&nbsp;
    </c:if>
        <c:if test="${requestScope.pageNo==requestScope.pageCount}">
                         后一页  &nbsp;&nbsp;最后页&nbsp;&nbsp;
    </c:if>
    <c:if test="${requestScope.pageNo<requestScope.pageCount}">
         <a href="../admin/GetUserInfoByPageNoAndUsex?pageNo=${requestScope.pageNo+1}">后一页</a>&nbsp;&nbsp;
         <a href="../admin/GetUserInfoByPageNoAndUsex?pageNo=${requestScope.pageCount}">最后页</a>&nbsp;&nbsp;
    </c:if>
    </p>
    </div>            
                  
                  
                </table>
  </body>
</html>

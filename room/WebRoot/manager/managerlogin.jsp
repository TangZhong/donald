<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     <style type ="text/css">
form{width:300px;
	margin-left:auto;
      margin-right:auto;
	  background-color:#FFC}
#uname{
	background-repeat:no-repeat;
	text-indent:30px;}
#upass{
	background-repeat:no-repeat;
	text-indent:30px;}
</style>
    
    <title>My JSP 'managerlogin.jsp' starting page</title>
    
	

  </head>
  
   <body>
  <div align="center">
  <form action="../admin/AdminLogin" method="post" name="form1" onsubmit="return checkform()"> 
<h3 align="center"><strong>宿管登录 </strong></h3> 
<table width="281" border="0" align="center"> 
  <tr> 
    <td width="77"><h5 align="center">用户名：</h5></td> 
    <td width="217"><input type="text" id="mname" name="mname" value="cp" placeholder="请输入用户名"></td> 
  </tr> 
  <tr> 
    <td><h5 align="center">密码：</h5></td> 
    <td><input type="password" id="mpass" name="mpass" value="111111" placeholder="密码至少为6位"></td> 
  </tr> 
</table> 
<div align="center"> 
  <input type="submit" name="regsubmit" value="提交"> 
  <input type="reset" name="regrest" value="重置"> 
</div> 
</form>
</div>
  </body>
</html>

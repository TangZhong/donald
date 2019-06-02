<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
    <title>My JSP 'newlogin.jsp' starting page</title>


  </head>
  
  <body>
   <form action="Loginservlet" method="post" name="form1">
<h3 align="center"><strong>用户登录 </strong></h3>
<table width="312" border="0" height="258">
 <tr>
    <td width="77"><h5 align="center">姓名：</h5></td>
    <td width="217"><input id="uname" name="uname" type="text" value="张三" placeholder="请输入用户名"></td>
  </tr>
  
  <tr>
    <td><h5 align="center">密码：</h5></td>
    <td><input id="upass" name="upass" type="password"  value="123456"placeholder="密码至少为6位"></td>
  </tr>
  
   <tr>
    <td><h5 align="center">登录身份：</h5></td>
    <td>
		<label class="radio inline">
			<input id="dormManager" type="radio" name="uidentity" value="寝室长" ${uidentity==1?'checked':''} /> 寝室长
		</label>
		<label class="radio inline">
			<input id="student" type="radio" name="uidentity" value="其他学生"  ${uidentity==0?'checked':''}/>其他学生
		</label>

      </td> 
      </table>
      <div align="center">
<input type="checkbox" name="check" value="check"/>自动登录
</div> 
<div align="center">
  <input name="regsubmit" type="submit" value="提交">
  <input name="regrest" type="reset" value="重置">
</div>
</form>
  </body>
</html>

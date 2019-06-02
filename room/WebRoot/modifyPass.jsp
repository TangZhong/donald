<%@ page language="java" import="java.util.*,Bean.UserBean" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <style type="text/css">
   table{background-color:#eeffaa}
   #uaddress{width:350px;}
   body{font=size:14px;}
   function checkform(){
	var userpass=upassform.upass1.value;
	var usernewpass1=upassform.unewpass1.value;
	var usernewpass2=upassform.unewpass2.value;
	if( userpass==""){
		alert("请输入密码!");
		return false;
	}
   if( usernewpass1==""){
		alert("请输入密码!");
		return false;
	}
	if( usernewpass2==""){
		alert("请再次输入密码!");
		return false;
	}
	if( usernewpass1.length<6){
		alert("请输入至少6位数!");
		return false;
	}
    if( usernewpass2.length<6){
		alert("请输入至少6位数!");
		return false;
	} 
	if( usernewpass1!= usernewpass2){
		alert("你两次输入的密码不一样!");
		return false;
	}
	 return ture;	
}
   
   </style>

  </head>
  
  <body>
   <form action="ModifyPass" method="post" name="upassform" onSubmit="return checkform()">
    <h3 align="center"><strong>修改密码 </strong></h3>
   <table width="500" border="0" height="167" style="height:167px" align="center">
   <tr>
    <td height="26"><h4 align="center">原密码:</h4></td>
    <td><input name="upass1" type="text" value="" ></td>
  </tr>
   <tr>
    <td height="26"><h4 align="center">密码：</h4></td>
    <td><input name="unewpass1" type="text" value="" ></td>
  </tr>
 <tr>
    <td height="26"><h4 align="center">重复密码：</h4></td>
    <td><input name="unewpass2" type="text" value="" ></td>
  </tr>
  </table>
  <div align="center">
  <input name="regsubmit" type="submit" value="提交">
  <input name="regrest" type="reset" value="重置">
   </div>
  </form>
  </body>
</html>

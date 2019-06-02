<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>寝室长修改寝室成员信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
	    <style type="text/css">
   table{background-color:#eeffaa}
   #uaddress{width:350px;}
   body{font=size:14px;}
   function checkform(){
	var adminpass=apassform.apass1.value;
	var adminnewpass1=apassform.anewpass1.value;
	var adminnewpass2=apassform.anewpass2.value;
	if( adminrpass==""){
		alert("请输入密码!");
		return false;
	}
   if(  adminnewpass1==""){
		alert("请输入密码!");
		return false;
	}
	if(  adminnewpass2==""){
		alert("请再次输入密码!");
		return false;
	}
	if( adminnewpass1.length<6){
		alert("请输入至少6位数!");
		return false;
	}
    if(  adminnewpass2.length<6){
		alert("请输入至少6位数!");
		return false;
	} 
	if(  adminnewpass1!= adminnewpass2){
		alert("你两次输入的密码不一样!");
		return false;
	}
	 return ture;	
}
   
   </style>

  </head>
  
   <body>
    <form action="../admin/AdminModifyPass" method="post" name="apassform" onSubmit="return checkform()">
    <h3 align="center"><strong>修改密码 </strong></h3>
   <table width="500" border="0" height="167" style="height:167px" align="center">
   <tr>
    <td height="26"><h4 align="center">原密码:</h4></td>
    <td><input name="apass1" type="text" value="" ></td>
  </tr>
   <tr>
    <td height="26"><h4 align="center">密码：</h4></td>
    <td><input name="anewpass1" type="text" value="" ></td>
  </tr>
 <tr>
    <td height="26"><h4 align="center">重复密码：</h4></td>
    <td><input name="anewpass2" type="text" value="" ></td>
  </tr>
  </table>
  <div align="center">
  <input name="regsubmit" type="submit" value="提交">
  <input name="regrest" type="reset" value="重置">
   </div>
  </form>
  </body>
</html>

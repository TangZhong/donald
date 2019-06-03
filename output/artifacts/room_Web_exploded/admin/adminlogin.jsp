<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
  <head>
  <style type ="text/css">
form{width:281px;
	margin-left:auto;
      margin-right:auto;
	  background-color:#FFC}
#aname{
	background-repeat:no-repeat;
	text-indent:30px;}
#apass{
	background-repeat:no-repeat;
	text-indent:30px;}
</style>
<script type="text/javascript">
function checkform(){
	var adminname=form1.aname.value;
	var adminpass=form1.apass.value;
	if(adminname==""){
		alert("请输入用户名!");
		return false;
	}

	if( adminpass==""){
		alert("请输入密码!");
		return false;
	}
	
	if(adminpass.length<6){
		alert("请输入至少6位数!");
		return false;
	}
     return ture;	
}
</script>

  </head>
  
  <body>
  <div align="center">
  <form action="../admin/AdminLogin" method="post" name="form1" onsubmit="return checkform()"> 
<h3 align="center"><strong>管理员登录 </strong></h3> 
<table width="281" border="0" align="center"> 
  <tr> 
    <td width="77"><h5 align="center">用户名：</h5></td> 
    <td width="217"><input type="text" id="aname" name="aname" value="yyj" placeholder="请输入用户名"></td> 
  </tr> 
  <tr> 
    <td><h5 align="center">密码：</h5></td> 
    <td><input type="password" id="apass" name="apass" value="111111" placeholder="密码至少为6位"></td> 
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


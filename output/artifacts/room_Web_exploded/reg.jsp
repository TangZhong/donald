<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>寝室信息添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <style type ="text/css">
form{width:340px;
	margin-left:auto;
      margin-right:auto;
	  background-color:#FFC}
</style>
<title>用户注册</title>
<script type="text/javascript">
function checkform(){
	var username=form1.uname.value;
	var usernumber=form1.unumber.value;
	var useudorm=form1.udorm.value;
	var userpass1=form1.upass1.value;
	var userpass2=form1.upass2.value;
	var useremail=form1.uemail.value;
	var usertel=form1.utel.value;
	var userplace=form1.uplace.value;
	if(username==""){
		alert("请输入用户名!");
		return false;
	}
	if(useudorm==""){
		alert("请输入寝室号!");
		return false;
	}
	if(userpass1==""){
		alert("请输入密码!");
		return false;
	}
	if(userpass2==""){
		alert("请再次输入密码!");
		return false;
	}
	if(userpass1.length<6){
		alert("请输入至少6位数!");
		return false;
	}
    if(userpass2.length<6){
		alert("请输入至少6位数!");
		return false;
	} 
	if(userpass1!=userpass2){
		alert("你两次输入的密码不一样!");
		return false;
	}
	if( useremail==""){
		alert("请输入邮箱!");
		return false;
	}
	if(usertel==""){
		alert("请输入联系方式!");
		return false;
	}
		if(userplace==""){
		alert("请输入地址!");
		return false;
	}
	 return ture;	
	
}
</script>
</head>

<body>
<form action="Regservlet" method="post" name="form1" onSubmit="return checkform()">
<h3 align="center"><strong>寝室成员信息登记 </strong></h3>
<table width="340" border="0">
  <tr>
    <td width="98" height="28"><h4 align="center">用户名：</h4></td>
    <td width="244"><input name="uname" type="text" value="gfgf" placeholder="请输入用户名" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">学号：</h4></td>
    <td width="244"><input name="unumber" type="text" value="1620420388" placeholder="请输入学号" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">班级：</h4></td>
    <td width="244"><input name="uclass" type="text" value="16电商3班" placeholder="请输入学号" ></td>
  </tr>
 
  <tr>
    <td height="30"><h4 align="center">密码：</h4></td>
    <td><input name="upass" type="password" value="111111" placeholder="密码至少为6位" ></td>
  </tr>
  <tr>
    <td height="28"><h4 align="center">重复密码：</h4></td>
    <td><input name="upass2" type="password"  value="111111" placeholder="密码至少为6位" ></td>
  </tr>
    <tr>
    <td width="98" height="28"><h4 align="center">宿舍楼：</h4></td>
    <td width="244"><input name="udorm" type="text" value="12" placeholder="请输入寝室号" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">寝室号：</h4></td>
    <td width="244"><input name="uhouse" type="text" value="506" placeholder="请输入寝室号" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">床位号：</h4></td>
    <td width="244"><input name="ubed" type="text" value="1" placeholder="请输入寝室号" ></td>
  </tr>
  
  <tr>
    <td height="33"><h4 align="center">性别：</h4></td>
    <td><h4>
      <label>
        <input type="radio" name="usex" value="男" id="usex_0">
        男
        </label>
      <label>
        <input type="radio" name="usex" value="女" id="usex_1">
        女</label>
    </h4></td>
  </tr>
  <tr>
    <td height="33"><h4 align="center">寝室身份：</h4></td>
    <td><h4>
      <label>
        <input type="radio" name="uidentity" value="寝室长" id="uidentity_1">
     寝室长
        </label>
      <label>
        <input type="radio" name="uidentity" value="其他学生" id="uidentity_0">
       其他学生</label>
    </h4></td>
  </tr>
   <tr>
    <td height="26"><h4 align="center">联系电话：</h4></td>
    <td><input name="utel" type="text" value="1111268" placeholder="请输入您的电话"></td>
  </tr>
 
</table>
<div align="center">
  <input name="regsubmit" type="submit" value="提交">
  <input name="regrest" type="reset" value="重置">
</div>
</form>
</body>

</html>

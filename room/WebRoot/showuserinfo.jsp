<%@ page language="java" import="java.util.*,Bean.UserBean" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <title>用户个人信息</title>
   <style type="text/css">
   table{background-color:#eeffaa}
   #uaddress{width:350px;}
   body{font=size:14px;}
   function checkform(){
	var useremail=regform.uemail.value;
	var usertel=regform.utel.value;
	var userplace=regform.uplace.value;
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
   
   </style>
  </head>
  
  <body>
   <%UserBean user=(UserBean)request.getAttribute("user");
    if(user!=null){
    %>
   <form action="../UpdateInfo" method="post" name="regform" onSubmit="return checkform()">
    <h3 align="center"><strong>用户个人信息 </strong></h3>
   <table width="500" border="0" height="167" style="height:167px;"align="center">
   <tr>
    <td height="26"><h4 align="center">用户名:</h4></td>
    <td><input name="uname" type="text" value="<%=user.getUname() %>" disabled="disabled" ></td>
  </tr>
  <tr>
    <td height="26"><h4 align="center">性别:</h4></td>
    <td><h4>
      <label>
        <input type="radio" name="usex" value="男" <%=user.isUsex()==false?"checked='checked'":"" %>>
                     男
        </label>
      <label>
        <input type="radio" name="usex" value="女" <%=user.isUsex()==true?"checked='checked'":"" %> >
                 女
        </label>
    </h4></td>
     </tr>
   <tr>
    <td height="26"><h4 align="center">邮箱：</h4></td>
    <td><input name="uemail" type="text" value="${user.uemail}" ></td>
  </tr>
 <tr>
    <td height="26"><h4 align="center">联系方式：</h4></td>
    <td><input name="utel" type="text" value="${user.utel}" ></td>
  </tr>
 <tr>
    <td height="26"><h4 align="center">地址：</h4></td>
    <td><input name="uplace" type="text" value="${user.uplace}" ></td>
  </tr>
  <tr>
  <td colspan="2" align="center">
  <input type="submit" value="修改用户信息" name="submit">
  </td>
  </tr>
  </table>
  </form>
  <%} %>
  </body>
</html>

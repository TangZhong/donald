<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
 <style type ="text/css">
form{width:750px;
	margin-left:auto;
      margin-right:auto;
	  background-color:beige
	  }
</style>

</head>

<body>
<form action="../fee/Feereg" method="post" name="form1" onSubmit="return checkform()">
<div align="center"> 
<h3 align="center"><strong>水电费用发布 </strong></h3>
<table width="340" border="0">
    <tr>
    <td width="98" height="28"><h4 align="center">楼号：</h4></td>
    <td width="244"><input name="udorm" type="text" value="16" placeholder="请输入寝室号" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">寝室号：</h4></td>
    <td width="244"><input name="uhouse" type="text" value="413" placeholder="请输入寝室号" ></td>
  </tr>
 <tr>
    <td width="98" height="28"><h4 align="center">水费：</h4></td>
    <td width="244"><input name="fw" type="text" value="50"  ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">电费：</h4></td>
    <td width="244"><input name="fe" type="text" value="100"  ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">总和：</h4></td>
    <td width="244"><input name="ft" type="text" value=150 ></td>
  </tr>
</table>
<div align="center">
  <input name="regsubmit" type="submit" value="提交">
  <input name="regrest" type="reset" value="重置">
</div>
</div>
</form>
</body>

</html>

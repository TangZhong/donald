<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type ="text/css">
form{width:750px;
	margin-left:auto;
      margin-right:auto;
	  background-color:beige}
</style>



</head>

<body><form action="../fee/GetFeeInfo" method="post" name="form1" onSubmit="return checkform()">
<div align="center"> 
<h3 align="center"><strong>寝室水电费用查询 </strong></h3>
<table width="340" border="0" height="95">
     <tr>
    <td width="98" height="28"><h4 align="center">宿舍楼：</h4></td>
    <td width="244"><input name="udorm" type="text" value="16" placeholder="请输入寝室号" ></td>
  </tr>
   <tr>
    <td width="98" height="28"><h4 align="center">寝室号：</h4></td>
    <td width="244"><input name="uhouse" type="text" value="413" placeholder="请输入寝室号" ></td>
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


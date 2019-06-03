<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'recordSave.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function checkForm(){
	var usernumber=form1.uname.value;
	var detail=document.getElementById("detail").value;
	
	if(usernumber==""){
		alert("请输入学号!");
		return false;
	}
	if(detail==""){
		alert("请输入日期!");
		return false;
	}
	 return ture;	
	
}
</script>
  </head>
  
  <body>
    <div class="data_list">
		<div class="data_list_title">
		<c:choose>
			<c:when test="${user.uid!=null }">
				修改缺勤记录
			</c:when>
			<c:otherwise>
				添加缺勤记录
			</c:otherwise>
		</c:choose>
		</div>
		<form action="RecordServlet?action=save" method="post" onsubmit="return checkForm()">
			<div class="data_form" >
				<input type="hidden" id="recordId" name="recordId" value="${record.recordId }"/>
					<table align="center">
						<tr>
							<td><font color="red">*</font>学号：</td>
							<td><input type="text" id="usernumber"  name="usernumber" value="${record.usernumber }"  style="margin-top:5px;height:30px;"  /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>日期：</td>
							<td><input type="text" id="date"  name="date" value="${record.date==null?date:record.date }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>备注：</td>
							<td><input type="text" id="detail"  name="detail" value="${record.detail }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
					</table>
					<div align="center">
						<input type="submit" class="btn btn-primary" value="保存"/>
						&nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='record.jsp'">返回</button>
					</div>
					<div align="center">
						<font id="error" color="red">${error }</font>
					</div>
			</div>
		</form>
</div>
  </body>
</html>

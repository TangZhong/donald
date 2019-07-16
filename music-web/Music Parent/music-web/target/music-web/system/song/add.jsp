<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加歌曲</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script charset="utf-8" src="js/common/jquery-1.11.1.js">	
	</script>
	
	<style type="text/css">		
		/* 整体框架css  */
		.all{
			width: 100%;
			height: 860px;
		}
		/* 标题css  */
		.title{
			width: 100%;
			height: 40px;
		}
		.title h2{
			width:90%;
			height: 40px;
			float: left;
			text-align:center;
		}
		
		/* content css  */
		.content{
			width:90%;
			float: left;
			margin-left: 30px;
		}
		.content table {
			margin: 0px auto;
		}
		/*表格的每一行*/
		.content table tr{
			height: 50px;			
		}
		.content table td {		
			min-width: 150px;
			max-width: 720px;
		}
		.content table input[type='text'] {
			width: 200px;
		}
		.content table input[type='radio'] {
			position: relative;
			top: 8px;
		}
		.content .submit{
			cursor: pointer;
			border:none;
			border-radius:3px;
			background-color: #eb6120;
			color: white;
			height: 28px;
		}
		.redBt {
			text-decoration:none;
			color:#fff;
			height:30px;
			padding: 6px 12px;
			border-radius:3px;
			background-color:#EB6120;
		}
		.redBt:hover {
			background-color:#FE7600;
		}
		
		/*提示文字样式*/
		.span{
			font-family: "微软雅黑";
			font-size: 12px;
			color: red;
		}
		.content input, .content select, .content option {
			font-size: 13px;
			height: 30px;
		}
		.content select {
			width: 100px;
		}
		.content otpion {
			width: 80px;
			height: 25px;
			padding-top: 5px;
		}
		.content textarea {
			font-size: 13px;
		}
	</style>

  </head>
  
  <body>
   	<div class="all">
   		<div class="title">
   			<h2>添加歌曲</h2>
   		</div>   		
   		<div class="content">
			<form action="sys/addSong.action" method="post" enctype="multipart/form-data">
				<input type="hidden" name="albumInfo" value="${vo.id}">
				<table class="addAlbumTable">
					<tr>
						<td >歌曲名：</td> <td><input type="text" name="name" maxlength="25" required="required"/></td>
					</tr>
					<tr>
						<td >歌手：</td>
						<td>
							<input type="text" id="singer" maxlength="80" required="required" name="singer"/>
						</td>
					</tr>
					<!-- <tr>
                        <td >语言：</td> <td><input type="text" name="language" maxlength="40" required="required"></td>
                    </tr> -->
					<tr>
						<td >时长：</td> <td><input type="text" name="duration" placeholder="时长(单位为秒)" required="required"></td>
					</tr>
					<tr>
						<td >上传音频文件：</td><td><input type="file" name="big" required="required" /></td>
					</tr>
					<tr>
						<td >上传歌词文件：</td><td><input type="file" name="small" required="required"/></td>
					</tr>
					<tr>
						<td>歌曲描述：</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea name="description" cols="50" rows="5" maxlength="100"></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input class="btn redBt" type="submit" value="确认添加" />
							<input class="btn redBt" type="button" value="取消" />
						</td>
					</tr>
				</table>
			</form>

		</div>
   	</div>
  </body>
</html>
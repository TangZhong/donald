<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/content.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/register.css">
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="content">
		<div id="content-left">
			<div class="gray">
				<img src="images/bullet1.gif"> 注册
			</div>
			<div id="reg_top">
				<div class="item">
					<div class="box_top"></div>
					<div class="box_center">
						<div class="orange">致辞:</div>
						<p class="details">欢迎加入Book
							Store商店，在这里你可以买到很多很多好玩又好看的书。不仅能增加你的知识，还能边看边玩。</p>
					</div>
					<div class="box_bottom"></div>
				</div>
			</div>
			<div id="register">

				<c:if test="${errors!=null}">
				<c:forEach items="${errors }" var="error">
						<div style="font-size:15px;margin:3px 0 3px 1px;color:red;">${error.defaultMessage}</div>
					</c:forEach>
				</c:if>
				<table>
					<tr>
						<td>书名</td>
						<td>简介</td>
						<td>详细介绍</td>
						<td>价格</td>
						<td>操作</td>
					</tr>
					<c:forEach items="goodsList" var="goods">
						<tr>
							<td>${goods.goodsname}</td>
							<td>${goods.breifintroduction}</td>
							<td>${goods.detailintroduction}</td>
							<td>${goods.goodsprice}</td>
							<td><a href="">编辑</a> | <a href="">删除</a> </td>
							<td></td>
						</tr>
					</c:forEach>
				</table>

			</div>
		</div>
		<jsp:include page="content-right.jsp"></jsp:include>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>

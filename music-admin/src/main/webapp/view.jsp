<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${song.name}</title>
    	
	<link rel="stylesheet" type="text/css" href="css/user/song.css">
	
	<script type="text/javascript" src="js/common/jquery-1.11.1.js"></script>
   	
   	<script type="text/javascript">

   	</script>
  </head>

  <body>
  <div class="content">
	  <h2 class="tit">歌曲列表</h2>
	  <!-- 歌曲列表 -->
	  <form method="post" name="songForm">
		  <div class="song-list">
			  <%--<div class="u-title u-title-1">
				  <span class="hd f-fl">歌曲</span>
				  <span class="sub f-fl"><span id="songCount">${pageBean.totalRecords}</span>首</span>
				  <span class="key f-ff2"><input type="text" name="name" placeholder="歌曲名" value="${key}"><input type="submit" value="搜索"></span>
			  </div>--%>
			  <table class="m-table">
				  <thead>
				  <tr>
					  <!-- <th class="first w1"><div class="wp">ID</div></th> -->
					  <th><div class="wp">歌手</div></th>
					  <th class="w2"><div class="wp">歌名</div></th>
					  <th class="w3"><div class="wp">专辑</div></th>
					  <th class="w4"><div class="wp">操作</div></th>
				  </tr>
				  </thead>
				  <tbody id="m-song-list-module">
				  <c:forEach items="${vo}" var="song">
					  <tr class="ztag even">
							  <%-- <td class="left first_td">${song.id}</td> --%>
						  <td class="second_td">
								  <%--<c:forEach items="${fn:split(song.singerInfo, ' ')}" var="singer">
                                      <a title="${fn:split(singer, ',')[1]}" href="sys/sysSinger_view.action?id=${fn:split(singer, ',')[0]}">${fn:split(singer, ',')[1]}</a>
                                  </c:forEach>--%>
							  <a>${song.singerName}</a>
						  </td>
						  <td class="third_td">
							  <a title="${song.songName}">${song.songName}</a>
						  </td>
						  <td  class="fourth_td">
							  <%--<c:forEach items="${fn:split(song.albumInfo, ' ')}" var="album">
								  <a title="${fn:split(album, ',')[1]}" href="sys/sysAlbum_view.action?id=${fn:split(album, ',')[0]}">《${fn:split(album, ',')[1]}》</a>
							  </c:forEach>--%>
						  </td>
						  <td class="fifth_td">
							  <%--<img class="editImg" alt="编辑" src="images/other/037.gif" style="cursor: pointer;" width="12" height="12">&nbsp;&nbsp;--%>
							  <!-- <img class="delImg" alt="删除" src="images/other/010.gif" style="cursor: pointer;" width="12" height="12"> -->
						  </td>
					  </tr>
				  </c:forEach>
				  </tbody>
			  </table>
		  </div>
	  </form>

  </div>
  </body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showchengji.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <script src="../js/jquery-3.4.1.min.js"></script>
  </head>

  <script type="text/javascript">
      $(document).ready(function(){
          $("ul li:eq(4)").addClass("active");
          $('.form_date').datetimepicker({
              language:  'en',
              weekStart: 1,
              todayBtn:  1,
              autoclose: 1,
              todayHighlight: 1,
              startView: 2,
              minView: 2,
              forceParse: 0
          });
          $('.datatable').dataTable( {
              "oLanguage": {
                  "sUrl": "/DormManage/media/zh_CN.json"
              },
              "bLengthChange": false, //改变每页显示数据数量
              "bFilter": false, //过滤功能
              "aoColumns": [
                  null,
                  null,
                  null,
                  null,
                  null,
                  { "asSorting": [ ] },
                  { "asSorting": [ ] }
              ]
          });
          $("#DataTables_Table_0_wrapper .row-fluid").remove();
      });

      window.onload = function(){
          $("#DataTables_Table_0_wrapper .row-fluid").remove();
      };

  </script>
  </head>

  <body>
  <div class="data_list">
      <div class="data_list_title">
          查看寝室评分
      </div>
      <form name="myForm" class="form-search" method="post" action="ScoreServlet?action=search" style="padding-bottom: 0px">
          <select id="searchType" name="searchType" style="width: 80px;">
              <option value="">全部</option>
              <option value="udorm">宿舍楼号</option>
              <option value="uhouse" ${searchType eq "number"?'selected':'' }>寝室号</option>
          </select>
          <span class="data_search">
              &nbsp;<input id="searchText" name="searchText" type="text"  style="width:120px;height: 30px;" class="input-medium search-query" value="${searchText }">
					<button type="submit" class="btn btn-info" onkeydown="if(event.keyCode==13) myForm.submit()">搜索</button>
          </span>
      </form>
      <div>
          <table class="table table-striped table-bordered table-hover datatable">
              <thead>
              <tr>
                  <th>宿舍楼号</th>
                  <th>寝室</th>
                  <th>得分</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach  varStatus="i" var="score" items="${scoreList}">
                  <tr>
                      <td>${score.udorm}</td>
                      <td>${score.uhouse}</td>
                      <td>${score.score}</td>
                  </tr>
              </c:forEach>
              </tbody>
          </table>
      </div>
      <div align="center"><font color="red">${error}</font></div>
  </div>
  </body>
</html>

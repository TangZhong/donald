<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'chengji.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <script src="../js/jquery-3.4.1.min.js"></script>
      <script src="../js/jquery-ui.min.js"></script>
  </head>

  <script type="text/javascript">
      function checkForm(){
          var udorm=document.getElementById("udorm").value;
          var uhouse=document.getElementById("uhouse").value;
          var score=document.getElementById("score").value;

          if(udorm==""){
              alert("请输入楼栋号!");
              return false;
          }
          if(uhouse==""){
              alert("请输入寝室号!");
              return false;
          }
          if(score==""){
              alert("请输入得分!");
              return false;
          }
          return ture;

      }
  </script>
  </head>

  <body>
  <div class="data_list">
      <div class="data_list_title">
          寝室打分
      </div>
      <form action="ScoreServlet?action=save" method="post" onsubmit="return checkForm()">
          <div class="data_form" >
              <input type="hidden" id="id" name="id" value="${score.recordId}"/>
              <table align="center">
                  <tr>
                      <td><font color="red">*</font>楼栋号：</td>
                      <td><input type="text" id="udorm"  name="udorm" value="${score.udorm}"  style="margin-top:5px;height:30px;"  /></td>
                  </tr>
                  <tr>
                      <td><font color="red">*</font>寝室号：</td>
                      <td><input type="text" id="uhouse"  name="uhouse" value="${score.uhouse}"  style="margin-top:5px;height:30px;" /></td>
                  </tr>
                  <tr>
                      <td><font color="red">*</font>得分</td>
                      <td><input type="text" id="score"  name="score" value="${score.score}"  style="margin-top:5px;height:30px;" /></td>
                  </tr>
              </table>
              <div align="center">
                  <input type="submit" class="btn btn-primary" value="保存"/>
                  &nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='record'">返回</button>
              </div>
              <div align="center">
                  <font id="error" color="red">${error}</font>
              </div>
          </div>
      </form>
  </div>
  </body>
</html>

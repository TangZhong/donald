<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>${msg }</title>
<style type="text/css">
  body{ text-align:center; 
  font-size:22px; 
  color:#333333;
  background-color:#F7FBFE;
  margin:0px; 
  margin-top:15px; 
  margin-bottom:0px; 
  margin-left:0px; 
  margin-right:0px;
    }  
</style>
<script type="text/javascript">
function closewindow(){
	window.parent.location.href=window.parent.location.href;
	parent.closeNewDiv();
}
function clock(){
	i = i -1;
	if(document.getElementById("info")){
		document.getElementById("info").innerHTML = "�����ڽ���"+i+"����Զ��ر�";
	}
	if(i > 0)
		setTimeout("clock();",1000);
	else
		closewindow();
}

var i = 4;
clock();

</script>
</head>
<body>
<center>
	${msg }<p>
	<div id="info">�����ڽ���3����Զ��ر�</div>
	<input type="button" value="�رմ���" onclick="closewindow();">
</center>
</body>
</html>
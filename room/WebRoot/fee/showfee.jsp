<%@ page language="java" import="java.util.*,Bean.FeeBean" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>

     <style type="text/css">
   
   tr{
   weight：650px;
line-height: 2em;
color:#053；
background-color: beige;
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #333；
border-top-width: 1px;
border-top-style: solod;
border-top-color: #FFF;
border-right-width: 1px;
border-right-style: solod;
border-right-color: #FFF;
border-left-width: 1px;
border-left-style: solod;
border-left-color: #FFF;
}
td{
line-height: 1.5em;
font-size: 14px;
text-align: center;
color: #333;
background-color: beige;
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #333；
border-top-width: 1px;
border-top-style: solod;
border-top-color: #FFF;
border-right-width: 1px;
border-right-style: solod;
border-right-color: #FFF;
border-left-width: 1px;
border-left-style: solod;
border-left-color: #FFF;
}
table{
border: 1px solid #FFF;
}
h1{font-size:22px;color:#333;text-align:center;margin:0px;line-height:1.5em}
   
    </style>
  
    



  </head>
  


  <body>
  <%FeeBean fee=(FeeBean)request.getAttribute("fee");
    if(fee!=null){
    %>
   <h1>${requestScope.lou2}寝 &nbsp;${requestScope.qinshi2}室&nbsp;寝室水电费用</h1>
    <form action="../fee/UpdateFee" method="post" name="feeform" onSubmit="return checkform()">
   <table width="650" border="1" align="center" >
    <tr>
    <td><h4 align="center">楼号</h4></td>
    <td><input name="udorm" type="text" value="${fee.udorm }" ></td>
  </tr>
   <tr>
    <td><h4 align="center">寝室号</h4></td>
    <td><input name="uhouse" type="text" value="${fee.uhouse}"></td>
  </tr>
   <tr>
    <td><h4 align="center">水费</h4></td>
    <td><input name="fw" type="text" value="${fee.fw}" ></td>
  </tr>
 <tr>
    <td><h4 align="center">电费</h4></td>
    <td><input name="fe" type="text" value="${fee.fe}" ></td>
  </tr>
 <tr>
    <td ><h4 align="center">总和</h4></td>
    <td><input name="ft" type="text" value="${fee.ft}" ></td>
  </tr>
  <tr>
    <td><h4 align="center">上缴情况</h4></td>
    <td>
         <label>
        <input type="radio" name="fi" value="未上缴" <%=fee.isFi()==true?"checked='checked'":"" %>> 未上缴
        </label>
         <label>
        <input type="radio" name="fi" value="已上缴" <%=fee.isFi()==false?"checked='checked'":"" %>>已上缴
        </label>
      </td>
     </tr>
      <tr>
    <td colspan="2" align="center">
     <input type="submit" value="修改水电费用" name="submit">
     </td>
     </tr>
     </table>
     </form>
       <%} if(fee==null){%>
   <p>&nbsp;&nbsp;&nbsp;</p>
  <p>&nbsp;&nbsp;&nbsp;</p>
   <p>&nbsp;&nbsp;&nbsp;</p>
   <h1>您输入的楼号及寝室号不存在！</h1>
  <h1>请重新<a href="../admin/admincenter.jsp">输入</a>！</h1>    
   <%} %> 
  </body>
</html>

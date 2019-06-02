<%@ page language="java" import="java.util.*,Bean.FeeBean" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>

     <style type="text/css">
   
   th{
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

   <h1>${requestScope.lou}寝 &nbsp;${requestScope.qinshi}室&nbsp;寝室水电费用</h1>
  <table width="650" border="1" align="center" >
     <tr>
       <th>水费</th>
       <td>${fee.fw}</td>
     </tr>
     <tr>
       <th>电费</th>
       <td>${fee.fe}</td>
     </tr>
     <tr>
       <th>总和</th>
       <td>${fee.ft}</td>
     </tr>
     <tr>
       <th>上缴情况</th>
       <td>
         <c:if test="${fee.fi}">
           <h4>确认无误后,请上缴水电费用！</h4>
           <form action="UserUpdateFee" method="get">
              <input type="hidden" name="fid" value="${fee.fid}"/>
              <input type="submit" name="feefi" value="${fee.fi?'确认上缴':'已上缴'}"/>
           </form>
        </c:if>
        <c:if test="${not fee.fi}">
        <h4>水电费用已上缴！请勿重复上缴！</h4>
        </c:if>
        </td>
     </tr>
     </table>
  </body>
</html>
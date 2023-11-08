<%@ page import="com.example.bank_project_usebean.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-11-2023
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="UserName" class="com.example.bank_project_usebean.BankAccount_details" scope="application"/>
<jsp:setProperty name="UserName" property="name" param="Name"/>
<jsp:setProperty name="UserName" property="user_id" param="User_id"/>
<jsp:setProperty name="UserName" property="password" param="password"/>
<jsp:setProperty name="UserName" property="mobile" param="mobile"/>
<jsp:setProperty name="UserName" property="address" param="Address"/>
<jsp:setProperty name="UserName" property="city" param="City"/>
<jsp:setProperty name="UserName" property="balance" param="Balance"/>

<%
  ServiceClass serviceClass = new ServiceClass();
  if(serviceClass.insertRecord(UserName)!=0)
  {
    out.println("<h3 align=center>Data inserted</h3>");
  }else{
    out.println("<h3>Unable to insert record</h3>");
  }



%>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>

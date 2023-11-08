<%@ page import="com.example.bank_project_usebean.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08-11-2023
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bank_project_usebean.BankAccount_details" scope="application"/>
<jsp:setProperty name="bank" property="user_id"  value='<%=session.getAttribute("User_id")%>'  />
<jsp:setProperty name="bank" property="password" param="amount"/>

<%
  ServiceClass serviceClass = new ServiceClass();
  if(serviceClass.insertRecord(bank)!=0)
  {
    out.println("<h3 align=center>Data inserted</h3>");
  }else {
      out.println("<h3>Unable to insert record</h3>");
  }
        }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>

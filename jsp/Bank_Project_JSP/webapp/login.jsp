<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.example.bank_project_usebean.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-11-2023
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bank_project_usebean.BankAccount_details" scope="application"/>
<jsp:setProperty name="bank" property="user_id" param="username" />
<jsp:setProperty name="bank" property="password" param="password" />
<%
    ServiceClass serviceClass = new ServiceClass();
    ResultSet resultSet = serviceClass.loginAccount(bank);
    if (resultSet.next()){

        out.println("login successful");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Homepage.jsp");
        requestDispatcher.forward(request,response);
        session.setAttribute("User_id",bank.getUser_id());


    }else {
        out.println("Incorrect username or password");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>

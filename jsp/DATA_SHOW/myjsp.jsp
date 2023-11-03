<%-- 
    Document   : myjsp
    Created on : 2 Nov, 2023, 2:46:14 PM
    Author     : Pradnya
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.io.PrintWriter" %>

<%

    String rollNo=request.getParameter("roll_no");
    String name=request.getParameter("s_name");
    String address=request.getParameter("s_address");
    String city=request.getParameter("s_city");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pradnya@121");
    PreparedStatement preparedStatement=con.prepareStatement("insert into stud_info values(?,?,?,?)");
    preparedStatement.setString(1,rollNo);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,address);
    preparedStatement.setString(4,city);
    int rs= preparedStatement.executeUpdate();

    PrintWriter printWriter=response.getWriter();
    if(rs!=0)
        out.println("Inserted");
    else
        out.println("Not Inserted");
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

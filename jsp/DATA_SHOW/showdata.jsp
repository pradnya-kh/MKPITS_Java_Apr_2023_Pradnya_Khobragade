<%-- 
    Document   : showdata
    Created on : 2 Nov, 2023, 3:34:25 PM
    Author     : Pradnya
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection connection;

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loading");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pradnya@121");
    System.out.println("Connection Established from database");

    Statement statement = connection.createStatement();
    ResultSet resultSet=statement.executeQuery("select * from student_details");
    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <table border="1px">
        <tr>
        <%
            for (int coloumIndex=1;coloumIndex<=resultSetMetaData.getColumnCount();coloumIndex++){
                %>
            <th><%=resultSetMetaData.getColumnName(coloumIndex)%></th>
        <%
            }
        %>
        </tr>

        <%
            while (resultSet.next())
            {
                %>
        <tr>
            <td><%=resultSet.getString(1)%></td>
            <td><%=resultSet.getString(2)%></td>
            <td><%=resultSet.getString(3)%></td>
            <td><%=resultSet.getString(4)%></td>
        </tr>
        <%
            }
        %>

    </table>
        <h1>Hello World!</h1>
    </body>
</html>

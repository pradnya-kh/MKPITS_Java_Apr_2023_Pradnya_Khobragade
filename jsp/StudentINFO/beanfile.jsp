<%-- 
    Document   : myjsp
    Created on : 3 Nov, 2023, 1:08:16 PM
    Author     : Pradnya
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="s" class="stud.Student" scope="application"/>
    <jsp:setProperty name="s" property="RollNO" value="1001"/>
    <jsp:setProperty name="s" property="Name" value="Pradnya"/>
    <jsp:setProperty name="s" property="Address" value="IUDP"/>
    <jsp:setProperty name="s" property="City" value="Nagpur"/>
    
    
    <DOCTYPE html>
        <html>
            <head><title>Bean File</title>
            </head>
            <body>
                <table>
                    <tr>
                        <td>RollNo></td><td><jsp:getProperty name="s" property="RollNo"/></td></tr>
                    <td>Name</td><td><jsp:getProperty name="s" property="Name"/></td>
                    <td>Address</td><td><jsp:getProperty name="s" property="Address"/></td>
                    <td>City</td><td><jsp:getProperty name="s" property="City"/></td>
                    
                </table>
            </body>
        </html>

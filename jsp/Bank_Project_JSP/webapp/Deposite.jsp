<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08-11-2023
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-5 mb-4 col-lg-4 p-5 main" align="center">
    <form action="Depositejsp.jsp" method="post">
        <label><h3>Amount :</h3></label>
        <br>
        <input type="number" name="amount">
        <br>
        <br>
        <div align="center">
            <input type="submit" value="Deposit" class="btn btn-success fs-5 text-white">
        </div>
    </form>
</div>

</body>
</html>

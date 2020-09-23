<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 11:17:36 AM
    Author     : 730676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <br>
        <form method="post" action="age">
            <label> Enter your age:</label><input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
            <p><a href ="arithmetic">Arithmetic Calculator</a></p>
        </form>
    </body>
</html>

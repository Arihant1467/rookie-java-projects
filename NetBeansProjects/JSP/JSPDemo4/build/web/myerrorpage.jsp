<%-- 
    Document   : myerrorpage
    Created on : 14 Oct, 2014, 6:52:09 PM
    Author     : student
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Client!</h1>
        <p>Due to some technical issues exception raised, try later</p>
        <br>
        <p>Reason: <%= exception%></p>
    </body>
</html>

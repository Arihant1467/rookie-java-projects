<%-- 
    Document   : testhidden
    Created on : 13 Oct, 2014, 6:03:05 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hidden fields demo</h1>
        
        <%
        
        %>
        
        
        <form action="testhidden.jsp" method="get">
            <input type="text" name="txtName" placeholder="Enter Username"><br>
            <input type="hidden" name="hdata" value="this is hidden data">
            <input type="submit" value="Save">
        </form>
        
    </body>
</html>

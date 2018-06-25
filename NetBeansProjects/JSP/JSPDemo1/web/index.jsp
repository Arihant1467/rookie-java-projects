<%-- 
    Document   : index
    Created on : 10 Oct, 2014, 6:19:58 PM
    Author     : student
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="#" method="get">
            <input type="submit" value="Submit">
            
        </form>
        
        <%
            PrintWriter pw =response.getWriter();
            pw.write("Hello JSP");
        %>
    </body>
</html>

<%-- 
    Document   : home
    Created on : 14 Oct, 2014, 6:49:45 PM
    Author     : student
--%>

<%@page errorPage="myerrorpage.jsp" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int a=12,b=0;
            
            int c=a/b;
            
           out.print("Result is : " + c);
        %>
                
    </body>
</html>

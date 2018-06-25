<%-- 
    Document   : index
    Created on : 14 Oct, 2014, 6:08:48 PM
    Author     : student
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int fact(int num)        
            {
                int fact=1;
                while(num>1)
                {
                    fact*=num--;
                }
                return fact;
            }
        %>
        
        <%
            String u = config.getInitParameter("myurl");
            out.write(u);
            //Connection
            out.write("factorial of 6 is "+fact(6));
        %>
        
        <h3>Factorial of 5 is <%= fact(5)%></h3>
    </body>
</html>

<%-- 
    Document   : home
    Created on : 13 Oct, 2014, 6:25:22 PM
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
        <%
            HttpSession s = request.getSession(false);
            String un=(String)s.getAttribute("un");
            
            if(un==null)
            {
                response.sendRedirect("index.jsp");
            }
            
        %>
        <h1>Welcome to Transaction page</h1>
        <p>
            here you can find your all transaction
        </p>
        <a href="home.jsp">home</a>
    </body>
</html>

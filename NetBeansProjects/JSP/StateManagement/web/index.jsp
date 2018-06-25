<%-- 
    Document   : index
    Created on : 10 Oct, 2014, 6:42:56 PM
    Author     : student
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
             <%
             String uname=request.getParameter("txtUname");
             String upass=request.getParameter("txtUpass");
             String rem=request.getParameter("chkRemember");
             
             if(rem!=null)
             {
                 Cookie cuname= new Cookie("username", uname);
                 Cookie cupass=new Cookie("password", upass);
                 cuname.setMaxAge(5000);
                 cupass.setMaxAge(2000);
                 
                 response.addCookie(cuname);
                 response.addCookie(cupass);
             }
             
             
             %>   
             <%
             
                
                
                String retUname="",retUpass="";
             
                Cookie[] allCookies = request.getCookies();
                if(allCookies!=null)
                {
                    for (int i = 0; i < allCookies.length; i++) {
                            Cookie c = allCookies[i];
                            if(c.getName().equals("username"))
                            {
                                retUname=c.getValue();
                                System.out.println("username : "+ c.getValue());
                            }
                            if(c.getName().equals("password"))
                            {
                                retUpass=c.getValue();
                                System.out.println("password : "+ c.getValue());
                            }
                            
                        }
                }
                else
                {
                    System.out.println("Cookie Not Found");
                }
             
             %>
      

        <form action="index.jsp" method="get">
        <table>
            <tr>
                <td>
                    Username:
                </td>
                <td>
                    <input type="text" value="<%= retUname %>" placeholder="Username" name="txtUname">
                </td>
            </tr>
            <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input type="password" value="<%= retUpass   %>" placeholder="Password" name="txtUpass">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="checkbox" name="chkRemember">Remember Me
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
                <td align="right">
                    <input type="submit" value="Sign In">
                </td>
            </tr>
            <tr>
                <td>
                    <span id="msg">
                        
                    </span>
                </td>
            </tr>
        </table>
           
                
                    <a href="MyServlet?name="<%= uname %>>
                        Click here
                    </a>
                        </form>
    </body>
</html>

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
            String errormessage="";
          String uname = request.getParameter("txtUname");
          String upass = request.getParameter("txtUpass");
          
          if(uname==null || upass==null)
          {
              errormessage="Enter Username/Password";
          }
          else
          {
              Class.forName("oracle.jdbc.OracleDriver");
              Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.4:1521:ORCL","scott","tiger");
              PreparedStatement ps=conn.prepareStatement("select * from m_login where userid=? and upass=?");
              ps.setString(1, uname);
              ps.setString(2, upass);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                  response.sendRedirect("home.jsp");
              }
              else
              {
                  errormessage="Invalid Username/Password";
              }
              conn.close();
          }
        %>

        <form action="index.jsp" method="post">
        <table>
            <tr>
                <td>
                    Username:
                </td>
                <td>
                    <input type="text" placeholder="Username" name="txtUname">
                </td>
            </tr>
            <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input type="password" placeholder="Password" name="txtUpass">
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
                        <%=
                                errormessage
                        %>
                    </span>
                </td>
            </tr>
        </table>
            </form>
    </body>
</html>

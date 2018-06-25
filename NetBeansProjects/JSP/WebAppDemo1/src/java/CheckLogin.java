/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author administrator
 */
@WebServlet(urlPatterns = {"/CheckLogin"})
public class CheckLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname=req.getParameter("t1");
        String upass=req.getParameter("t2");
        String result="<html><body><b>";
        
        if(uname!=null || upass!=null)
        {
            
            try{
                Class.forName("oracle.jdbc.OracleDriver");
                 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.4:1521:orcl", "scott", "tiger");
                 if(conn!=null)
                 {
                     PreparedStatement ps = conn.prepareStatement("select * from m_login where userid=? and upass=?");
                     ps.setString(1, uname);
                     ps.setString(2, upass);
                     
                     ResultSet rs = ps.executeQuery();
                     if(rs.next())
                     {
                         //result="User is Authenticated";
                         resp.sendRedirect("home.html");
                     }
                     else
                     {
                         result+="Invalid Username/Password";
                         result+="<a href='index.html'>click here to re-login</a>";
                     }
                     
                     
                 }
                 else
                 {
                     result+="Connection failed";
                 }
           
            }
            catch(Exception ae)
            {
                System.out.println(ae);
                result+=ae.toString();
            }
        
        }
        
        else
        {
            result+="Invalid Input";
        }
    
        result+="</b></body></html>";
        resp.getWriter().write(result);
    
    }
    

}

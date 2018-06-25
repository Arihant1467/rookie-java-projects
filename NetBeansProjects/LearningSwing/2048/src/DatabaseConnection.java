
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DatabaseConnection 
{
    Connection conn=null;
    public DatabaseConnection()
    {
                   try
                   {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root"); 
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
                   
               
    }
    private void insert_score(int score,String username) throws Exception
    {
        PreparedStatement ps;
        ps=conn.prepareStatement("use game");// database name game
        ps.execute();
        ps=conn.prepareStatement("INSERT INTO data VALUES(?,?)");// fields username and score table data
        ps.setString(1, username);
        ps.setInt(2, score);
        ps.execute();
        System.out.println(""+username+" score has been entered");
    }
    private int retrieve_top()throws SQLException
    {
        PreparedStatement ps;
        String score="";
        ps=conn.prepareStatement("SELECT MAX(score) AS score from data");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            score=rs.getString("score");
        }
        System.out.println(score+"");
        return Integer.parseInt(score);
    }
    private String[] next5()throws SQLException
    {
        String [] n=new String[5];
        PreparedStatement ps;
        ps=conn.prepareStatement("SELECT * FROM data ORDER BY score DESC LIMIT 5");
        ResultSet rs=ps.executeQuery();
        int i=0;
        while(rs.next())
        {
           n[i]=rs.getString("username")+"  "+rs.getString("score");
           ++i;
        }
        System.out.println(n);
        return n;
    }
}

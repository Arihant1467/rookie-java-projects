
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NewClass 
{
    public static void main(String[] args) 
    {
        try
        {
            int amount=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root");
            PreparedStatement st=(PreparedStatement) connection.prepareStatement("insert into complain values(?,?)");
            PreparedStatement change_db=(PreparedStatement)connection.prepareStatement("use Mcdonald");
            change_db.execute();
            PreparedStatement st1=(PreparedStatement) connection.prepareStatement("select price from itemlist where itemid=?");
            st1.setString(1,"102");
            ResultSet rs=st1.executeQuery();
           // amount+=Integer.parseInt(rs.getString("price"));
            //System.out.println(amount);
            //rs.getString(1);
           
            if(rs.next())
            {
                String s=rs.getString(1);
                amount+=Integer.parseInt(s);
            }
            else
            {
                System.out.println("no");
            }
            amount+=60;
            System.out.println(amount+"");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

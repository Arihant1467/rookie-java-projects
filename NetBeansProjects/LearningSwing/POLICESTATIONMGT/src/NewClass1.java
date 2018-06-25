import java.sql.*;
public class NewClass1 
{
    public static void main(String[] args) throws SQLException
    {
        try
        {
        Connection cn =DriverManager.getConnection("jdbc:derby://localhost:1527/sample","root","root");
    
        }
        catch(SQLException e)
        {
            System.out.println("Error not connected");
        }
    }    
}

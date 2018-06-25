
import java.sql.*;


public class Database1 {
    public static void main(String[] args) throws SQLException {
        Connection c=null;
        String query="Select * from studentdetails where rno=102";
      
        try{
             Class.forName("com.mysql.jdbc.Driver");
            //c=DriverManager.getConnection("jdbc:mysql://localhost:3306/m_studentdetails?zeroDateTimeBehavior=convertToNull [root on Default schema]","root","birthdate");
          c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","birthdate");
            System.out.println("connected succesfull");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(query);
            rs.next();
            String name=rs.getString(1);
            System.out.println(name);
            c.close();
        }catch(Exception e)
        { System.out.println(e);}
    }
    
}

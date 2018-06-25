
/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;
public class NewClass 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the four octets of your IP address in hexadecimal Notation:-\n");
        int ip_1=sc.nextInt();
        int ip_2=sc.nextInt();
        int ip_3=sc.nextInt();
        int ip_4=sc.nextInt();
        System.out.println("\nYour IP Address is: "+ip_1+"."+ip_2+"."+ip_3+"."+ip_4);
        if(ip_1>=0 && ip_1<=127)
        {
            System.out.println("Class A");
            System.out.println("SUBNET :"+ip_1+".0.0.0");
            System.out.println("FIRST HOST ID: "+ip_1+"0.0.1");
            System.out.println("LAST HOST ID: "+ip_1+"0.0.254");
        }
        else if(ip_1>=128 && ip_1<=191)
        {
            System.out.println("Class B");
            System.out.println("SUBNET :"+ip_1+"."+ip_2+".0.0");
            System.out.println("FIRST HOST ID: "+ip_1+"."+ip_2+"0.1");
            System.out.println("LAST HOST ID: "+ip_1+"."+ip_2+"0.254");
        }
        else if(ip_1>=192 && ip_1<=223)
        {
            System.out.println("Class C");
            System.out.println("SUBNET :"+ip_1+"."+ip_2+"."+ip_3+".0");
            System.out.println("FIRST HOST ID: "+ip_1+"."+ip_2+"."+ip_3+".1");
            System.out.println("LAST HOST ID: "+ip_1+"."+ip_2+"."+ip_3+".254");
        }
        else if(ip_1>=224 && ip_1<=239)
        {
            System.out.println("Class D");
            System.out.println("SUBNET of above reserved for multicasting");
        }
        else if(ip_1>=240 && ip_1<=255)
        {
            System.out.println("Class E");
            System.out.println("The above class is in research");
        }
        else
        {
            System.out.println("It is an illegal IP address");
        }
        
    }
}

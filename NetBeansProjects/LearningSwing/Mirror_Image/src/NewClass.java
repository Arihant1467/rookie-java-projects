
import java.util.Scanner;


public class NewClass 
{
    
    
    public static void main(String[] args) 
    {
        int test;boolean condition=false;
      Scanner  sc=new Scanner(System.in);
        String s="";
        
       // test=sc.nextInt();
        test=sc.nextInt();
        while(test>0)
        {
            s=sc.next();
            
            for(int i=0;i<s.length();++i)
            {
                if(s.charAt(i)=='1'||s.charAt(i)=='0'|| s.charAt(i)=='8')
                {
                    
                    condition=true;
                }
                else
                {
                    condition=false;
                    break;
                }
            }
            if(condition)
            {
                StringBuilder sb=new StringBuilder(s);
                String reverse=sb.reverse().toString();
                if(s.equals(reverse))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("NO");
            }
            
        }
        
    }
    
}

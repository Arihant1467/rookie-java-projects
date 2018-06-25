
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class NewClass 
{
    public static void main(String[] args) 
    {
        try
        {
            NewClass c=new NewClass();
            int test=0;
            long a=0,b=0;

            //Scanner sc=new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            test=Integer.parseInt(br.readLine());
            while(test>0)
            {
                int count=0;
                a=Long.parseLong(br.readLine());
                b=Long.parseLong(br.readLine());
                while(b>=a)
                {
                  if(c.test_for_palindrome(b))
                  {
                      ++count;
                  }
                  --b;
                }
                System.out.println(count);
                test--;
            }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    public boolean test_for_palindrome(long b)
    {
        String one=b+"";
        StringBuilder sb=new StringBuilder(one);
        String rev=sb.reverse().toString();
        return one.equals(rev);
    }
}

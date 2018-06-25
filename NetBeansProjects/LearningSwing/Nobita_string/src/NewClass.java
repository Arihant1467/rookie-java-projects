
import java.util.ArrayList;
import java.util.Scanner;


public class NewClass 
{
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        
        int a=Integer.parseInt(sc.nextLine());
        
        while(a>0)
        {
            String d=sc.nextLine();
            int j=0;
            String []s=d.split(" ");
            int l=s.length;
            if(l%2==0)
            {
                for(;j<l/2;++j)
                {
                    System.out.print(s[l-j-1]+" "+s[j]+" ");
                }
            }
            else
            {
                for(;j<l/2;++j)
                {
                    System.out.print(s[l-j-1]+" "+s[j]+" ");
                }
                System.out.print(" "+s[l/2]);
            }
            System.out.println("");
            a--;
        }
    }
    
}

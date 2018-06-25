
import java.math.BigInteger;
import java.util.Scanner;


public class NewClass 
{
    public static void main(String[] args)
    {
        
        
        Scanner sc=new Scanner(System.in);
      
       try
       {
            NewClass a=new NewClass();
           
            BigInteger b1=BigInteger.valueOf(sc.nextLong());
            BigInteger b2=BigInteger.valueOf(sc.nextLong());
            BigInteger b3=BigInteger.ZERO;
            BigInteger sum=BigInteger.ZERO;
            while(b2.compareTo(b3)>=0)
            {
                
                sum.add(a.factorial(b1).divide(a.factorial(b3).multiply(a.factorial(b1.subtract(b3)))));
                b3.add(BigInteger.ONE);
                b3.add(BigInteger.ONE);
                
            }
            System.out.println(sum);
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
      
    
    }
    public BigInteger factorial(BigInteger bs)
    {
       BigInteger b=BigInteger.ONE; 
       for(BigInteger i=BigInteger.ONE;bs.compareTo(i)>=0;i.add(BigInteger.ONE))
       {
           b.multiply(i);
       }
        
        
        return b;
               
    }
}

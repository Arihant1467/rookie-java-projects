
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
        List<String> l=new LinkedList<String>();
        NewClass s=new NewClass();
        Scanner sc=new Scanner(System.in);
        long test_case=sc.nextLong();
        l=s.totalPrime(test_case);
        long a=Long.parseLong(l.get(0));
        
        long no_prime=0;
        
        for(int t=1;t<l.size();++t)
        {
             a+=Long.parseLong(l.get(t));
           boolean val= s.checkPrime(a);
           if(val)
           {
               ++no_prime;
           }
        }
        
        System.out.println(no_prime);
    }
    public boolean checkPrime(long a)
    {
        for(long i=2;i<a;++i)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public LinkedList<String> totalPrime(long l)
    {
        List<String> primeNos = new LinkedList<String>();
    	
    	for (long i=2;i<l;++i)
    	{
    		boolean flag=false;
    		for(long j=2;j<i;++j)
    		{
    			if(i%j==0)
    			{
    				flag=true;
    				break;
    			}
    			
    		}
    		if(!flag)
    		{
    			primeNos.add(i+"");
    		}
    		
    	}
        return (LinkedList<String>) primeNos;
    }
}


public class code_1 
{
    public static void main(String[] args) 
    {
        boolean prime[]=new boolean[1000000];
        for(long i=2;i<=1000000;++i)
        {
            for(long j=2;j<=1000000;++j)
            {
                if(i%j==0)
                {
                    prime[i]=false;
                    
                }
            }
        }
    }
}

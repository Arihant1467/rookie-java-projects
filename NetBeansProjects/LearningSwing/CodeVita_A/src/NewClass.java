
import java.util.Scanner;


public class NewClass 
{
    public static void main(String[] args)
    {
        NewClass a=new NewClass();
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        int totalValues=a.totalValues(test_case);
        int values[]=new int[totalValues];
        values=a.valuesGenerated(totalValues);
        int k=0;
        for(int i=0;i<=test_case-1;++i)
        {
             for(int j=1;j<test_case-i;++j)
                {
                    System.out.print(" ");
                }
            for(int l=0;l<=i;++l)
            {
                
                String s=a.padded_number(values[k]);
               
                System.out.print(s);
                System.out.print(" ");
                ++k;
            }
            System.out.println("");
        }
        
    }
    public String padded_number(int n)
    {
       
        String s=n+"";
        int l=s.length();
        switch(l)
        {
            case 1: s="0000"+n;
                    break;
            case 2: s="000"+n;
                    break;
            case 3: s="00"+n;
                     break;
            case 4: s="0"+n;
                       break;
            case 5: s=""+n;
                    break;
        }
        return s;
    }
    public int totalValues(int n)
	{  int v=0;
	   for(int i=1;i<=n;++i)
	   {
		   v=v+i;
	   }
	   return v;
	}
    public int [] valuesGenerated(int totalValues)
    {
        int a=6;
		int Arr[] = new int[totalValues];
		Arr[0]=6;
		int k=1;
		for(int i=0;i<totalValues-1;i++)
		{
			a = a + val(i+1);
			Arr[k] = a;
			++k;
		
			
		}
	return Arr;
    }
    public int val(int i)
	{
		int value = 22+(i-1)*16;
		return value;
	}
}

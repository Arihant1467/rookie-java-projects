import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class NewClass 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList();
       TreeSet ts;//=new TreeSet();
        System.out.println("Enter the elements and Press -1  to exit\n");
        Object c=0;
        c=sc.nextInt();
        do 
        {
            al.add(c);
            c=sc.nextInt();
        }while(!c.equals(-1));
        ts=new TreeSet(al);
        ArrayList al1=new ArrayList(ts);
        Iterator it =al1.iterator();
        
        int count=0;
        boolean f=it.hasNext();
        while(it.hasNext())
        {
            c=it.next();
            System.out.println(c);
            Iterator it1=al.iterator();
            while(it1.hasNext())
            {
                if(c==it1.next())
                {
                    ++count;
                }
            }
            System.out.println("Count of "+c+" is:"+count);
            count=0;
            
        }
       
        
        
    }
}

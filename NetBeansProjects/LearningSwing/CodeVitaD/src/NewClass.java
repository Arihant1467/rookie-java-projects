
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class NewClass 
{
    public static void main(String[] args)
    {
        NewClass nc=new NewClass();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Team t[]=new Team[a];
        String s=sc.nextLine();
        String[] teamNames=s.split(" ");
        for(int i=0;i<a;++i)
        {
            t[i].setName(teamNames[i]);
        }
        int m=sc.nextInt();
        for(int i=0;i<m;++i)
        {
            String l=sc.nextLine();
            String sCheck[]=l.split(" ");
            if(sCheck[0]==sCheck[1])
            {
                System.out.println("INVALID INPUT");
            }
            else
            {
                int index1=nc.indexOf(teamNames,sCheck[0]);
                int index2=nc.indexOf(teamNames,sCheck[1]);
                //t[index1]
            }
        }
    }
    public int indexOf(String [] t,String s)
    {
        for(int i=0;i<t.length;++i)
        {
            if(s.equals(t[i]))
            {
                return i;
            }
        }
        return 0;
    }
}

public class Team
{
    String name;
    int points;
    int gA;
    int gD;

    public Team()
    {
        this.name=null;
        this.points=0;
        this.gA=0;
        this.gD=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getgA() {
        return gA;
    }

    public void setgA(int gA) {
        this.gA = gA;
    }

    public int getgD() {
        return gD;
    }

    public void setgD(int gD) {
        this.gD = gD;
    }
}
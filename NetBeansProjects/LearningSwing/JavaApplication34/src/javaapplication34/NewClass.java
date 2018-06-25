/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication34;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class NewClass 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            LinkedList<Long> ls=new LinkedList<Long>();
            long j=0;
            while(a>0)
            {
                
                j=sc.nextLong();
                ls.add(j);
                a--;
            }
            Collections.sort(ls);
            long time=0;
            //long size=ls.size();
            while(ls.size()!=1)
            {
                time+=ls.get(0)+ls.get(1);
                ls.add((ls.get(0)+ls.get(1)));
                //size+=1;
                ls.removeFirst();
                ls.removeFirst();
                //size-=2;
                Collections.sort(ls);
            }
            System.out.println(time);
            n--;
        }
    }
}

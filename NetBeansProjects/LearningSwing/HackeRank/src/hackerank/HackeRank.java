/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
package hackerank;

/**
 *
 * @author HP
 */
public class HackeRank {





    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int rotate=sc.nextInt();
        long numbers[]=new long[count];
        for(int i=0;i<count;++i)
        {
            long num=sc.nextLong();
            if((i-rotate)<0)
            {
                numbers[count-i]=num;
            }
            else
            {
                numbers[i]=num;
            }
        }
        
    }
}
    


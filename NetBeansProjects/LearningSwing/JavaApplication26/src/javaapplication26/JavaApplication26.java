/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a[]=new String[7];
        a[0]="Sunday";
        a[1]="Monday";
        a[2]="Tuesday";
        a[3]="Wednesday";
        a[4]="Thursday";
        a[5]="Friday";
        a[6]="Saturday";
        Scanner sc=new Scanner(System.in);
          while(sc.hasNextInt())
            {
            int t=sc.nextInt();
            t=t-2000;
            t=t%7;
            System.out.println(a[t]);
        }
       
    }
    
}

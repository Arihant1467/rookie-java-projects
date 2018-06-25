/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cognizanthiringchallenge;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CognizantHiringChallenge {

    /**
     * @param args the command line arguments
     */
        public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT  */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        int replaceTest = s.nextInt();
        StringBuilder sb = new StringBuilder(name);
        while(replaceTest > 0){
            String n = s.next();
            int pos = Integer.parseInt(n.charAt(0));
            Integer.
            sb.setCharAt(pos-1,ch);
            --replaceTest;
        }
        System.out.println(sb.toString());
        int reverseTest = s.nextInt();
        while(reverseTest > 0){
            int start = s.nextInt();
            int last = s.nextInt();
            String rev = new StringBuilder(sb.substring(start-1,last-1).reverse()).toString();
            sb = sb.substring(0,start-1)+ rev +sb.substring(last-1);
            reverseTest--;
        }
        System.out.println(sb.toString());
        int indices = 0;
        for(int i =0 ;i<sb.length();++i){
            if(name[i] == sb.charAt(i)){
                ++indices;
            }
        }
        System.out.println(indices);

    }
    
}

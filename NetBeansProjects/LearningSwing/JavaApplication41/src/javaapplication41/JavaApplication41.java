/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
         File file=new File("G:\\java\\LearningSwing\\JavaApplication41\\build\\classes\\javaapplication41\\test.txt");
//            FileWriter fw=new FileWriter(file);
//            PrintWriter pw=new PrintWriter(fw);
//            pw.println("Hi");
//            pw.println("This is arihant sai paruchuru");
//            pw.println("He loves Data science");
//            pw.close();
         FileInputStream fis=new FileInputStream(file);
         InputStreamReader isr=new InputStreamReader(fis);
//         byte[] b=new byte[256];
//         while(fis.read(b)!=-1)
//         {
//             System.out.println(b);
//         }
         char[] c=new char[115];
         int i=0;
         while(isr.read(c)!=-1)
         {
             System.out.println(c);
             ++i;
             System.out.print("\tLine-"+i);
         }
        }
        catch(FileNotFoundException ie)
        {
            ie.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}

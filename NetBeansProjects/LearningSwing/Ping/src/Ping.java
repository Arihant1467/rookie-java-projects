/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {

    public static void main(String[] args) {

        
        try
        {
            String command[]=new String[1];
            command[0]="ping -c 3 www.google.com";
             Process proc = Runtime.getRuntime().exec(command);
             //Runtime.getRuntime().e

        // Read the output

        BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }

        proc.waitFor(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

         

    }
} 
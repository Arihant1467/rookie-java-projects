/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arihant
 */
import java.awt.Font;
import java.awt.GraphicsEnvironment;
public class MainClass {
  public static void main(String[] a) {
    GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
    Font[] fonts = e.getAllFonts(); // Get the fonts
    for (Font f : fonts) {
      System.out.println(f.getFontName());
      
    }
  }
}

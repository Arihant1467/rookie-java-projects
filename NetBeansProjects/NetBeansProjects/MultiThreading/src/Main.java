
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
public static void main(String[] args) {
   new Thread1();
   new Thread2();
    System.out.println("Main Thread Entering");
   for(int i=0;i<6;++i)
   { System.out.println("Mian Thread "+i);
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    System.out.println("Main Thread Exiting");
}
    
}

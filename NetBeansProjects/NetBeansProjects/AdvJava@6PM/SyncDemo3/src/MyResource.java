
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyResource {
   
    
    
    
    void process(String info)
    {
        System.out.println("Process consumed by "+info);
       synchronized(this){
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(info + " is counting "+i);
        }
        }
        System.out.println("Process released by "+info);
    }
}

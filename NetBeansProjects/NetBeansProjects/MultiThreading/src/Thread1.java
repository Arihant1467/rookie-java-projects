
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 implements Runnable{
    Thread t;
    Thread1()
    { t=new Thread(this,"Thread1");
        System.out.println("Thread1 "+t);
        t.start();
    }
    @Override
    public void run()
    { for(int i=0;i<6;++i)
    { System.out.println("Thread1 "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        System.out.println("Exiting Thread1");
        }   
}

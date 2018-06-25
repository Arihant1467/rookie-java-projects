
import java.util.logging.Level;
import java.util.logging.Logger;
public class Thread2 implements Runnable{
    Thread t1;
    Thread2()
    { t1=new Thread(this,"Thread2");
        System.out.println("Thread2 "+t1);
        t1.start();
    }
    @Override
    public void run()
    {
        for(int j=0;j<6;++j)
        { System.out.println("Thread2 "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread2 is exiting");
    }
}
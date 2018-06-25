
import java.util.logging.Level;
import java.util.logging.Logger;

class NewThread implements Runnable{
    Thread t;
    NewThread()
    { t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread"+t);
        t.start();
        
    }
    @Override
    public void run()
    {
        for(int i=0;i<5;++i)
        {   try {
            System.out.println("Child Thread"+i);
            Thread.sleep(1200);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class Mymain{
    public static void main(String[] args) {
        new NewThread();
        for(int i=0;i<6;++i)
        {   try {
            System.out.println("Main Thread: "+i);
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mymain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }

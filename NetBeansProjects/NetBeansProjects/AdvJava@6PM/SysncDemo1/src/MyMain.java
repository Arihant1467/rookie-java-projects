class Task1 extends Thread
{

    @Override
    public void run() {
        MyResource.process("Thread1");
    }
    
}
class Task2 extends Thread
{

    @Override
    public void run() {
        MyResource.process("Thread2");
    }
    
}
public class MyMain {
    public static void main(String[] args) {
        System.out.println("Main - Begin");
        
        Task1 th1=new Task1();
        Task2 th2=new Task2();
        th1.start();
        th2.start();
        
        
        System.out.println("Main - End");
    }
}

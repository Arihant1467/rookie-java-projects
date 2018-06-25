
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5 extends Frame{

    public MyFrame5() {
        setTitle("My Desktop Application");
        setSize(400, 500);
        addWindowListener(new MyWL());
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new MyFrame5();
    }
    
    class MyWL extends WindowAdapter
    {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
        
    }
    
}

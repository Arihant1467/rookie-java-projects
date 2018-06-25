
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame6 extends Frame{

    public MyFrame6() {
        setTitle("My Desktop Application");
        setSize(400, 500);
        
        addWindowListener(
        
                new WindowAdapter() 
                {

                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                    
                }
        );
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new MyFrame5();
    }
    
        
}

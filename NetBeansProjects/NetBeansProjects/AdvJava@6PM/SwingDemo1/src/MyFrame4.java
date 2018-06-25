
import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame4 extends Frame{

    Button b1,b2;
    public MyFrame4() {
        setTitle("My Desktop Application");
        setSize(400, 500);
        setLayout(null);
        b1=new Button("Click Me");
        b1.setBounds(100, 100, 100, 50);
        
        b1.addActionListener(
        
                new ActionListener()//anonymous child of ActionListener
                {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setTitle("Button1 Clicked");
                    } 
                }
        );
        
        b2=new Button("Second Button");
        b2.setBounds(250, 100, 100, 50);
        b2.addActionListener(
                new ActionListener()//anonymous child of ActionListener
                {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setTitle("Button2 Clicked");
                    } 
                }
        );
        
        add(b1);
        add(b2);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame4();
    }
    
}


import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame3 extends Frame {
    Button b1,b2;
    
    public MyFrame3(){
        setTitle("My Desktop Application");
        setSize(400, 500);
        setLayout(null);
        b1=new Button("Click Me");
        //b1.setSize(100, 50);
        b1.setBounds(100, 100, 100, 50);
        b1.addActionListener(new Button1Handler());
        
        b2=new Button("Second Button");
        //b1.setSize(100, 50);
        b2.setBounds(250, 100, 100, 50);
        b2.addActionListener(new Button2Handler());
        
        add(b1);
        add(b2);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame3();
    }
    
    class Button1Handler implements ActionListener
    {

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Button1 Clicked/Pressed");
        setTitle("Button1");
        
    }
    
}
    
    
    class Button2Handler implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Button2 Clicked/Pressed");
        setTitle("Buuton2");
    }
    
}
}






import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame2 extends Frame implements ActionListener{
    Button b1,b2;
    
    public MyFrame2(){
        setTitle("My Desktop Application");
        setSize(400, 500);
        setLayout(null);
        b1=new Button("Click Me");
        //b1.setSize(100, 50);
        b1.setBounds(100, 100, 100, 50);
        b1.addActionListener(this);
        
        b2=new Button("Second Button");
        //b1.setSize(100, 50);
        b2.setBounds(250, 100, 100, 50);
        b2.addActionListener(this);
        
        add(b1);
        add(b2);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1))
            System.out.println("Button1 Clicked/Pressed");
        else
            System.out.println("Butto2 Clicked/Pressed");
    }
}

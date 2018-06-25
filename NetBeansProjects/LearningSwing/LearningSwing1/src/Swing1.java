import javax.swing.GroupLayout;
import javax.swing.JFrame;

public class Swing1 extends JFrame 
{
    public Swing1()
    {
        prepareGUI();
    }
   private  void prepareGUI()
    {
        setDefaultCloseOperation(3);
        GroupLayout l=new GroupLayout(getContentPane());
        getContentPane().setLayout(l);
        l.setHorizontalGroup(l.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
        l.setVerticalGroup(l.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
        pack();
    }
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            public void run()
            {
                new Swing1().setVisible(true);
            }
        }) ;
    }
}

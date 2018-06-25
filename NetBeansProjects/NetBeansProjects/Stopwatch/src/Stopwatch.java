
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arihant
 */
public class Stopwatch extends javax.swing.JFrame implements Runnable {
String name="Stopwatch Thread";
Thread t;
public boolean flag;
int i,j;
    /**
     * Creates new form Stopwatch
     */
    public Stopwatch() {
        initComponents();
t=new Thread(this,name);
//t.start();
    }
        @Override
 public void run()
        {
       int k;         
      
      
       while(flag==true)
       {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Stopwatch.class.getName()).log(Level.SEVERE, null, ex);
           }
           k=i;
        int hour=k/3600;
        k=k%3600;
        int minute=k/60;
        k=k%60;
        int second =k;
        ++i;
        Hourtext.setText(hour+"");
        Minutetext.setText(minute+"");
        Secondtext.setText(second+"");
        }
    }

        
        

        
    //}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Startbutton = new javax.swing.JButton();
        Lapbutton = new javax.swing.JButton();
        Stopbutton = new javax.swing.JButton();
        Laptext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Minutetext = new javax.swing.JLabel();
        Hourtext = new javax.swing.JLabel();
        Secondtext = new javax.swing.JLabel();
        Resume = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Startbutton.setText("Start");
        Startbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartbuttonMouseClicked(evt);
            }
        });

        Lapbutton.setText("Lap");
        Lapbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LapbuttonMouseClicked(evt);
            }
        });

        Stopbutton.setText("Stop");
        Stopbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopbuttonMouseClicked(evt);
            }
        });

        Laptext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Laptext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaptextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAP");

        Minutetext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Minutetext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minutetext.setText("00");

        Hourtext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Hourtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hourtext.setText("00");

        Secondtext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Secondtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Secondtext.setText("00");

        Resume.setText("Resume");
        Resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lapbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(Laptext, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Startbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Hourtext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Minutetext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Secondtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Stopbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(Resume, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hourtext, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secondtext, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minutetext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Startbutton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Laptext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lapbutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Stopbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resume)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartbuttonMouseClicked
     flag=true;
     i=1;
        t.start();   // TODO add your handling code here:
    }//GEN-LAST:event_StartbuttonMouseClicked

    private void StopbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopbuttonMouseClicked
flag=false;
j=i;// TODO add your handling code here:
    }//GEN-LAST:event_StopbuttonMouseClicked

    private void LapbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LapbuttonMouseClicked
Laptext.setText(Hourtext.getText()+":"+Minutetext.getText()+":"+Secondtext.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_LapbuttonMouseClicked

    private void LaptextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaptextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaptextActionPerformed

    private void ResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeActionPerformed
    i=j;
    flag=true;
    
    // TODO add your handling code here:
    }//GEN-LAST:event_ResumeActionPerformed
/*public class SecondsThread implements Runnable{            //here class starts
    String name="Thread of Second";
    Thread t;
    public SecondsThread(){
        t=new Thread(this,name);
        t.start();
    }
    @Override
    public void run(){
        for(int i=0;i<60;++i){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Stopwatch.class.getName()).log(Level.SEVERE, null, ex);
            }
            Secondtext.setText(i+"");
            if(i==59)
                i=0;
        }
    }
}*/ //here class ends
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stopwatch().setVisible(true);
               
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hourtext;
    private javax.swing.JButton Lapbutton;
    private javax.swing.JTextField Laptext;
    private javax.swing.JLabel Minutetext;
    private javax.swing.JButton Resume;
    private javax.swing.JLabel Secondtext;
    private javax.swing.JButton Startbutton;
    private javax.swing.JButton Stopbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

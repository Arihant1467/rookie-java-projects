
import java.awt.Color;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RGB extends javax.swing.JFrame {
    int red,green,blue;
    
    

    /**
     * Creates new form RGB
     */
    public RGB() {
        initComponents();
        
        red=255;blue=255;green=255;
        hexadecimal_label.setBackground(new Color(240, 240, 240));
        hexadecimal_label.setOpaque(true);
        hexadecimal_label.setForeground(Color.RED);
        red_slider.setMaximum(255);
        red_slider.setMinimum(0);
        blue_slider.setMaximum(255);
        blue_slider.setMinimum(0);
        green_slider.setMaximum(255);
        green_slider.setMinimum(0);
        red_slider.setValue(red);
        green_slider.setValue(green);
        blue_slider.setValue(blue);
        getContentPane().setBackground(new Color(red,green,blue));
        rgb_text.setText(red+","+green+","+blue);
        String s=Integer.toHexString(50);
        hexadecimal_label.setText("#"+s+","+s+","+s);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        red_slider = new javax.swing.JSlider();
        green_slider = new javax.swing.JSlider();
        blue_slider = new javax.swing.JSlider();
        rgb_text = new javax.swing.JTextField();
        hexadecimal_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        red_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                red_sliderStateChanged(evt);
            }
        });

        green_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                green_sliderStateChanged(evt);
            }
        });

        blue_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blue_sliderStateChanged(evt);
            }
        });

        rgb_text.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        hexadecimal_label.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        hexadecimal_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hexadecimal_label.setText("#00000");
        hexadecimal_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blue_slider, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(green_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(red_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rgb_text, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hexadecimal_label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(red_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(green_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(blue_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rgb_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hexadecimal_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void red_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_red_sliderStateChanged
        // TODO add your handling code here:
            try
            {    
            red=red_slider.getValue();
            green=green_slider.getValue();
            blue=blue_slider.getValue();
            getContentPane().setBackground(new Color(red,green,blue));
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
            catch(Exception e)
            {
            getContentPane().setBackground(new Color(255,green,blue));
            red=255;
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
    }//GEN-LAST:event_red_sliderStateChanged

    private void green_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_green_sliderStateChanged
        // TODO add your handling code here:
            
        try
            {    
            red=red_slider.getValue();
            green=green_slider.getValue();
            blue=blue_slider.getValue();
            getContentPane().setBackground(new Color(red,green,blue));
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
            catch(Exception e)
            {
            getContentPane().setBackground(new Color(red,255,blue));
            green=255;
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
            
    }//GEN-LAST:event_green_sliderStateChanged

    private void blue_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blue_sliderStateChanged
        // TODO add your handling code here:
            
        try
            {    
            red=red_slider.getValue();
            green=green_slider.getValue();
            blue=blue_slider.getValue();
            getContentPane().setBackground(new Color(red,green,blue));
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
            catch(Exception e)
            {
            getContentPane().setBackground(new Color(red,green,255));
            blue=255;
            rgb_text.setText(red+","+green+","+blue);
            hexadecimal_label.setText("#"+Integer.toHexString(red)+","+Integer.toHexString(green)+","+Integer.toHexString(blue));
            }
    }//GEN-LAST:event_blue_sliderStateChanged

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
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RGB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RGB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider blue_slider;
    private javax.swing.JSlider green_slider;
    private javax.swing.JLabel hexadecimal_label;
    private javax.swing.JSlider red_slider;
    private javax.swing.JTextField rgb_text;
    // End of variables declaration//GEN-END:variables
}

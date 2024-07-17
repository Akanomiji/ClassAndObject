/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.classandobject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 *
 * @author com4936
 */
public class GpTest extends JFrame {

    /**
     * Creates new form GpTest
     */
    public GpTest() {
        initComponents();
        setSize(600, 600);
    }

    public void paint(Graphics g) {
        super.setSize(600, 600);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.PINK);
        g.drawRect(10, 35, 100, 100);

        g.fillRect(120, 35, 100, 100);

        g.fill3DRect(230, 35, 100, 100, true);

        g.fill3DRect(340, 35, 100, 100, false);

        g.fillRoundRect(10, 140, 100, 100, 50, 30);

        g.fillOval(120, 140, 100, 100);

        g.fillOval(290, 140, 100, 50);

        g.setColor(Color.BLACK);
        g.fillArc(10, 250, 100, 100, 0, 45);

        g.setColor(Color.red);

        g.drawLine(110, 260, 230, 260);

        g.drawLine(250, 260, 250, 300);

        g.drawLine(250, 300, 300, 275);

        g.drawArc(450, 250, 100, 100, 0, 360);

        g.setColor(Color.yellow);
        g.drawArc(450, 250, 100, 100, 0, 90);

        g.setColor(Color.blue);
        
        g.drawArc(450, 250, 100, 100, 180, 90);
        
        g.setColor(Color.BLACK);
        
        int[] x = {10, 50, 90, 140, 180};
        
        int[] y = {400, 350, 400, 300, 400};
        
        g.drawPolyline(x, y, x.length);
        
        int[] x2 = {220, 270, 370, 420, 370, 270, 220};
        
        int[] y2 = {350, 300, 300, 350, 400, 400, 350};
        
        g.drawPolygon(x2, y2, x2.length);
        
        Font font = new Font("Angsana new", Font.BOLD, 40);
        
        g.setFont(font);
        
        g.drawString("Test1", 200, 450);
        
        g.setFont(new Font("Angsana new", Font.ITALIC | Font.BOLD, 40));
        
        g.drawString("Test2", 300, 450);
        
        g.fillRect(10, 450, 50, 100);
        
        g.fillRect(70, 450, 50, 70);
        
        g.fillRect(130, 450 + 30, 50, 70);
        
        g.fillRect(190, 450 - 50, 50, 150);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GraphicTest");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GpTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GpTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GpTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GpTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GpTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

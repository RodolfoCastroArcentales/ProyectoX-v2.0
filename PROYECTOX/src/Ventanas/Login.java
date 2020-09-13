package Ventanas;

import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import Registro.*;
import java.awt.Graphics;

public class Login extends javax.swing.JFrame implements MouseListener {

 

    public Login() {
        initComponents();
        setSize(440, 590);
        setLocationRelativeTo(null);
        JBtnIngreso.addMouseListener(this);
        JBtnRegistro.addMouseListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtnIngreso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBtnRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(null);

        JBtnIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AccSis1.png"))); // NOI18N
        JBtnIngreso.setBorder(null);
        JBtnIngreso.setBorderPainted(false);
        JBtnIngreso.setContentAreaFilled(false);
        JBtnIngreso.setDefaultCapable(false);
        JBtnIngreso.setFocusable(false);
        JBtnIngreso.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        JBtnIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        JBtnIngreso.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AccSis2.png"))); // NOI18N
        JBtnIngreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AccSis1.png"))); // NOI18N
        JBtnIngreso.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JBtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(JBtnIngreso);
        JBtnIngreso.setBounds(101, 340, 60, 59);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO(A)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 60, 280, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISBAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 160, 140, 60);

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrarse");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 470, 140, 30);

        JBtnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup-icon1.png"))); // NOI18N
        JBtnRegistro.setBorder(null);
        JBtnRegistro.setBorderPainted(false);
        JBtnRegistro.setContentAreaFilled(false);
        JBtnRegistro.setFocusable(false);
        JBtnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        JBtnRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        JBtnRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup-icon2.png"))); // NOI18N
        JBtnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signup-icon1.png"))); // NOI18N
        JBtnRegistro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(JBtnRegistro);
        JBtnRegistro.setBounds(100, 451, 50, 60);

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acceder al Sistema");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 360, 140, 30);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        Fondo.setToolTipText("");
        Fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Fondo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                FondoComponentAdded(evt);
            }
        });
        getContentPane().add(Fondo);
        Fondo.setBounds(-40, 0, 480, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnIngresoActionPerformed

    private void FondoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_FondoComponentAdded

    }//GEN-LAST:event_FondoComponentAdded

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JBtnIngreso;
    private javax.swing.JButton JBtnRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

   

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this == e.getSource()) {
            JBtnRegistro.setSize(60, 70);
            JBtnIngreso.setSize(60, 70);
        }
        if (e.getSource() == JBtnIngreso) {
            AccesoalSistema obj = new AccesoalSistema();
            obj.setVisible(true);
            dispose();
        } else {
            if (e.getSource() == JBtnRegistro) {
                Registro ob = new Registro();
                ob.pack();
                ob.setVisible(true);
                dispose();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (JBtnIngreso == e.getSource()) {
            JBtnIngreso.setSize(80, 80);
            JBtnRegistro.setSize(60, 70);
        } else {
            if (JBtnRegistro == e.getSource()) {
                JBtnRegistro.setSize(80, 80);
                JBtnIngreso.setSize(60, 70);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

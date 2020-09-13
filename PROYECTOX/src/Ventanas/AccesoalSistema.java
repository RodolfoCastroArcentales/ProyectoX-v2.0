package Ventanas;

import java.awt.event.*;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AccesoalSistema extends javax.swing.JFrame implements ActionListener, MouseListener {

    public boolean mostrar = true;

    public AccesoalSistema() {
        initComponents();
        JPassOculto.setVisible(true);
        JPassVisible.setVisible(false);
        VerPass.addActionListener(this);
        this.setSize(329, 440);
        JBtnA.addActionListener(this);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPassVisible = new javax.swing.JTextField();
        JPassOculto = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JBtnA = new javax.swing.JButton();
        VerPass = new javax.swing.JButton();
        JTxtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 90, 20);

        JPassVisible.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPassVisibleActionPerformed(evt);
            }
        });
        getContentPane().add(JPassVisible);
        JPassVisible.setBounds(130, 160, 130, 30);

        JPassOculto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JPassOculto.setToolTipText("Digite su contraseña porfavor");
        getContentPane().add(JPassOculto);
        JPassOculto.setBounds(130, 160, 130, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 120, 20);

        JBtnA.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        JBtnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton-Acceder1.png"))); // NOI18N
        JBtnA.setBorderPainted(false);
        JBtnA.setContentAreaFilled(false);
        JBtnA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton-Acceder2.png"))); // NOI18N
        JBtnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton-Acceder1.png"))); // NOI18N
        JBtnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBtnAMouseEntered(evt);
            }
        });
        JBtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAActionPerformed(evt);
            }
        });
        getContentPane().add(JBtnA);
        JBtnA.setBounds(90, 260, 140, 50);

        VerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VerPass3.png"))); // NOI18N
        VerPass.setAutoscrolls(true);
        VerPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VerPass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPassActionPerformed(evt);
            }
        });
        getContentPane().add(VerPass);
        VerPass.setBounds(270, 160, 30, 20);
        getContentPane().add(JTxtuser);
        JTxtuser.setBounds(130, 100, 130, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_Seguridad2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnAMouseEntered

    }//GEN-LAST:event_JBtnAMouseEntered

    private void JBtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnAActionPerformed

    private void VerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPassActionPerformed

    }//GEN-LAST:event_VerPassActionPerformed

    private void JPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPassVisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPassVisibleActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(VentanaInterfacePersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(VentanaInterfacePersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(VentanaInterfacePersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(VentanaInterfacePersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoalSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnA;
    private javax.swing.JPasswordField JPassOculto;
    private javax.swing.JTextField JPassVisible;
    private javax.swing.JTextField JTxtuser;
    private javax.swing.JButton VerPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (JBtnA == e.getSource()) {
            char m[] = JPassOculto.getPassword();
            char pass[] = new char[]{'a', 'd', 'm', 'i', 'n'};
            if (Arrays.equals(m, pass)) {
                Nivel0 obj = new Nivel0();
                obj.setVisible(true);
                dispose();
            }
        }

        if (mostrar) {
            JPassVisible.setVisible(true);
            JPassOculto.setVisible(false);
            JPassVisible.setText(JPassOculto.getText());
            mostrar = false;
        } else {
            JPassVisible.setVisible(false);
            JPassOculto.setVisible(true);
            JPassOculto.setText(JPassVisible.getText());
            mostrar = true;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this == e.getSource()) {
            JBtnA.setSize(60, 70);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (JBtnA == e.getSource()) {
            JBtnA.setSize(80, 80);
        } else {
            JBtnA.setSize(60, 70);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

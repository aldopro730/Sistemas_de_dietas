/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa2;

import Programa.salida;
import itp_library.imformacion;

/**
 *
 * @author YASMIN
 */
public class menu1 extends javax.swing.JFrame {
private String dato;
    private String nom;
    private String devc;
    private String devn;
     private String devc1;
    private String devn1;
    public menu1() {
        initComponents();
    }
    
     public void setDato(String dato) {
        this.dato = dato;
        tx.setText(dato);
    }
    public void setNom(String dato) {
        this.dato = dato;
        ttt.setText(dato);
    }
     public void setdevcod(String dato) {
        this.devc = dato;
        tx.setText(dato);
    }
    public void setdevnom(String dato) {
        this.devn = dato;
        ttt.setText(dato);
    }
     public void setdevc1(String dato) {
        this.devc1 = dato;
        tx.setText(dato);
    }
    public void setdevn1(String dato) {
        this.devn1 = dato;
        ttt.setText(dato);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx = new javax.swing.JTextField();
        ttt = new javax.swing.JTextField();
        csa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Seleccione una opcion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 90, 290, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 180, 80, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Obtener una dieta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 160, 230, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Obtener Rutina");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 250, 200, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 280, -1, 50));

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 0, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Bienvenido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 10, 320, 78));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resp/crop1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 460, 350));
        getContentPane().add(tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 110, 30));
        getContentPane().add(ttt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 40));

        csa.setText("jButton3");
        csa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csaActionPerformed(evt);
            }
        });
        getContentPane().add(csa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gendieta ob = new gendieta();
        ob.setCod(tx.getText());
        ob.setNom(ttt.getText());
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        genrutina ob = new genrutina();
        ob.setCod1(tx.getText());
        ob.setNom1(ttt.getText());
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        imformacion ob = new imformacion();
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void csaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csaActionPerformed
        salida ob = new salida();
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_csaActionPerformed

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
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton csa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ttt;
    private javax.swing.JTextField tx;
    // End of variables declaration//GEN-END:variables
}

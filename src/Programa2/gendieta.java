/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa2;

import sql.CrusSql;

/**
 *
 * @author YASMIN
 */
public class gendieta extends javax.swing.JFrame {

    private String codigo;
    private String nombre;

    public gendieta() {
        initComponents();
    }

    public void setCod(String cod) {
        this.codigo = cod;
        txtcodigo.setText(cod);
    }

    public void setNom(String nom) {
        this.nombre = nom;
        txtnombre.setText(nom);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt3 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPrincipal.setFont(new java.awt.Font("Blackadder ITC", 0, 80)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(153, 255, 102));
        MenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPrincipal.setText("Dieta");
        getContentPane().add(MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 80));

        txt1.setBackground(new java.awt.Color(240, 240, 240));
        txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/png-clipart-button-shut-s-text-trademark.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 60, 50));

        btnGenerarFactura.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarFactura.setText("GENERAR DIETA");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Oxigenacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 100, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Altura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Peso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, 20));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 360, 90));

        txt3.setBackground(new java.awt.Color(240, 240, 240));
        txt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 120, 30));

        txt2.setBackground(new java.awt.Color(240, 240, 240));
        txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Oxigenacion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 100, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resp/crop1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 90, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        menu1 ob = new menu1();
        ob.setdevcod(txtnombre.getText());
        ob.setdevnom(txtcodigo.getText());
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    CrusSql objcrud = new CrusSql();
    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed

        String a = txt1.getText();
        String b = txt2.getText();
        String c = txt3.getText();
        int d;
        if (a.length() <= 0.5 && b.length() <= 70 && c.length() <= 90) {
            d = 1;
            String e = Integer.toString(d);
            txt4.setText(e);
        } else {

            if (a.length() <= 1 && b.length() <= 80 && c.length() <= 90) {
                d = 2;
                String e = Integer.toString(d);
                txt4.setText(e);
            } else {
                if (a.length() <= 1.25 && b.length() <= 80 && c.length() <= 90) {
                    d = 3;
                    String e = Integer.toString(d);
                    txt4.setText(e);
                } else {
                    if (a.length() <= 1.30 && b.length() <= 90 && c.length() <= 90) {
                        d = 4;
                        String e = Integer.toString(d);
                        txt4.setText(e);
                    } else {
                        if (a.length() <= 1.33 && b.length() <= 90 && c.length() <= 90) {
                            d = 5;
                            String e = Integer.toString(d);
                            txt4.setText(e);
                        } else {
                            if (a.length() <= 1.40 && b.length() <= 90 && c.length() <= 90) {
                                d = 6;
                                String e = Integer.toString(d);
                                txt4.setText(e);
                            } else {
                                d = 7;
                                String e = Integer.toString(d);
                                txt4.setText(e);
                            }
                        }
                    }
                }
            }

        }
        objcrud.Mostrardieta(txt4.getText(), jTable1);
        objcrud.guardardieta(txt4.getText(), txtcodigo.getText(), txtnombre.getText(), txt1.getText(), txt2.getText(), txt3.getText());

    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

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
            java.util.logging.Logger.getLogger(gendieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gendieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gendieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gendieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gendieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenuPrincipal;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

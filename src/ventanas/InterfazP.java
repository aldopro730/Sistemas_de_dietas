/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Programa.salida;
import Programa2.gendieta;
import Programa2.menu1;
import Vistas.Formulario1;
import comunicacionserial.ArduinoExcepcion;
import comunicacionserial.ComunicacionSerial_Arduino;
import getset.variables;
import itp_library.imformacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import sql.CrusSql;

/**
 *
 * @author Ernesto
 */
public class InterfazP extends javax.swing.JFrame {

    ComunicacionSerial_Arduino conexion = new ComunicacionSerial_Arduino();
    SerialPortEventListener listen = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent serialPortEvent) {
            try {
                if (conexion.isMessageAvailable()) {
                    txt1.setText(conexion.printMessage());
                    conexion.killArduinoConnection();

                }
            } catch (SerialPortException ex) {
                Logger.getLogger(InterfazP.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoExcepcion ex) {
                Logger.getLogger(InterfazP.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    };
    
    

    public InterfazP() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conexion.arduinoRXTX("COM11", 9600, listen);
        } catch (ArduinoExcepcion ex) {
            Logger.getLogger(InterfazP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logohpp.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt33 = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIO DE SESION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resp/Sports-PNG-Image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 490, 310));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo de acceso:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, -1));

        txt1.setBackground(new java.awt.Color(0, 0, 51));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 220, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        txt33.setBackground(new java.awt.Color(0, 0, 51));
        txt33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt33.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 220, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 503));

        txt3.setBackground(new java.awt.Color(0, 0, 51));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 220, 30));

        txt4.setBackground(new java.awt.Color(0, 0, 51));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, 30));

        txt5.setBackground(new java.awt.Color(0, 0, 51));
        txt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 220, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imformacion o = new imformacion();
        o.setVisible(true);
        o.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    CrusSql crud = new CrusSql();
    variables var = new variables();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        crud.mos(txt1.getText(), txt33.getText());
        
        txt4.setText(var.getCodigo());
        txt5.setText(var.getNombre());
        String a = txt4.getText();
        String b = txt5.getText();
        
        
            
        if ("".equals(a) || "".equals(b)) {
            
            imformacion o = new imformacion();
            o.setVisible(true);
            o.setLocationRelativeTo(null);
            this.setVisible(false);
           
        
        } else {
            menu1 ob = new menu1();
            ob.setDato(txt1.getText());
            ob.setNom(txt33.getText());
            ob.setVisible(true);
            ob.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(InterfazP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}

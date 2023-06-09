package p1_leccion1;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEXANDRA
 */
public class deportista extends javax.swing.JFrame {

    static String cadenaConexion = "jdbc:postgresql://127.0.0.1/MASCOTA_LECCION1?";
    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String cadenaDriver = "org.postgresql.Driver";
    static String consultaSQL = "SELECT * FROM mascota";
    static Mascota objMascota;

    DefaultTableModel modelo;

    public deportista() {
        initComponents();

        this.getContentPane().setBackground(java.awt.Color.GRAY);
        conectarBD_mascota();

        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre Común");
        modelo.addColumn("Nombre Propio");
        modelo.addColumn("Edad");
        modelo.addColumn("Color");
        modelo.addColumn("Porcion Alimento/Dia");
        modelo.addColumn("Fecha Registro");
        this.tbl_datosMascota.setModel(modelo);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("imagenSistem/pet.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        txtCod = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtNc = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtNp = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtEdad = new java.awt.TextField();
        label5 = new java.awt.Label();
        txtColor = new java.awt.TextField();
        txtPorcAli = new java.awt.TextField();
        label6 = new java.awt.Label();
        btnNuevo = new javax.swing.JButton();
        label7 = new java.awt.Label();
        jdcFreg = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        txtDeporte = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datosMascota = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE MASCOTAS");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 102, 102));
        panel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 0, 255));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE DEPORTISTA");

        label1.setBackground(new java.awt.Color(0, 204, 204));
        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText(" Código: ");

        txtCod.setForeground(new java.awt.Color(0, 0, 102));

        label2.setBackground(new java.awt.Color(0, 204, 204));
        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText(" Genero:");

        txtNc.setForeground(new java.awt.Color(0, 0, 102));

        label3.setBackground(new java.awt.Color(0, 204, 204));
        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText(" Nombre : ");

        txtNp.setForeground(new java.awt.Color(0, 0, 102));

        label4.setBackground(new java.awt.Color(0, 204, 204));
        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText(" Direccion: ");

        txtEdad.setForeground(new java.awt.Color(0, 0, 102));

        label5.setBackground(new java.awt.Color(0, 204, 204));
        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText(" Fecha de Nacimiento:");

        txtColor.setForeground(new java.awt.Color(0, 0, 102));

        txtPorcAli.setForeground(new java.awt.Color(0, 0, 102));

        label6.setBackground(new java.awt.Color(0, 204, 204));
        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText(" Edad:");

        btnNuevo.setBackground(new java.awt.Color(153, 153, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/nuevo.png"))); // NOI18N
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        label7.setBackground(new java.awt.Color(0, 204, 204));
        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setText(" Fecha Registro: ");

        jdcFreg.setForeground(new java.awt.Color(0, 0, 102));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeporteActionPerformed(evt);
            }
        });

        label8.setBackground(new java.awt.Color(0, 204, 204));
        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setText(" Deporte:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPorcAli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFreg, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtDeporte, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnNuevo)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPorcAli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addGap(32, 32, 32))))))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 690, 200));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTA DE DEPORTISTA");

        btnConsultar.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/1 consulta.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/1 consulta.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tbl_datosMascota.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbl_datosMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_datosMascota.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(tbl_datosMascota);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 690, 300));

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/SALIR.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenSistem/WhatsApp Image 2022-11-25 at 02.38.41.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static public void conectarBD_mascota() {
        try {
            Class.forName(cadenaDriver);
            conexion = DriverManager.getConnection(cadenaConexion, "postgres", "0942482787");
            sentencia = conexion.createStatement();

            resultado = sentencia.executeQuery(consultaSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void cerrarconexion() {
        conexion = null;

        if (resultado != null) {
            try {
                resultado.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (sentencia != null) {
            try {
                sentencia.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            objMascota = new Mascota();
            objMascota.cod = Integer.parseInt(txtCod.getText());
            objMascota.nomComun = txtNc.getText();
            objMascota.nomPropio = txtNp.getText();
            objMascota.edad = Integer.parseInt(txtEdad.getText());
            objMascota.color = txtColor.getText();
            objMascota.porcionAlim = txtPorcAli.getText();
            objMascota.fechaReg = jdcFreg.getDate();

            String sentenciaSQL = new String();

            sentenciaSQL = "INSERT INTO mascota( cod_mas, nomcomun, nompropio, edad, color, porcionalim, fechareg)";
            sentenciaSQL = sentenciaSQL + " VALUES ("+ objMascota.cod +",'" + objMascota.nomComun + "','" + objMascota.nomPropio + "', " + objMascota.edad + ", '" + objMascota.color + "', '" + objMascota.porcionAlim + "','" + objMascota.fechaReg + "')";
            sentencia.execute(sentenciaSQL);
            JOptionPane.showMessageDialog(this, "Guardado Correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(deportista.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtCod.setText("");
        txtNc.setText("");
        txtNp.setText("");
        txtEdad.setText("");
        txtColor.setText("");
        txtPorcAli.setText("");
        jdcFreg.setDate(null);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        conectarBD_mascota();
        try {
            List<Mascota> lista = new ArrayList<>();
            Mascota objMascota;
            //    Long id = 0l;
            while (resultado.next()) {
                objMascota = new Mascota();
                objMascota.setCod(resultado.getInt("cod_mas"));
                objMascota.setNomComun(resultado.getString("nomcomun"));
                objMascota.setNomPropio(resultado.getString("nompropio"));
                objMascota.setEdad(resultado.getInt("edad"));
                objMascota.setColor(resultado.getString("color"));
                objMascota.setPorcionAlim(resultado.getString("porcionalim"));
                objMascota.setFechaReg(resultado.getDate("fechareg"));

                lista.add(objMascota);
            }
            int num = lista.size();
            txtCod.setText(Integer.toString(num + 1));
//            JOptionPane.showMessageDialog(this, + num);
        } catch (SQLException ex) {
            Logger.getLogger(deportista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int cantfila = tbl_datosMascota.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        conectarBD_mascota();
        try {
            List<Mascota> lista = new ArrayList<>();
            Mascota objMascota;
            //    Long id = 0l;
            while (resultado.next()) {
                objMascota = new Mascota();
                objMascota.setCod(resultado.getInt("cod_mas"));
                objMascota.setNomComun(resultado.getString("nomcomun"));
                objMascota.setNomPropio(resultado.getString("nompropio"));
                objMascota.setEdad(resultado.getInt("edad"));
                objMascota.setColor(resultado.getString("color"));
                objMascota.setPorcionAlim(resultado.getString("porcionalim"));
                objMascota.setFechaReg(resultado.getDate("fechareg"));

                lista.add(objMascota);
            }
            String[] datos;

            for (Mascota elem : lista) {
                datos = new String[7];
                datos[0] = Integer.toString(elem.cod);
                datos[1] = elem.nomComun;
                datos[2] = elem.nomPropio;
                datos[3] = Integer.toString(elem.edad);
                datos[4] = elem.color;
                datos[5] = elem.porcionAlim;
                datos[6] = (elem.fechaReg).toString();

                modelo.addRow(datos);
            }
            tbl_datosMascota.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(deportista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        cerrarconexion();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeporteActionPerformed

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
            java.util.logging.Logger.getLogger(deportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new deportista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFreg;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbl_datosMascota;
    private java.awt.TextField txtCod;
    private java.awt.TextField txtColor;
    private javax.swing.JTextField txtDeporte;
    private java.awt.TextField txtEdad;
    private java.awt.TextField txtNc;
    private java.awt.TextField txtNp;
    private java.awt.TextField txtPorcAli;
    // End of variables declaration//GEN-END:variables
}

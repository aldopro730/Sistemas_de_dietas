/*clase que se encarga de de pedir los datos
 *instacir las clases Imc y CondicionesDePeso
 * mandar la informacion y luego mostrarla
 */
package cimc;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Formulario12 extends javax.swing.JFrame {

    //instanciamos la clase CondicionesDePeso
    static CondicionesDePeso condicion = new CondicionesDePeso();
    //para generar valores decimales con un solo deciaml (00.0, 0.0)
    java.text.DecimalFormat formato = new java.text.DecimalFormat("###.#");
    //instanciamos la clase Imc
    static Imc imcI = new Imc();

    public Formulario12() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformacionDelPeso = new javax.swing.JTextArea();
        botonImc = new javax.swing.JButton();
        tipoImc = new javax.swing.JLabel();
        imc = new javax.swing.JLabel();
        botonX = new javax.swing.JButton();
        botonLeeme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Peso en Kilogramos (Kg)");

        jLabel2.setText("Altura en metros (m)");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Oxigeno en la sangre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(botonLimpiar)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cajaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular)
                    .addComponent(botonLimpiar))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin nombre.png"))); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 540, 470));

        InformacionDelPeso.setEditable(false);
        InformacionDelPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        InformacionDelPeso.setRows(5);
        InformacionDelPeso.setText("ingrese su altura, su peso y su oxigeno \nen la sangreen formatos 0.0 o 0\n\n\n");
        InformacionDelPeso.setAutoscrolls(false);
        InformacionDelPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iformacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane1.setViewportView(InformacionDelPeso);
        InformacionDelPeso.getAccessibleContext().setAccessibleName("");
        InformacionDelPeso.getAccessibleContext().setAccessibleParent(jLabel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 264, 290));

        botonImc.setText("mas del IMC");
        botonImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImcActionPerformed(evt);
            }
        });
        getContentPane().add(botonImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        tipoImc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        tipoImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoImc.setText("Masa corporal");
        tipoImc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tipoImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 259, 162));

        imc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        imc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imc.setText("Dieta");
        imc.setDoubleBuffered(true);
        imc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 259, 37));

        botonX.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botonX.setForeground(new java.awt.Color(255, 0, 0));
        botonX.setText("X");
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });
        getContentPane().add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));

        botonLeeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLeemeActionPerformed(evt);
            }
        });
        getContentPane().add(botonLeeme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // metodo que llama a un metodo para q recoja el peso y la altura
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        recogerPesoAltura();
    }//GEN-LAST:event_CalcularActionPerformed

    //metodo que restaura los campos
    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        cajaPeso.setText("");
        cajaPeso.setBackground(Color.white);
        cajaAltura.setText("");
        cajaAltura.setBackground(Color.white);
        imc.setText("IMC");
        tipoImc.setText("Masa Corporal");
        tipoImc.setForeground(Color.black);
        InformacionDelPeso.setForeground(Color.black);
        InformacionDelPeso.setText("ingrese su altura y su peso\nen formatos 0.0 o 0\n\n\n");
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin nombre.png")));

    }//GEN-LAST:event_botonLimpiarActionPerformed

    //mostramos info sobre el IMC
    private void botonImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImcActionPerformed
        JOptionPane.showMessageDialog(null, "El IMC, Body Mass Index o Índice de Quetelet es un parámetro utilizado ampliamente"
                + "\npara evaluar el estado nutricional de una persona. Es una medida antropométrica que relaciona el peso y"
                + "\nla talla de un individuo. Dada su facilidad de aplicación, el IMC se ha convertido en una de las medidas "
                + "\nmás usadas para diagnosticar obesidad, preobesidad, bajo peso o desnutrición. Sin embrago, no debemos "
                + "\nolvidar que sólo se estima a partir del peso y la altura, por lo tanto, una de las limitaciones de "
                + "\nesta medida antropométrica es que no diferencia entre masa grasa y masa magra o muscular presente "
                + "\nen el organismo. Así, un atleta por ejemplo, podrá ser diagnosticado de obesidad por tener un IMC elevado,"
                + "\ncuando en realidad la obesidad es un exceso de grasa corporal y el deportista, posee gran cantidad"
                + "\nde músculo en la composición de su cuerpo y por esta razón es mayor su peso corporal. Entonces, "
                + "\npara salvar estas equivocaciones en casos particulares, se debe complementar el IMC con otros "
                + "\nparámetros de la antropometría que permiten discriminar la cantidad de grasa y músculo de nuestro "
                + "\ncuerpo. No obstante estas limitaciones, el IMC se puede aplicar a cualquier individuo con "
                + "\nuna actividad física normal."
                + "\n¿Cómo se calcula el Índice de Masa Corporal?"
                + "\nEl IMC se estima aplicando una ecuación que consiste en dividir el peso corporal en kilogramos "
                + "\npor la altura al cuadrado. Es decir, para calcular el IMC se utiliza la siguiente fórmula:P/T2 . Aquí "
                + "\npodemos ver con que facilidad se obtiene este índice y por qué todos lo podemos utilizar para valorar "
                + "\nnuestro estado nutricional."
                + "\nUna vez obtenido el valor del IMC, el resultado se clasifica como normal si el valor se encuentra "
                + "\nentre 18,5 y 24,9. Si éste se encuentra entre 25 y 29,9 se dice que el individuo tiene sobrepeso leve,"
                + "\nsi es mayor a 30 está indicando la presencia de obesidad, y a medida que el valor numérico del índice"
                + "\naumenta, se incrementa la gravedad de la obesidad. Si por el contrario el IMC se nencuentra entre 17 y 18,5"
                + "\nestamos ante la presencia de bajo peso, y si el resultado es inferior "
                + "\na 17, se diagnostica desnutrición de primer grado, aumentando la intensidad de la patología a "
                + "\nmedida que disminuye el valor del índice.");
    }//GEN-LAST:event_botonImcActionPerformed

    //mostramos la informacion de la version
    private void botonLeemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLeemeActionPerformed
        JOptionPane.showMessageDialog(null, "C.IMC v1.0.0.0 es un software libre"
                + "\ny de codigo abierto, por lo cual"
                + "\nse permite la distribucion de copias"
                + "\ny de su codigo. se permite"
                + "\nel mejoramiento al codigo y al software"
                + "\nsin intereses comerciles"
                + "\nni animo de lucro, todas"
                + "\nlas versiones basadas en "
                + "\nC.IMC v1.0.0.0"
                + "\ndeben ser distribuidas gratuitamente"
                + "\ny deben tener codigo abierto");
    }//GEN-LAST:event_botonLeemeActionPerformed

    //salimos de la aplicacop
    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonXActionPerformed

    //metodo que recoje la altura y el peso
    // y verifica que las cajas de texto no esten con letras
    //o valores menores a 1
    public void recogerPesoAltura() {
        double peso = 0;
        double altura = 0;
        boolean hayErrores = false;

        try {
            peso = Double.parseDouble(cajaPeso.getText());
        } catch (Exception e) {
            cajaPeso.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        try {
            altura = Double.parseDouble(cajaAltura.getText());
        } catch (Exception e) {
            cajaAltura.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        if (peso < 1) {
            cajaPeso.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }

        if (altura < 1) {
            cajaAltura.setBackground(Color.red);
            IformacionDelError();
            hayErrores = true;
        }
        if (!hayErrores) {
            imcI.setPeso(peso);
            imcI.setAltura(altura);
            restauarDespuesDeCorregirErrores();
            calcularImcYMostrarInformacion();
        }
    }

    //metodo que llama a los metodos segun el peso
    public void calcularImcYMostrarInformacion() {
        if (imcI.calcularIMC() < 17) {
            desnutricion();
        }
        if (imcI.calcularIMC() >= 17 && imcI.calcularIMC() < 18.5) {
            bajoPeso();
        }
        if (imcI.calcularIMC() >= 18.5 && imcI.calcularIMC() < 26) {
            pesoNormal();
        }
        if (imcI.calcularIMC() >= 25 && imcI.calcularIMC() < 30) {
            sobrePeso();
        }
        if (imcI.calcularIMC() >= 30 && imcI.calcularIMC() < 40) {
            obesidad();
        }
        if (imcI.calcularIMC() >= 40) {
            obesidadMordiba();
        }
    }

    
    /*bloque de metodos encargados de mostrar la informacion
     al usuario sobre sus condicones de peso y mostrar la imagen*/
    public void desnutricion() {
        tipoImc.setForeground(Color.BLUE);
        tipoImc.setText(condicion.desnutricion());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_1.png")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getDesnutricion());
    }

    public void bajoPeso() {
        tipoImc.setForeground(Color.BLUE);
        tipoImc.setText(condicion.pesoBajo());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_2.jpeg")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getBajoPeso());
    }

    public void pesoNormal() {
        tipoImc.setForeground(Color.GREEN);
        tipoImc.setText(condicion.pesoNormal());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_3.jpeg")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getPesoNormal());
    }

    public void sobrePeso() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.sobrepesoLeve());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_4.jpeg")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getSobrePeso());
    }

    public void obesidad() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.obesidad());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_5.jpeg")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getObesidad());
    }

    public void obesidadMordiba() {
        tipoImc.setForeground(Color.red);
        tipoImc.setText(condicion.obesidadMordiba());
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_6.jpeg")));
        imc.setText(formato.format(imcI.calcularIMC()));
        InformacionDelPeso.setText(condicion.getObesividadMordiba());
    }

    public void restauarDespuesDeCorregirErrores() {
        cajaPeso.setBackground(Color.white);
        cajaAltura.setBackground(Color.white);
        InformacionDelPeso.setForeground(Color.black);
    }

    public void IformacionDelError() {
        InformacionDelPeso.setForeground(Color.red);
        InformacionDelPeso.setText("No se permiten caracteres especiales"
                + "\nni medidas de peso o"
                + "\naltura menores que 1");

    }

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Formulario12().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private static javax.swing.JTextArea InformacionDelPeso;
    private javax.swing.JButton botonImc;
    private javax.swing.JButton botonLeeme;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonX;
    private static javax.swing.JTextField cajaAltura;
    private static javax.swing.JTextField cajaPeso;
    private static javax.swing.JLabel imagen;
    private javax.swing.JLabel imc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel tipoImc;
    // End of variables declaration//GEN-END:variables
}

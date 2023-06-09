/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import getset.variables;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CrusSql extends conexionsql {

    java.sql.Statement st;
    ResultSet rs;
    variables var = new variables();

    public static double divide(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero.");
        }
        return dividendo / divisor;
    }

    public static Connection connect() {
        String url = "jdbc:postgresql://localhost/BDCentro_redimiento";
        String user = "postgres";
        String password = "73024605";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Método para cerrar la conexión a la base de datos
    public static void close(Connection conn) {
        try {
            conn.close();
            System.out.println("Conexión cerrada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para validar las credenciales del usuario
    public static boolean validateCredentials(String email, String password) {
        String sql = "SELECT * FROM Usuarios WHERE email = ? AND pasword = ?";
        try ( Connection conn = connect();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Inicio de sesión exitoso");
                return true;
            } else {
                System.out.println("Credenciales inválidas");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Método principal para el inicio de sesión
    public static void login(String email, String password) {
        if (validateCredentials(email, password)) {
            // Aquí puede agregar la lógica adicional para redirigir al usuario a la página correspondiente
            System.out.println("Redirigiendo al usuario a la página de inicio");
        } else {
            // Aquí puede agregar la lógica adicional para manejar el inicio de sesión fallido
            System.out.println("No se pudo iniciar sesión");
        }
        close(connect());
    }

    public void guardardieta(String n, String cod, String Nombre, String altura, String peso, String ox) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into regdieta (numero, codigo , nombre , altura , peso , ox ) values ('" + n + "', '" + cod + "','" + Nombre + "','" + altura + "','" + peso + "','" + ox + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void guardarutina(String n, String cod, String Nombre) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into regruti (rutina, codigo , nombre ) values ('" + n + "', '" + cod + "','" + Nombre + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void insertar(String Codigo, String genero, String Nombre, String direccion, String fecha, String fechadereg, String edad, String deporte) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into deportess (codigo, genero , nombre , direccion , fecha , fechadereg ,  edad ,deporte ) values (" + Codigo + ", '" + genero + "','" + Nombre + "','" + direccion + "','" + fecha + "','" + fechadereg + "','" + edad + "','" + deporte + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void insertarmed(String Codigo, String genero, String Nombre, String direccion, String fecha, String fechadereg, String edad, String especialidad) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into medc (codigomed, generomed , nombremed , direccionmed , fechamed , fechaderegmed ,  edadmed , especialidad ) values (" + Codigo + ", '" + genero + "','" + Nombre + "','" + direccion + "','" + fecha + "','" + fechadereg + "','" + edad + "','" + especialidad + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void insertarrut(String tipoderu, String ejerc, String tiempodeej, String desc) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into generarrutina (tipoderutina, ejercicios , tiempodeejercico , descanso) values ('" + tipoderu + "', '" + ejerc + "','" + tiempodeej + "','" + desc + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void insertadiet(String desa, String merienda, String almuerzo, String cena) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into dietagene ( desayuno , merienda , almuerzo, cena) values ('" + desa + "','" + merienda + "','" + almuerzo + "','" + cena + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro de guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void mostrar(String id) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from deportess where codigo ='" + id + "';";

            rs = st.executeQuery(sql);
            if (rs.next()) {
                var.setCodigo(rs.getString("Codigo"));
                var.setGenero(rs.getString("genero"));
                var.setNombre(rs.getString("nombre"));
                var.setDireccion(rs.getString("direccion"));
                var.setFecha(rs.getString("fecha"));
                var.setFechadereg(rs.getString("fechadereg"));
                var.setEdad(rs.getString("edad"));
                var.setDeporte(rs.getString("deporte"));

            } else {
                var.setCodigo("");
                var.setGenero("");
                var.setNombre("");
                var.setDireccion("");
                var.setFecha("");
                var.setFechadereg("");
                var.setEdad("");
                var.setDeporte("");
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR  EN EL SISTEMA DE BUSQUEDA" + e, "error busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Mostrardieta(String dr, JTable Tabla) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from dietagene where id =" + dr + ";";

            rs = st.executeQuery(sql);
            if (rs.next()) {
                Mostrardietas(dr, Tabla);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el registro de ese tipo de rutina", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR  EN EL SISTEMA DE BUSQUEDA" + e, "error busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Mostrardietas(String dere, JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Nro");
        modelo.addColumn("Desayuno");
        modelo.addColumn("Merienda");
        modelo.addColumn("Almuerzo");
        modelo.addColumn("Cena");

        Tabla.setModel(modelo);

        sql = "select * from dietagene where id =" + dere + ";";

        String[] datos = new String[5];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void mostrarutina(String der, JTable Tabla) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from generarrutina where tipoderutina ='" + der + "';";

            rs = st.executeQuery(sql);
            if (rs.next()) {
                Mostrarrutina(der, Tabla);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el registro de ese tipo de rutina", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR  EN EL SISTEMA DE BUSQUEDA" + e, "error busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Mostrarrutina(String ders, JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Rutina");
        modelo.addColumn("Ejercicios");
        modelo.addColumn("Tiempo");
        modelo.addColumn("Descanso");

        Tabla.setModel(modelo);

        sql = "select * from generarrutina where tipoderutina ='" + ders + "';";

        String[] datos = new String[4];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void mos(String codigo, String nombre) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from deportess where codigo ='" + codigo + "' AND nombre='" + nombre + "';";

            rs = st.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", JOptionPane.INFORMATION_MESSAGE);
                var.setCodigo(rs.getString("codigo"));
                var.setNombre(rs.getString("nombre"));
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
                var.setCodigo("");
                var.setNombre("");

            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR  EN EL SISTEMA DE BUSQUEDA" + e, "error busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void mosmed(String codigo, String nombre) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from medc where codigomed ='" + codigo + "' AND nombremed='" + nombre + "';";

            rs = st.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", JOptionPane.INFORMATION_MESSAGE);
                var.setCodigo(rs.getString("codigomed"));
                var.setNombre(rs.getString("nombremed"));
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
                var.setCodigo("");
                var.setNombre("");

            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR  EN EL SISTEMA DE BUSQUEDA" + e, "error busqueda", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actualizar(String codigo, String nombre, String apellido, String direcion, String celular, String id) {

        try {

            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update deportess set codigo=" + codigo + ",nom='" + nombre + "',apelli='" + apellido + "',direc='" + direcion + "',cel='" + celular + "' where id='" + id + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se actualizo" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void actualizardep(String Codigo, String genero, String Nombre, String direccion, String fecha, String fechadereg, String edad, String deporte) {

        try {

            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update deportess set codigo=" + Codigo + ",genero='" + genero + "',nombre='" + Nombre + "',direccion='" + direccion + "',fecha='" + fecha + "',fechadereg='" + fechadereg + "',edad='" + edad + "',deporte='" + deporte + "' where codigo='" + Codigo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se actualizo" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void actualizarmed(String Codigo, String genero, String Nombre, String direccion, String fecha, String fechadereg, String edad, String especialidad) {

        try {

            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update medc set codigomed=" + Codigo + ",generomed='" + genero + "',nombremed='" + Nombre + "',direccionmed='" + direccion + "',fechamed='" + fecha + "',fechaderegmed='" + fechadereg + "',edadmed='" + edad + "',especialidad='" + especialidad + "' where codigomed='" + Codigo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se actualizo" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void eliminar(String id) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from deportess where codigo='" + id + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "eliminado", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se elimino" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void eliminardep(String id) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from deportess where codigo='" + id + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "eliminado", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se elimino" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void eliminarmed(String id) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from medc where codigomed='" + id + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "eliminado", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se elimino" + e, "error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void Mostrartbmed(JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Genero");
        modelo.addColumn("Nombres");
        modelo.addColumn("Direccion");
        modelo.addColumn("fecha de nacimiento");
        modelo.addColumn("fecha de registro");
        modelo.addColumn("edad");
        modelo.addColumn("Especialidad");

        Tabla.setModel(modelo);

        sql = "select * from medc;";

        String[] datos = new String[8];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void Mostrartb(JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Genero");
        modelo.addColumn("Nombres");
        modelo.addColumn("Direccion");
        modelo.addColumn("fecha de nacimiento");
        modelo.addColumn("fecha de registro");
        modelo.addColumn("edad");
        modelo.addColumn("deporte");

        Tabla.setModel(modelo);

        sql = "select * from deportess;";

        String[] datos = new String[8];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void Mostrarutina(JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("ID");
        modelo.addColumn("Rutina");
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");

        Tabla.setModel(modelo);

        sql = "select * from regruti;";

        String[] datos = new String[4];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void Mostradietas(JTable Tabla) {

        Connection conexion = conectar();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("ID");
        modelo.addColumn("Nro de dieta");
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Altura");
        modelo.addColumn("Peso");
        modelo.addColumn("Oxigenacion");

        Tabla.setModel(modelo);

        sql = "select * from regdieta;";

        String[] datos = new String[7];

        Statement st;

        try {

            st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);

                modelo.addRow(datos);

            }

            Tabla.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

}

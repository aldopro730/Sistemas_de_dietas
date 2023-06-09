/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
   Connection con=null;
   String url ="jdbc:postgresql://localhost/ControlDatos";
   String usuario = "postgres";
   String clave = "73024605";
   
   public Connection conectar ()
   {
       try {
           Class.forName("org.postgresql.Driver");
           con = DriverManager.getConnection(url,usuario,clave);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error al conectar"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
       
       return con;
   }
           
    
}

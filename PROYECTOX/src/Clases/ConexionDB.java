/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EQUINOX
 */
public class ConexionDB {
    
    public Connection conexion() {
    Connection cn=null;
    String query ="";
        try {
            //jdbc:oracle:thin:@localhost:1521:XE
            String url = "jdbc:oracle:thin:@localhost:1521:XE";  //@equipo:puerto:NombreServicio
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            cn = DriverManager.getConnection(url,"hr","hr");
        }
        catch(ClassNotFoundException ex) {
            //COMPONENTE QUE MOSTRARMENSAJE.setText("No se encontro el Driver Oracle para JDBC");
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    public int Ingresar(Connection cn, String sQuery) {
    Statement st;
    int filas=0;
    try {
            st = cn.createStatement();
            filas = st.executeUpdate(sQuery); 
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filas;
    }
    
    public ResultSet Consultar(Connection cn, String sQuery) { //-----------------------------------------------------------<>>>
    Statement st;
    ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sQuery); 
            //st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recargas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Xavier
 */
public class conexion {
    public String bd ="recargas_claro";
    public String login = "root";
    public String password = " ";
    public String url = "jdbc:mysql://localhost/"+bd;
    private Usuario user = new Usuario();
    
    Connection conn = null;
    public conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, login, password);
        if (conn !=null){
            JOptionPane.showMessageDialog(null, "No hay entrada de dinero"+bd+".listo");
        }
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
    return conn;
        }
    public void desconectar(){
    conn = null;
    }

    private static class Usuario {

        public Usuario() {
        }
    }
}



    
    


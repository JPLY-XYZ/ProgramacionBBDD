/*
17.05.24. Clse Conexion con métodos
*/
package clases;

import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultSet;
    private PreparedStatement pstmt;
        
    public Conexion(String driver, String conector, String host, String puerto, String baseDatos, String usuario, String password) {
        try {
            Class.forName(driver);
            String lclCadenaConexion = "jdbc:"+conector+"://" + host + ":" + puerto + "/" + baseDatos;
            System.out.println(lclCadenaConexion);
            conexion = DriverManager.getConnection("jdbc:"+conector+"://" + host + ":" + puerto + "/" + baseDatos, usuario, password);
            System.out.println(conexion);
            conexion.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }        
    }
        
    /**
     * Devuelve al resultset los resultados de una consulta
     *
     * @param consulta Consulta a ejecutar
     */
    public void ejecutarConsulta(String consulta) {
        try {
            sentencia = conexion.createStatement();
            resultSet = sentencia.executeQuery(consulta);           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public boolean actualizarValores(String updateQuery) throws SQLException {

        try (Statement statement = conexion.createStatement()) {
            int rowsUpdated = statement.executeUpdate(updateQuery);
            return rowsUpdated > 0; // Devuelve true si se ha actualizado al menos una fila, false en caso contrario.
        }
    }
      
    public boolean eliminarRegistros(String deleteQuery) throws SQLException {

    try (Statement statement = conexion.createStatement()) {
        int rowsDeleted = statement.executeUpdate(deleteQuery);
        return rowsDeleted > 0; // Devuelve true si se ha eliminado al menos una fila, false en caso contrario.
    }
}
    
    
    public ResultSet getResultSet() {
        return resultSet;
    }
    
    
    public void cierraConexion(){
        try {
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
   
    
    
        
   
}

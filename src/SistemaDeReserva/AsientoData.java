/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

/**
 *
 * @author arguss
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AsientoData {
     private Connection connection = null;

    public AsientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
     public void guardarAsiento(Asiento asiento){
        try {
            
            String sql = "INSERT INTO Asiento (id_VueloNro, numero, letra, pasillo, disponible, precio ) VALUES ( ?, ?, ?, ?, ?, ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, asiento.getId_vueloNro());
            statement.setInt(2, asiento.getNumero());
            statement.setString(3, asiento.getLetra());
            statement.setBoolean(4, asiento.isPasillo());
            statement.setBoolean(5, asiento.isPasillo());
            statement.setDouble(6, asiento.getPrecio());
            
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                asiento.setId_asiento(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un asiento");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un asiento: " + ex.getMessage());
        }
    }
    public List<Asiento> obtenerAsientos(){
        List<Asiento> asientos = new ArrayList<Asiento>();
            

        try {
            String sql = "SELECT * FROM asiento;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Asiento asiento;
            while(resultSet.next()){
                asiento = new Asiento();
                asiento.setId_asiento(resultSet.getInt("id_asiento"));
                asiento.setId_vueloNro(resultSet.getInt("id_vueloNro"));
                asiento.setNumero(resultSet.getInt("numero"));
                asiento.setLetra(resultSet.getString("letra"));
                asiento.setPasillo(resultSet.getBoolean("pasillo"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
                asiento.setPrecio(resultSet.getDouble("precio"));
               
                

                asientos.add(asiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los asientos: " + ex.getMessage());
        }
        
        
        return asientos;
    }
    
    public void borrarAsiento(int id){
    try {
            
            String sql = "DELETE FROM asiento WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un asiento: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAsiento(Asiento asiento){
    
        try {
            
            String sql = "UPDATE asiento SET pasillo = ?, disponible = ?, WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setBoolean(1, asiento.isPasillo());
            statement.setBoolean(2, asiento.isDisponible());
           
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un asiento: " + ex.getMessage());
        }
    
    }
    
    public Asiento buscarAsiento(int id){
    Asiento asiento=null;
    try {
            
            String sql = "SELECT * FROM asiento WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                asiento = new Asiento();               
                asiento.setId_asiento(resultSet.getInt("id_asiento"));
                asiento.setId_vueloNro(resultSet.getInt("id_vueloNro"));
                asiento.setNumero(resultSet.getInt("numero"));
                asiento.setLetra(resultSet.getString("letra"));
                asiento.setPasillo(resultSet.getBoolean("pasillo"));
                asiento.setDisponible(resultSet.getBoolean("disponible"));
                asiento.setPrecio(resultSet.getDouble("precio"));
                

                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un asiento: " + ex.getMessage());
        }
        
        return asiento;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanv
 */
public class CiudadData {
     private Connection connection = null;

    public CiudadData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
     public void guardarCiudad(Ciudad ciudad){
        try {
            
            String sql = "INSERT INTO ciudad (nombreCiudad, nombrePais ) VALUES ( ?, ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, ciudad.getNombreCiudad());
            statement.setString(2, ciudad.getNombrePais());
           
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                ciudad.setId_ciudad(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una ciudad");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una ciudad: " + ex.getMessage());
        }
    }
    public List<Ciudad> obtenerCiudades(){
        List<Ciudad> ciudades = new ArrayList<Ciudad>();
            

        try {
            String sql = "SELECT * FROM ciudad;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Ciudad ciudad;
            while(resultSet.next()){
                ciudad = new Ciudad();
                ciudad.setId_ciudad(resultSet.getInt("id_ciudad"));
                ciudad.setNombreCiudad(resultSet.getString("nombreCiudad"));
                ciudad.setNombrePais(resultSet.getString("nombrePais"));
               
                

                ciudades.add(ciudad);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las ciudades: " + ex.getMessage());
        }
        
        
        return ciudades;
    }
    
    public void borrarCiudad(int id){
    try {
            
            String sql = "DELETE FROM ciudad WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una ciudad: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarCiudad(Ciudad ciudad){
    
        try {
            
            String sql = "UPDATE ciudad SET nombreCiudad = ?, nombrePais = ?, WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, ciudad.getNombreCiudad());
            statement.setString(2, ciudad.getNombrePais());
           
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un ciudad: " + ex.getMessage());
        }
    
    }
    
    public Ciudad buscarCiudad(int id){
    Ciudad ciudad=null;
    try {
            
            String sql = "SELECT * FROM ciudad WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                ciudad = new Ciudad();
                ciudad.setId_ciudad(resultSet.getInt("id_ciudad"));
                ciudad.setNombreCiudad(resultSet.getString("nombreCiudad"));
                ciudad.setNombrePais(resultSet.getString("nombrePais"));
                

                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return ciudad;
    }
    
}

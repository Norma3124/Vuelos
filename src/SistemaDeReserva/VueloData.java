/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arguss
 */
public class VueloData {
     private Connection connection = null;

    public VueloData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
     public void guardarVuelo(Vuelo vuelo){
        try {
            
            String sql = "INSERT INTO vuelo (ciudad_origen, ciudad_destino, fecha_partida, fecha_llegada, aerolinea, aeronave ) VALUES ( ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, vuelo.getCiudadOrigen());
            statement.setString(2, vuelo.getCiudadDestino());
            statement.setDate(3, Date.valueOf(vuelo.getSalida()));
            statement.setDate(4, Date.valueOf(vuelo.getLlegada()));
            statement.setString(5, vuelo.getAerolinea());
            statement.setString(6, vuelo.getAeronave());
           
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                vuelo.setId_vuelo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un vuelo");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un vuelo: " + ex.getMessage());
        }
     }
    /*
     public List<Vuelo> obtenerVuelos(){
        List<Vuelo> vuelos = new ArrayList<Vuelo>();
            

        try {
            String sql = "SELECT * FROM vuelo;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Vuelo vuelo;
            while(resultSet.next()){
                vuelo = new Vuelo();
                vuelo.setId_vueloNro(resultSet.getInt("id_vueloNro"));
                vuelo.setId_ciudadOrigen(resultSet.getInt("id_ciudadOrigen"));
                vuelo.setId_ciudadDestino(resultSet.getInt("id_ciudadDestino"));
                vuelo.setSalida(resultSet.getDate("salida").toLocalDate());
                vuelo.setLlegada(resultSet.getDate("llegada").toLocalDate());
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setAeronave(resultSet.getString("aeronave"));
                

                vuelos.add(vuelo);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los vuelos: " + ex.getMessage());
        }
        
        
        return vuelos;
    }
     
      public void borrarVuelo(int id){
    try {
            
            String sql = "DELETE FROM vuelo WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un vuelo: " + ex.getMessage());
        }
        
    
    }
      //falta terminar actualizarVuelo (dudas sobre Estado Vuelo)
      
      public void actualizarVuelo(Vuelo vuelo){
    
        try {
            
            String sql = "UPDATE vuelo SET id_ciudadOrigen = ?, id_ciudadDestino = ?, salida = ?, llegada = ?, aerolinea = ?, aeronave = ?  WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, vuelo.getId_ciudadOrigen());
            statement.setInt(2, vuelo.getId_ciudadDestino());
            statement.setDate(3, Date.valueOf(vuelo.getSalida()));
            statement.setDate(4, Date.valueOf(vuelo.getLlegada()));
            statement.setString(5, vuelo.getAerolinea());
            statement.setString(6, vuelo.getAeronave());
            statement.executeUpdate();
            
          
            statement.close();
    
        }
        catch (SQLException ex) {
            System.out.println("Error al insertar un vuelo: " + ex.getMessage());
        }
      }
      
       public Vuelo buscarVuelo(int id){
    Vuelo vuelo=null;
    try {
            
            String sql = "SELECT * FROM vuelo WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                vuelo = new Vuelo();
                vuelo.setId_vueloNro(resultSet.getInt("id_vueloNro"));
                vuelo.setId_ciudadOrigen(resultSet.getInt("id_ciudadOrigen"));
                vuelo.setId_ciudadDestino(resultSet.getInt("id_ciudadDestino"));
                vuelo.setSalida(resultSet.getDate("salida").toLocalDate());
                vuelo.setLlegada(resultSet.getDate("llegada").toLocalDate());
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setAeronave(resultSet.getString("aeronave"));
                
                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un vuelo: " + ex.getMessage());
        }
        
        return vuelo;
    }*/
}
package SistemaDeReserva;

import SistemaDeReserva.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteData {
   private Connection connection = null;

    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    //Alta de un Cliente = guarda un cliente.
    public int guardarCliente(Cliente cliente){
         try {
            String sql = "INSERT INTO cliente (nombre_apellido, dni ,domicilio, email, nro_pasaporte, nro_tarjeta ) VALUES ( ? , ? , ? , ? , ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, cliente.getNombreYApellido());
            statement.setInt(2, cliente.getDni());            
            statement.setString(3, cliente.getDomicilio());
            statement.setString(4, cliente.getEmail());
            statement.setInt(5, cliente.getNroDePasaporte());
            statement.setInt(6, cliente.getNroDeTarjeta());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cliente.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente : " + ex.getMessage());
        }return cliente.getId();
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
                cliente = new Cliente();
                
                
                

                clientes.add(cliente);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    }
    
    public void borrarCliente(int id){
    try {
            
            String sql = "DELETE FROM cliente WHERE id_cliente = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un cliente: " + ex.getMessage());
        }
    }
    
    public void actualizarCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE cliente SET pasaporte = ?, apellido = ?, nombre = ? , numeroTarjeta =?,"
                    + "email=? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombreYApellido());
            statement.setInt(2, cliente.getDni());            
            statement.setString(3, cliente.getDomicilio());
            statement.setString(4, cliente.getEmail());
            statement.setInt(5, cliente.getNroDePasaporte());
            statement.setInt(6, cliente.getNroDeTarjeta());
            statement.setInt(7, cliente.getId());
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    
    }
    
    public Cliente buscarCliente(int id){
    Cliente c=null;
    try {
        String sql = "SELECT * FROM cliente WHERE id_cliente =?;";

        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, id);

        ResultSet resultSet=statement.executeQuery();

        while(resultSet.next()){
            c = new Cliente();
            c.setId(resultSet.getInt("id_cliente"));
            c.setNombreYApellido(resultSet.getString("nombre_apellido"));
            c.setDni(resultSet.getInt("dni"));
            c.setDomicilio(resultSet.getString("domicilio"));
            c.setEmail(resultSet.getString("email"));
            c.setNroDePasaporte(resultSet.getInt("nro_pasaporte"));
            c.setNroDeTarjeta(resultSet.getInt("nro_tarjeta"));

        }      
        statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return c;
    }
}

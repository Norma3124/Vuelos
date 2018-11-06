/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

/**
 *
 * @author juanv
 */
public class Cliente {
    private int id;
    private String nombreYApellido;
    private int dni;
    private String domicilio;
    private String email;
    private int nroDePasaporte;
    private int nroDeTarjeta;

    public Cliente(int id, String nombreYApellido, int dni, String domicilio, String email, int nroDePasaporte, int nroDeTarjeta) {
        this.id = id;
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.nroDePasaporte = nroDePasaporte;
        this.nroDeTarjeta = nroDeTarjeta;
    }

    public Cliente(String nombreYApellido, int dni, String domicilio, String email, int nroDePasaporte, int nroDeTarjeta) {
        id=-1;
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.nroDePasaporte = nroDePasaporte;
        this.nroDeTarjeta = nroDeTarjeta;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNroDePasaporte() {
        return nroDePasaporte;
    }

    public void setNroDePasaporte(int nroDePasaporte) {
        this.nroDePasaporte = nroDePasaporte;
    }

    public int getNroDeTarjeta() {
        return nroDeTarjeta;
    }

    public void setNroDeTarjeta(int nroDeTarjeta) {
        this.nroDeTarjeta = nroDeTarjeta;
    }
}

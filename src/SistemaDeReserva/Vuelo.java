/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.time.LocalDate;

/**
 *
 * @author arguss
 *
 */
public class Vuelo {
    
    private int id_vuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private LocalDate salida;
    private LocalDate llegada;
    private String aerolinea;
    private String aeronave;

    public Vuelo(int id_vuelo, String ciudadOrigen, String ciudadDestino, LocalDate salida, LocalDate llegada, String aerolinea, String aeronave) {
        this.id_vuelo = id_vuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.salida = salida;
        this.llegada = llegada;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
    }

    public Vuelo(String ciudadOrigen, String ciudadDestino, LocalDate salida, LocalDate llegada, String aerolinea, String aeronave) {
        id_vuelo=-1;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.salida = salida;
        this.llegada = llegada;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
    }

    Vuelo() {
        id_vuelo=-1;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public LocalDate getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    
}
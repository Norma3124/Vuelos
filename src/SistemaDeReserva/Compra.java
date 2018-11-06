/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva;

import java.time.LocalDate;

/**
 *
 * @author juanv
 */
public class Compra {
    private int id_compra = -1;
    private int id_asiento;
    private int id_cliente;
    private LocalDate fechaRealizada;
    private double monto;

    public Compra() {
    }

    
    
    public Compra(int id_asiento, int id_cliente, LocalDate fechaRealizada, double monto) {
        this.id_asiento = id_asiento;
        this.id_cliente = id_cliente;
        this.fechaRealizada = fechaRealizada;
        this.monto = monto;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public LocalDate getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(LocalDate fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
}

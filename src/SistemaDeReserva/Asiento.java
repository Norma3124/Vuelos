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
public class Asiento {
    private int id_asiento =-1;
    private int id_vueloNro;
    private int numero;
    /*modifique el tipo de letra. Antes era char y ahora es String. lohice porque no me tomaba
    el tipo y me daba error en el codigo
    lo cambiamos cualquier cosa como siempre chicos lo hice solo para que me de bien.
    */
    private String letra;
    private boolean pasillo;
    private boolean disponible;
    private double precio;

    public Asiento(int id_vueloNro, int numero, String letra, boolean pasillo, boolean disponible, double precio) {
        this.id_vueloNro = id_vueloNro;
        this.numero = numero;
        this.letra = letra;
        this.pasillo = pasillo;
        this.disponible = disponible;
        this.precio = precio;
    }
/*hago un constructor por defecto para usarlo en la clase data pasandole todos los atributos.
    cualquiercosa lo sacaamos despues
    */
    public Asiento() {
    }

    
    
    public int getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(int id_asiento) {
        this.id_asiento = id_asiento;
    }

    public int getId_vueloNro() {
        return id_vueloNro;
    }

    public void setId_vueloNro(int id_vueloNro) {
        this.id_vueloNro = id_vueloNro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isPasillo() {
        return pasillo;
    }

    public void setPasillo(boolean pasillo) {
        this.pasillo = pasillo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}

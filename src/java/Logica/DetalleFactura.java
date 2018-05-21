/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author daniel
 */
public class DetalleFactura {
    private int codFactura;
    private int numero;
    private float totalApagar;
    private int cantidad;

    /**
     * @return the codFactura
     */
    public int getCodFactura() {
        return codFactura;
    }

    /**
     * @param codFactura the codFactura to set
     */
    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the totalApagar
     */
    public float getTotalApagar() {
        return totalApagar;
    }

    /**
     * @param totalApagar the totalApagar to set
     */
    public void setTotalApagar(float totalApagar) {
        this.totalApagar = totalApagar;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

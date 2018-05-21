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
public class Factura {
    private String codigo;
    private String ModoPago;
    private int cedempleado;
    private int cedCliente;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ModoPago
     */
    public String getModoPago() {
        return ModoPago;
    }

    /**
     * @param ModoPago the ModoPago to set
     */
    public void setModoPago(String ModoPago) {
        this.ModoPago = ModoPago;
    }

    /**
     * @return the cedempleado
     */
    public int getCedempleado() {
        return cedempleado;
    }

    /**
     * @param cedempleado the cedempleado to set
     */
    public void setCedempleado(int cedempleado) {
        this.cedempleado = cedempleado;
    }

    /**
     * @return the cedCliente
     */
    public int getCedCliente() {
        return cedCliente;
    }

    /**
     * @param cedCliente the cedCliente to set
     */
    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }
    
    
}

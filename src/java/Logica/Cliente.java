/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String genero;

    Conexion objC = new Conexion();
    Connection a;
    Statement stm;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String direccion, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean insertar() throws ClassNotFoundException, SQLException {

        try {
            a = objC.Conectar();
        } catch (ClassNotFoundException e) {
            throw e;
        }

        String sql = "INSERT INTO CLIENTE VALUES ('" + getCedula() + "', '" + getNombre() + "', '"
                + getApellido() + "', '" + getDireccion() + "', '" + getGenero() + "')";
        int n = objC.operacion(sql);

        return n != 0;

    }

    public ArrayList<Cliente> ListarClientes() throws ClassNotFoundException, SQLException {
        try {
            a = objC.Conectar();
        } catch (ClassNotFoundException e) {
            throw e;
        }

        String sql = "SELECT * FROM CLIENTE";
        ResultSet rs = objC.consular(sql);

        ArrayList<Cliente> lista = new ArrayList<>();

        while (rs.next()) {

            Cliente C = new Cliente();
            C.setCedula(rs.getString(1));
            C.setNombre(rs.getString(2));
            C.setApellido(rs.getString(3));
            C.setDireccion(rs.getString(4));
            C.setGenero(rs.getString(5));
            lista.add(C);
        }

        return lista;
    }

    public boolean validar() {
        return (!cedula.isEmpty() || !nombre.isEmpty() || !apellido.isEmpty()
                || !direccion.isEmpty() || !genero.isEmpty());
    }
    
    

}

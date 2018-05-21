/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;

/**
 *
 * @author daniel
 */
public class Conexion {

    private Statement stm;
    private ResultSet rs;
    private Connection conexion;

    public Connection Conectar() throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection("jdbc:sqlserver://DANIELLE:1433;"
                    + "databaseName=VENTAS", "sa", "RooT123456");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
            return null;
        } catch (ClassNotFoundException Nfe) {
            System.out.print("Error: " + Nfe.toString());
            return null;
        } catch (Exception ex) {
            System.out.print("Error: " + ex.toString());
            return null;
        }finally{
            conexion.close();
        }
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public int operacion(String conSQL) {

        int fila = 0;

        try {
            stm = conexion.createStatement();
            fila = stm.executeUpdate(conSQL);
            return fila;
        } catch (SQLException e) {
            return fila;
        }
    }

    public ResultSet consular(String conSql) {
        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery(conSql);
            return rs;
        } catch (SQLException e) {
            return null;
        }

    }
}

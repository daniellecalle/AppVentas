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
public class EmailUsuario extends Usuario{
    
    private String email;

    public EmailUsuario() {
    }

    public EmailUsuario(String email) {
        this.email = email;
    }

    public EmailUsuario(String email, int codigo, String nombre, String usuario, String apellido, String clave) {
        super(codigo, nombre, usuario, apellido, clave);
        this.email = email;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}

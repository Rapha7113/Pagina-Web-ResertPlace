/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andre
 */
public class Cliente {
    
    private int codCli;
    private String nomap;
    private String sexo;
    private String correo;
    private String password;

    public Cliente(int codCli, String nomap, String sexo, String correo, String password) {
        this.codCli = codCli;
        this.nomap = nomap;
        this.sexo = sexo;
        this.correo = correo;
        this.password = password;
    }

    public Cliente(String correo) {
        this.correo = correo;
    }

    
    
    public Cliente() {
    }
    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNomap() {
        return nomap;
    }

    public void setNomap(String nomap) {
        this.nomap = nomap;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}

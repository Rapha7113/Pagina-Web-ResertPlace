
package Modelo;


public class Abogado {
    
    private int cod;
    private String nomA;
    private String esp;
    private int exp;
    private String grado;  
    private int telf;
    private String correo; 
    private String Foto; 

    public Abogado(int cod, String nomA, String esp, int exp, String grado, int telf, String correo, String Foto) {
        this.cod = cod;
        this.nomA = nomA;
        this.esp = esp;
        this.exp = exp;
        this.grado = grado;
        this.telf = telf;
        this.correo = correo;
        this.Foto = Foto;
    }

    public Abogado(String esp) {
        this.esp = esp;
    }
    
     public Abogado() {

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomA() {
        return nomA;
    }

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

     
    
    
}

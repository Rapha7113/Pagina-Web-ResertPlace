/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Modalidad {
    
    private int codM;
    private String TipoM;

    public Modalidad(int codM, String TipoM) {
        this.codM = codM;
        this.TipoM = TipoM;
    }

    public Modalidad(String TipoM) {
        this.TipoM = TipoM;
    }

    public Modalidad() {
    }

    public int getCodM() {
        return codM;
    }

    public void setCodM(int codM) {
        this.codM = codM;
    }

    public String getTipoM() {
        return TipoM;
    }

    public void setTipoM(String TipoM) {
        this.TipoM = TipoM;
    }
      
}

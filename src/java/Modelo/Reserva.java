
package Modelo;


public class Reserva {
    
    private int codReserva;
    private String codClie;
    private String codAbog;
    private String codMod;
    private String fechaR;
    private String horaR;
    private boolean estadoR; 

    public Reserva() {
    }

    public Reserva(int codReserva, String codClie, String codAbog, String codMod, String fechaR, String horaR, boolean estadoR) {
        this.codReserva = codReserva;
        this.codClie = codClie;
        this.codAbog = codAbog;
        this.codMod = codMod;
        this.fechaR = fechaR;
        this.horaR = horaR;
        this.estadoR = estadoR;
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public String getCodClie() {
        return codClie;
    }

    public void setCodClie(String codClie) {
        this.codClie = codClie;
    }

    public String getCodAbog() {
        return codAbog;
    }

    public void setCodAbog(String codAbog) {
        this.codAbog = codAbog;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getHoraR() {
        return horaR;
    }

    public void setHoraR(String horaR) {
        this.horaR = horaR;
    }

    public boolean isEstadoR() {
        return estadoR;
    }

    public void setEstadoR(boolean estadoR) {
        this.estadoR = estadoR;
    }

    
    
}


package Service;

import Modelo.DaoModalidad;
import Modelo.Modalidad;
import java.util.List;



public class ServiceM {
    
    public List<Modalidad> consultarMod(){
        DaoModalidad Mdao = new DaoModalidad();
        return Mdao.consultarMod();
    }
}

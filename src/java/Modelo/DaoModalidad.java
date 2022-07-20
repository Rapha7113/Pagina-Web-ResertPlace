
package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoModalidad {
    
    public List<Modalidad> consultarMod(){
        Connection cnn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String SQL=null;
        List<Modalidad> LM = new ArrayList<Modalidad>();
        try{
            cnn = ConexionDB.getConexion();
            SQL = "SELECT * FROM modalidad";
            pstm = cnn.prepareStatement(SQL);
            rs  = pstm.executeQuery();
            while(rs.next()){
                Modalidad m = new Modalidad();
                m.setCodM(rs.getInt("id_mod"));
                m.setTipoM(rs.getString("tipo"));
                LM.add(m);
            }
        }catch(Exception ex){

        }finally{
        }
        return LM;
    }
    
    
    
    
    
}

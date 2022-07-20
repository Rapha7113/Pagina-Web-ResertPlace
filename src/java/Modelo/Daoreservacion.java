/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Daoreservacion {
    
    public List<Reserva> listar() {
        String sql = "SELECT c.id_cita,cl.noap,a.nomb_abog,m.tipo,c.r_fecha,r_hora,c.Estado FROM cita c\n" +
                      "INNER JOIN cliente cl ON cl.id_clie = c.id_clie\n" +
                      "INNER JOIN abogado a ON a.id_abog = c.id_abog\n" +
                      "INNER JOIN modalidad m ON m.id_mod = c.id_mod";
        List<Reserva>lista=new ArrayList<>();
        try {
            PreparedStatement psta=ConexionDB.getConexion()
            .prepareStatement(sql);
            ResultSet rs=psta.executeQuery(); 
            while (rs.next()) {
                Reserva p=new Reserva();
                p.setCodReserva(rs.getInt(1));
                p.setCodClie(rs.getString(2));
                p.setCodAbog(rs.getString(3));
                p.setCodMod(rs.getString(4));
                p.setFechaR(rs.getString(5));
                p.setHoraR(rs.getString(6));
                p.setEstadoR(rs.getBoolean(7));
                lista.add(p);               
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public List<Reserva> listarNu() {
        String sql = "SELECT c.id_cita,cl.noap,a.nomb_abog,m.tipo,c.r_fecha,r_hora,c.Estado FROM cita c\n" +
                      "INNER JOIN cliente cl ON cl.id_clie = c.id_clie\n" +
                      "INNER JOIN abogado a ON a.id_abog = c.id_abog\n" +
                      "INNER JOIN modalidad m ON m.id_mod = c.id_mod where c.Estado =0";
        List<Reserva>lista=new ArrayList<>();
        try {
            PreparedStatement psta=ConexionDB.getConexion()
            .prepareStatement(sql);
            ResultSet rs=psta.executeQuery(); 
            while (rs.next()) {
                Reserva p=new Reserva();
                p.setCodReserva(rs.getInt(1));
                p.setCodClie(rs.getString(2));
                p.setCodAbog(rs.getString(3));
                p.setCodMod(rs.getString(4));
                p.setFechaR(rs.getString(5));
                p.setHoraR(rs.getString(6));
                p.setEstadoR(rs.getBoolean(7));
                lista.add(p);               
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
        public void cambiarVigencia(Reserva re) {
        String sql = "UPDATE cita SET Estado = "
                + (re.isEstadoR() == true ? "1" : "0")
                + " WHERE id_cita = " + re.getCodReserva();
        try {
           PreparedStatement psta=ConexionDB.getConexion()
           .prepareStatement(sql);
            psta.executeUpdate();            
        } catch (Exception e) {            
        }
    }
    
    
    
}

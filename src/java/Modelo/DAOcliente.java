/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DAOcliente {
    
    ConexionDB cn = new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int res;

    public int agregarCli(Cliente c) {
        String sql = "Insert INTO cliente(noap,genero,E_mail,contraseña)values(?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNomap());
            ps.setString(2, c.getSexo());
            ps.setString(3, c.getCorreo());
            ps.setString(4, c.getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return res;
    }
    
    
   
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DaoAbogado {
    
    ConexionDB cn = new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
 
   public static ArrayList<Abogado>obtenerA(){
   
    ArrayList<Abogado>Lista = new ArrayList<>();
        try {
            CallableStatement cl=ConexionDB.getConexion().prepareCall("{call listarAbogados()}");
            ResultSet rs=cl.executeQuery();
            while (rs.next()){
            Abogado a= new Abogado(rs.getInt(1),rs.getString(2),rs.getString(3)
                    ,rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8));
            Lista.add(a);                  
        }
        } catch (Exception e) {
        }
         return Lista;
 } 
   
   public static Abogado Datos(int codigo){
   Abogado abo=null;
       try {
           CallableStatement cl=ConexionDB.getConexion().prepareCall("{CALL sp_Abogado(?)}");
           cl.setInt(1,codigo);
           ResultSet rs = cl.executeQuery();
           while(rs.next()){
           abo =new Abogado(rs.getInt(1),rs.getString(2),rs.getString(3)
                    ,rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8));}
       } catch (Exception e) {}  
   return abo;
   }
   
   public List listarAbogado() {
        String sql = "SELECT id_abog,nomb_abog,especialidad,grado_abog FROM abogado";
        List<Abogado> lista = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Abogado abog = new Abogado();
                abog.setCod(rs.getInt("id_abog"));
                abog.setNomA(rs.getString("nomb_abog"));
                abog.setEsp(rs.getString("especialidad"));
                abog.setGrado(rs.getString("grado_abog"));
                lista.add(abog);
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
   public int agregarAbo(Abogado p) {
        String sql = "insert into abogado(nomb_abog,especialidad,exper_abog,grado_abog,telefono,E_mail,FOTO)values(?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNomA());
            ps.setString(2, p.getEsp());
            ps.setInt(3, p.getExp());
            ps.setString(4, p.getGrado());
            ps.setInt(5, p.getTelf());
            ps.setString(6, p.getCorreo());
            ps.setString(7, p.getFoto());          
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
   
   public List<Abogado> listar() {
        String sql = "select * from abogado";
        List<Abogado>lista=new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Abogado p=new Abogado();
                p.setCod(rs.getInt(1));
                p.setNomA(rs.getString(2));
                p.setEsp(rs.getString(3));
                p.setExp(rs.getInt(4));
                p.setGrado(rs.getString(5));
                p.setTelf(rs.getInt(6));
                p.setCorreo(rs.getString(7));
                p.setFoto(rs.getString(8));
                lista.add(p);               
            }
        } catch (Exception e) {
        }
        return lista;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Abogado;
import Modelo.DaoAbogado;
import Utils.ConexionDB;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Andre
 */
public class ServletContAbo extends HttpServlet {
     DaoAbogado daoA = new DaoAbogado();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
               
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);      
         String opcion=request.getParameter("opcion");                
         if(opcion.equals("nombres")){
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("select DISTINCT especialidad from abogado");
                ResultSet rs=psta.executeQuery();                
                ArrayList<Abogado> p=new ArrayList();               
                while(rs.next()){
            Abogado e=new Abogado(rs.getString(1));
            p.add(e); 
            }
                request.setAttribute("a",p);
                request.getRequestDispatcher("Abogado_lis.jsp").forward(request, response);
            } catch (Exception e) {
            }
        }else if(opcion.equals("consultaAbo")){
            
            String nom=request.getParameter("selectAbo");
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("select * from abogado where especialidad=?");
                psta.setString(1,nom); 
                ResultSet rs=psta.executeQuery();
                ArrayList<Abogado> p=new ArrayList();               
            while(rs.next()){
            Abogado e=new Abogado(rs.getInt(1),rs.getString(2),rs.getString(3)
                    ,rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8));
            
            p.add(e); 
            }
                request.setAttribute("z",p);
                request.getRequestDispatcher("Resultado.jsp").forward(request, response);
                
            } catch (Exception e) {
            }
        }else if(opcion.equals("ListarMA")){
            try
            {
               PreparedStatement  sta=ConexionDB.getConexion().prepareStatement("Select * From abogado");
                ResultSet rs=sta.executeQuery();                
                ArrayList<Abogado> lista=new ArrayList<>();                
                while(rs.next())
                {
                 Abogado em=new Abogado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6),
                 rs.getString(7),rs.getString(8));
                 lista.add(em);
                }               
               request.setAttribute("Abog",lista);
               request.getRequestDispatcher("Mant_abogado.jsp").forward(request, response);              
            }
            catch(Exception e)
            {
                System.out.println("error"+e);
            }
        }else if (opcion.equals("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("idA"));
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("delete from abogado where id_abog=?");
                sta.setInt(1, id);
                sta.executeUpdate();
                request.getRequestDispatcher("ServletContAbo?opcion=ListarMA").forward(request, response);
            } catch (IOException | SQLException | ServletException e) {
                 System.out.println("Error al eliminar elementos");
            }
        }
          
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String op = request.getParameter("ope");

        if (op.equals("editar")) {
            int id = Integer.parseInt(request.getParameter("idA"));
            String nom = request.getParameter("txtNA");
            String esp = request.getParameter("txtESA");
            String grado = request.getParameter("txtGA");
            String e_mail = request.getParameter("txtCA");
            int ea = Integer.parseInt(request.getParameter("txtEA"));
            int tel = Integer.parseInt(request.getParameter("txtTA"));
           
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("update abogado set nomb_abog=?,especialidad=?,exper_abog=?,grado_abog=?,telefono=?,E_mail=? where id_abog=?");
                sta.setString(1, nom);
                sta.setString(2, esp);
                sta.setInt(3, ea);
                sta.setString(4, grado);
                sta.setInt(5, tel);
                 sta.setString(6, e_mail);
                sta.setInt(7, id);
                sta.executeUpdate();
                request.getRequestDispatcher("Principal.jsp").forward(request, response);

            } catch (IOException | SQLException | ServletException e) {
                System.out.println("Error al actualizar elemento");
            }
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Modalidad;
import Utils.ConexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
public class ServletModalidad extends HttpServlet {

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
        
       String op=request.getParameter("ope");
        if(op.equals("ListarMod")){
            try
            {
               PreparedStatement  sta=ConexionDB.getConexion().prepareStatement("Select * From modalidad");
                ResultSet rs=sta.executeQuery();                
                ArrayList<Modalidad> lista=new ArrayList<>();                
                while(rs.next())
                {
                 Modalidad em=new Modalidad(rs.getInt(1),rs.getString(2));
                 lista.add(em);
                }               
               request.setAttribute("Mod",lista);
               request.getRequestDispatcher("Mant_modalidad.jsp").forward(request, response);              
            }
            catch(Exception e)
            {
                System.out.println("error"+e);
            }
        }else if (op.equals("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("idMO"));
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("delete from modalidad where id_mod=?");
                sta.setInt(1, id);
                sta.executeUpdate();
                request.getRequestDispatcher("ServletModalidad?ope=ListarMod").forward(request, response);
            } catch (IOException | SQLException | ServletException e) {
                 System.out.println("Error al eliminar elementos");
            }
        }else if (op.equals("Insertar")) {
            String nom = request.getParameter("txtMODA");
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("insert into modalidad (tipo) values(?)");
                sta.setString(1,nom);
                sta.executeUpdate();
                request.getRequestDispatcher("ServletModalidad?ope=ListarMod").forward(request, response);

            } catch (IOException | SQLException | ServletException e) {
                System.out.println("Error al insertar elemento");
            }
        }else if(op.equals("tipo")){
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("SELECT tipo FROM modalidad");
                ResultSet rs=psta.executeQuery();                
                ArrayList<Modalidad> p=new ArrayList();               
                while(rs.next()){
            Modalidad e=new Modalidad(rs.getString(1));
            p.add(e); 
            }
                request.setAttribute("Mo",p);
                request.getRequestDispatcher("Reser_Usu.jsp").forward(request, response);
            } catch (Exception e) {
            }
        } 
        
        
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
            int id = Integer.parseInt(request.getParameter("idMO"));
            String nom = request.getParameter("txtTM");
           
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("update modalidad set tipo=? where id_mod=?");
                sta.setString(1, nom);
                sta.setInt(2, id);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Daoreservacion;
import Modelo.Reserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
public class ServControl extends HttpServlet {

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
        
      String accion = request.getParameter("opera");
        try {
            if (accion != null) {
                switch (accion) {
                    case "lista":
                        listado(request, response);
                        break; 
                    case "listaP":
                        listadoNC(request, response);
                        break;    
                        
                    default:
                        response.sendRedirect("");
                }
            }else if (request.getParameter("cambiar") != null) {
                cambiarEstado(request, response);
            } 
        } catch (Exception e) {           
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

    
    private void listado(HttpServletRequest request, HttpServletResponse response) {
        Daoreservacion dao = new Daoreservacion();
        List<Reserva> u;
        try {
            u = dao.listar();
            request.setAttribute("rev",u);
            request.getRequestDispatcher("Reser_estado.jsp").forward(request, response);
            
        } catch (Exception e) {
            request.setAttribute("msje", "No se pudo listar los usuarios" + e.getMessage());
        } 
        
    }
    
    private void listadoNC(HttpServletRequest request, HttpServletResponse response) {
        Daoreservacion dao = new Daoreservacion();
        List<Reserva> u;
        try {
            u = dao.listarNu();
            request.setAttribute("ren",u);
            request.getRequestDispatcher("Reserva_estado.jsp").forward(request, response);
            
        } catch (Exception e) {
            request.setAttribute("msje", "No se pudo listar los usuarios" + e.getMessage());
        } 
        
    }
                        private void cambiarEstado(HttpServletRequest request, HttpServletResponse response) {
        Daoreservacion dao;
        Reserva u;
        try {
            dao = new Daoreservacion();
            u = new Reserva();
            if (request.getParameter("cambiar").equals("activar")) {
                u.setEstadoR(true);
            } else {
                u.setEstadoR(false);
            }

            if (request.getParameter("cod") != null) {
                u.setCodReserva(Integer.parseInt(request.getParameter("cod")));
                dao.cambiarVigencia(u);
            } else {
                request.setAttribute("msje", "No se obtuvo el id del usuario");
            }

        } catch (Exception e) {
            request.setAttribute("msje", e.getMessage());
        }
        this.listado(request, response);
    }
}

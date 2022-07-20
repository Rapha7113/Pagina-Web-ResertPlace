/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Cliente;
import Modelo.DAOcliente;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andre
 */
public class ServletCliente extends HttpServlet {
      DAOcliente dc = new DAOcliente();
      Cliente cl=new Cliente();
    
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
        if(op.equals("login")){
        String usu=request.getParameter("txtCorreo");
        String pas=request.getParameter("txtPass");        
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("Select * from cliente where E_mail=? and contraseña=?");
                psta.setString(1, usu);
                psta.setString(2, pas);
                ResultSet rs=psta.executeQuery();
                if (rs.next()){
                    HttpSession sesionOk=request.getSession();
                    sesionOk.setAttribute("codigo",rs.getInt(1));
                    sesionOk.setAttribute("usuario",rs.getString(2));
                    sesionOk.setAttribute("genero",rs.getString(3));
                    sesionOk.setAttribute("E_mail",rs.getString(4));
                    sesionOk.setAttribute("pass",rs.getString(5));
                    request.getRequestDispatcher("Principal.jsp").forward(request, response);
                }else{
                request.setAttribute("msj","Usuario Incorrecto");
                request.getRequestDispatcher("pag_login.jsp").forward(request, response);
                }
            } catch (Exception e) { System.out.println("Error"+e);}
            }else if(op.equals("cerrar")){
            HttpSession sesionOk=request.getSession();
            sesionOk.invalidate();
            request.getRequestDispatcher("index.jsp").forward(request, response);           
            }else if (op.equals("Insertar")) {
            String n = request.getParameter("txtnoap");
            String g = request.getParameter("RB1");
            String c = request.getParameter("txtcorreo");
            String pa = request.getParameter("txtpass");
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("insert into cliente(noap,genero,E_mail,contraseña) values(?,?,?,?)");
                sta.setString(1,n);
                sta.setString(2,g);
                sta.setString(3,c);
                sta.setString(4,pa);
                sta.executeUpdate();
                request.getRequestDispatcher("pag_login.jsp").forward(request, response);

            } catch (IOException | SQLException | ServletException e) {
                System.out.println("Error al insertar elemento");
            }
        }else if(op.equals("ListaClie")){
            try
            {
               PreparedStatement  sta=ConexionDB.getConexion().prepareStatement("SELECT * FROM cliente WHERE noap NOT LIKE 'Administrador'");
                ResultSet rs=sta.executeQuery();                
                ArrayList<Cliente> lista=new ArrayList<>();                
                while(rs.next())
                {
                 Cliente em=new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                 lista.add(em);
                }               
               request.setAttribute("Clie",lista);
               request.getRequestDispatcher("Lista_Usuarios.jsp").forward(request, response);              
            }
            catch(Exception e)
            {
                System.out.println("error"+e);
            }
        }else if(op.equals("CorreosCli")){
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("SELECT E_mail from cliente WHERE E_mail NOT LIKE 'admin@gmail.com'");
                ResultSet rs=psta.executeQuery();                
                ArrayList<Cliente> p=new ArrayList();               
                while(rs.next()){
            Cliente e=new Cliente(rs.getString(1));
            p.add(e);           }
                request.setAttribute("i",p);
                request.getRequestDispatcher("Notificacion.jsp").forward(request, response);
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
            int id = Integer.parseInt(request.getParameter("idUs"));
            String n = request.getParameter("txtU");
            String g = request.getParameter("txtG");
            String co = request.getParameter("txtC");
            String pass = request.getParameter("txtP");
           
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("update cliente set noap=?,genero=?,E_mail=?,contraseña=? where id_clie=?");
                sta.setString(1,n);
                sta.setString(2,g);
                sta.setString(3,co);
                sta.setString(4,pass);
                sta.setInt(5, id);
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
    } 
}

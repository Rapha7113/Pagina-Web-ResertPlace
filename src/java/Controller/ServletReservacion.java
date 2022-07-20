
package Controller;

import Modelo.Abogado;
import Modelo.Cliente;
import Modelo.Modalidad;
import Modelo.Reserva;
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
public class ServletReservacion extends HttpServlet {

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
        
       String op=request.getParameter("accion");
        if(op.equals("ListarReser")){
            try
            {
               PreparedStatement  sta=ConexionDB.getConexion().prepareStatement("SELECT c.id_cita,cl.noap,a.nomb_abog,m.tipo,c.r_fecha,r_hora,c.Estado FROM cita c\n" +
                                  "INNER         JOIN cliente cl ON cl.id_clie = c.id_clie\n" +
                                  "INNER         JOIN abogado a ON a.id_abog = c.id_abog\n" +
                                  "INNER         JOIN modalidad m ON m.id_mod = c.id_mod");
                ResultSet rs=sta.executeQuery();                
                ArrayList<Reserva> lista=new ArrayList<>();                
                while(rs.next())
                {
                 Reserva em=new Reserva(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
                 lista.add(em);
                }               
               request.setAttribute("Reser",lista);
               request.getRequestDispatcher("Lista_Reser.jsp").forward(request, response);              
            }
            catch(Exception e)
            {
                System.out.println("error"+e);
            }
        }else if (op.equals("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("idRe"));
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("delete from cita where id_cita=?");
                sta.setInt(1, id);
                sta.executeUpdate();
                request.getRequestDispatcher("ServletReservacion?accion=ListarReser").forward(request, response);
            } catch (IOException | SQLException | ServletException e) {
                 System.out.println("Error al eliminar elementos");
            }
        }else if(op.equals("consultaCita")){
            
            int id = Integer.parseInt(request.getParameter("idRU"));
            try {
                PreparedStatement psta=ConexionDB.getConexion()
                        .prepareStatement("SELECT c.id_cita,cl.noap,a.nomb_abog,m.tipo,c.r_fecha,r_hora,c.Estado FROM cita c\n" +
                         "INNER JOIN cliente cl ON cl.id_clie = c.id_clie\n" +
                         "INNER JOIN abogado a ON a.id_abog = c.id_abog\n" +
                         "INNER JOIN modalidad m ON m.id_mod = c.id_mod where c.id_clie=?");
                psta.setInt(1,id); 
                ResultSet rs=psta.executeQuery();
                ArrayList<Reserva> p=new ArrayList();               
            while(rs.next()){
            Reserva e=new Reserva(rs.getInt(1),rs.getString(2),rs.getString(3)
                    ,rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
            
            p.add(e); 
            }
                request.setAttribute("ci",p);
                request.getRequestDispatcher("Citas.jsp").forward(request, response);
                
            } catch (Exception e) {
            }
        }else if (op.equals("Insertar")) {                      
            int Cl = Integer.parseInt(request.getParameter("txtCli"));
            int Ab = Integer.parseInt(request.getParameter("txtAbog"));
            int Mo = Integer.parseInt(request.getParameter("cboMo"));
            String fe = request.getParameter("txtFecha");
            String ho = request.getParameter("txtHora");
            boolean es= Boolean.parseBoolean(request.getParameter("0"));                       
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("insert into cita (id_clie,id_abog,id_mod,r_fecha,r_hora,Estado) values(?,?,?,?,?,?)");
                sta.setInt(1,Cl);
                sta.setInt(2,Ab);
                sta.setInt(3,Mo);
                sta.setString(4,fe);
                sta.setString(5,ho);
                sta.setBoolean(6,es);
                sta.executeUpdate();
                request.getRequestDispatcher("Principal.jsp").forward(request, response);

            } catch (IOException | SQLException | ServletException e) {
                System.out.println("Error al insertar elemento");
            }
        }else if (op.equals("Registrar")) {                      
            int Cl = Integer.parseInt(request.getParameter("txtCli"));
            int Ab = Integer.parseInt(request.getParameter("cboAbog"));
            int Mo = Integer.parseInt(request.getParameter("cboMo"));
            String fe = request.getParameter("txtFecha");
            String ho = request.getParameter("txtHora");
            boolean es= Boolean.parseBoolean(request.getParameter("0"));                       
            try {
                PreparedStatement sta = ConexionDB.getConexion().prepareStatement("insert into cita (id_clie,id_abog,id_mod,r_fecha,r_hora,Estado) values(?,?,?,?,?,?)");
                sta.setInt(1,Cl);
                sta.setInt(2,Ab);
                sta.setInt(3,Mo);
                sta.setString(4,fe);
                sta.setString(5,ho);
                sta.setBoolean(6,es);
                sta.executeUpdate();
                request.getRequestDispatcher("Principal.jsp").forward(request, response);

            } catch (IOException | SQLException | ServletException e) {
                System.out.println("Error al insertar elemento");
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

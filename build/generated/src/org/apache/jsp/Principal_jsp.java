package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
  
    Integer cod=0;
    String usuario="";
    String correo="";
    String genero="";
    String password="";
    HttpSession sesionOk=request.getSession();
    if(sesionOk.getAttribute("usuario")==null){
    
      out.write("\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("pag_login.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("msg2", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Debe Loguarse para Ingresar", request.getCharacterEncoding()));
        return;
      }
      out.write("\n");
      out.write("    ");

        }else{
        cod=(Integer)sesionOk.getAttribute("codigo");
        usuario=(String)sesionOk.getAttribute("usuario");
        correo=(String)sesionOk.getAttribute("E_mail");
        genero=(String)sesionOk.getAttribute("genero");
        password=(String)sesionOk.getAttribute("pass");
    }
    
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Reserplace</title>\n");
      out.write(" \n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.12.0/css/jquery.dataTables.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/Principal.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://kit.fontawesome.com/9bdc09ed99.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("            <!-- Sidebar-->\n");
      out.write("            <div class=\"border-end bg-dark\" id=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"sidebar-heading border-bottom bg-light\"><img src=\"imagenes/logo2.png\"></div>\n");
      out.write("                <div class=\"list-group list-group-flush\">\n");
      out.write("                    ");
if(correo.equals("admin@gmail.com")) { 
      out.write("                                     \n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServAbog?acc=AbogLista\"><i class=\"fa-solid fa-list\"></i>&nbsp;Lista Abogado</a>                 \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("             <div class=\"accordion accordion-flush\" id=\"accordionFlushExample\">\n");
      out.write("            <div class=\"accordion-item\">\n");
      out.write("            <h2 class=\"accordion-header\" id=\"flush-headingOne \" >\n");
      out.write("              <button class=\"menu accordion-button collapsed fw-bold \" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseOne\" aria-expanded=\"false\" aria-controls=\"flush-collapseOne\">\n");
      out.write("             Citas Reserplace\n");
      out.write("              </button>\n");
      out.write("            </h2>\n");
      out.write("            <div id=\"flush-collapseOne\" class=\"accordion-collapse collapse list-group-item-light\" aria-labelledby=\"flush-headingOne\" data-bs-parent=\"#accordionFlushExample\">\n");
      out.write("                <div class=\"list-group\">\n");
      out.write("            <button type=\"button\" class=\"list-group-item list-group-item-action list-group-item-warning\"><i class=\"fa-solid fa-bell\"></i>&nbsp;<a href=\"ServControl?opera=listaP\" class=\"text-decoration-none text-dark\">Nueva Reservaciones</a></button>       \n");
      out.write("            <button type=\"button\" class=\"list-group-item list-group-item-action list-group-item-warning\"><i class=\"fa-regular fa-calendar\"></i>&nbsp;<a href=\"ServControl?opera=lista\" class=\"text-decoration-none text-dark\">Estado Reserva</a></button>\n");
      out.write("            <button type=\"button\" class=\"list-group-item list-group-item-action list-group-item-warning\"><i class=\"fa-regular fa-calendar-xmark\"></i>&nbsp;<a href=\"ServletReservacion?accion=ListarReser\" class=\"text-decoration-none text-dark\">Eliminar Reserva</a></button>\n");
      out.write("            </div> </div> </div> </div>\n");
      out.write("                \n");
      out.write("                <div class=\"list-group list-group-flush\">\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServletCliente?ope=ListaClie\"><i class=\"fa-solid fa-list-check\"></i> &nbsp;Lista Usuarios</a>                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"accordion-item\">\n");
      out.write("            <h2 class=\"accordion-header\" id=\"flush-headingTwo\">\n");
      out.write("              <button class=\"menu accordion-button collapsed fw-bold\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseTwo\" aria-expanded=\"false\" aria-controls=\"flush-collapseTwo\">\n");
      out.write("                Mantenimiento\n");
      out.write("              </button>\n");
      out.write("            </h2>\n");
      out.write("            <div id=\"flush-collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-headingTwo\" data-bs-parent=\"#accordionFlushExample\">\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                <button type=\"button\" class=\"list-group-item list-group-item-action list-group-item-warning\"><i class=\"fa-solid fa-gavel\"></i>&nbsp;<a href=\"ServletContAbo?opcion=ListarMA\" class=\"text-decoration-none text-dark\">Abogado</a></button>\n");
      out.write("                <button type=\"button\" class=\"list-group-item list-group-item-action list-group-item-warning\"><i class=\"fa-solid fa-magnifying-glass\"></i>&nbsp;<a href=\"ServletModalidad?ope=ListarMod\" class=\"text-decoration-none text-dark\">Modalidad</a></button>          \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>         \n");
      out.write("                <div class=\"list-group list-group-flush\">                 \n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServletCliente?ope=CorreosCli\"><i class=\"fa-regular fa-message\"></i>&nbsp; Enviar Notificacion</a>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
 if(!correo.equals("admin@gmail.com")){ 
      out.write("\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServLM?accion=LlenarMod\"><i class=\"fa-regular fa-clock\"></i>&nbsp;Reservar</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServletContAbo?opcion=nombres\"><i class=\"fa-solid fa-magnifying-glass\"></i>&nbsp;Filtro Abogado</a>                    \n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"ServletReservacion?accion=consultaCita&idRU=");
      out.print(cod);
      out.write("\"><i class=\"fa-solid fa-list\"></i>&nbsp;Mis Reservaciones</a> \n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"\"><i class=\"fa-solid fa-file\"></i>&nbsp;Expedientes</a> \n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page content wrapper-->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <!-- Top navigation-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-dark border-bottom\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <button class=\"btn btn-primary\" id=\"sidebarToggle\">Desplegar Menu</button>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav ms-auto mt-2 mt-lg-0\">\n");
      out.write("                                <li class=\"nav-item active\"><a class=\"nav-link text-info\" href=\"Principal.jsp\">Principal</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link text-light\" href=\"#!\">Ayuda</a></li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle text-warning\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Hola ,");
      out.print(usuario);
      out.write("</a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"Perfil_usuario.jsp\">Perfil</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"ServletCliente?ope=cerrar\">Cerrar Sesion</a>                                   \n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("               <main class=\"mt-2 pt-1\">\n");
      out.write("               <div class=\"container-fluid\">\n");
      out.write("                   <p class=\"h5 text-primary fw-bold\"> Inicio <i class=\"fa-solid fa-house\"></i></p> \n");
      out.write("                  <hr size=\"5px\" color=\"black\">     \n");
      out.write("              <div class=\"alert alert-danger text-dark\" role=\"alert\">\n");
      out.write("                  Bienvenido <i class=\"fw-bold text-primary\">");
      out.print(usuario);
      out.write("</i> ,a la aplicacion de Reserplace.\n");
      out.write("              </div>\n");
      out.write("              ");
if(correo.equals("admin@gmail.com")) { 
      out.write("\n");
      out.write("              <div class=\"row me-1\">\n");
      out.write("                  \n");
      out.write("                            ");

                             Connection c=null;
                             Statement sta=null;
                             ResultSet rs=null;
                             try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_clie)NumeroFilas FROM cliente");
                                 int L=0;
                                 while(rs.next()){
                                 L=rs.getInt("NumeroFilas");
                                 
      out.write("\n");
      out.write("        <div class=\"col-sm ms-2\">\n");
      out.write("        <div class=\"row bg-primary\">\n");
      out.write("        <div class=\"col-5 m-0 justify-content-center p-2\">\n");
      out.write("        <h1 class=\"text-center text-white h1\">");
      out.print(L);
      out.write("</h1> \n");
      out.write("        <p class=\"text-center text-white\">Usuarios</p>\n");
      out.write("        <div class=\"\">\n");
      out.write("        <div>                               \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("        <a href=\"#\" class=\"small-box-footer text-decoration-none text-white\">Más info</a>\n");
      out.write("        </div></div></div></div>\n");
      out.write("        <div class=\"col-3 m-0 justify-content-center p-2\">\n");
      out.write("        <img src=\"imagenes/usuario.png\">\n");
      out.write("        </div></div>\n");
      out.write("        </div> ");
}sta.close();rs.close();c.close();} catch (Exception e) {}
      out.write("\n");
      out.write("                             \n");
      out.write("  \n");
      out.write("                            ");

                             try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_cita)Num FROM cita where Estado =0");
                                 int numFilas=0;
                                 while(rs.next()){
                                 numFilas=rs.getInt("Num");
                                 
                                 
                                 
      out.write("\n");
      out.write("        <div class=\"col-sm ms-2\">\n");
      out.write("        <div class=\"row bg-danger\">\n");
      out.write("        <div class=\"col-5 m-0 justify-content-center p-2\">\n");
      out.write("        <p class=\"text-center text-white h1\">");
      out.print(numFilas);
      out.write("</p> \n");
      out.write("        <p class=\"text-center text-white\">Nueva cita</p>\n");
      out.write("        <div class=\"\">\n");
      out.write("        <div>                               \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("        <a href=\"ServControl?opera=listaP\" class=\"small-box-footer text-decoration-none text-light\">Más info</a>\n");
      out.write("        </div></div></div></div>\n");
      out.write("        <div class=\"col-3 m-0 justify-content-center p-2\">\n");
      out.write("        <img src=\"imagenes/nuevo.png\">\n");
      out.write("        </div></div>\n");
      out.write("        </div> ");
}sta.close();rs.close();c.close();} catch (Exception e) {}
      out.write("\n");
      out.write("         \n");
      out.write("        ");

                             try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_cita)NumeroFilas FROM cita");
                                 int cat=0;
                                 while(rs.next()){
                                 cat=rs.getInt("NumeroFilas");
                                 
                                 
                                 
      out.write("\n");
      out.write("        <div class=\"col-sm ms-2\">\n");
      out.write("        <div class=\"row bg-success\">\n");
      out.write("        <div class=\"col-5 m-0 justify-content-center p-2\">\n");
      out.write("        <h1 class=\"text-center text-white h1\">");
      out.print(cat);
      out.write("</h1> \n");
      out.write("        <p class=\"text-center text-white\">Reservaciones</p>\n");
      out.write("        <div class=\"\">\n");
      out.write("        <div>                               \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("        <a href=\"#\" class=\"small-box-footer text-decoration-none text-warning\">Más info</a>\n");
      out.write("        </div></div></div></div>\n");
      out.write("        <div class=\"col-3 m-0 justify-content-center p-2\">\n");
      out.write("        <img src=\"imagenes/reserva.png\">\n");
      out.write("        </div></div>\n");
      out.write("        </div> ");
}sta.close();rs.close();c.close();} catch (Exception e) {}
      out.write("\n");
      out.write("        \n");
      out.write("          ");
try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_abog)NumeroFilas FROM abogado");
                                 int numP=0;
                                 while(rs.next()){
                                 numP=rs.getInt("NumeroFilas");
                                 
                                 
                                 
      out.write("\n");
      out.write("        <div class=\"col-sm-3 ms-2\">\n");
      out.write("        <div class=\"row bg-info\">\n");
      out.write("        <div class=\"col-5 m-0 justify-content-center p-2\">\n");
      out.write("        <p class=\"text-center text-white h1\">");
      out.print(numP);
      out.write("</p> \n");
      out.write("        <p class=\"text-center text-white\">Abogado</p>\n");
      out.write("        <div class=\"\">\n");
      out.write("        <div>                               \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("        <a href=\"\" class=\"small-box-footer text-decoration-none text-white\">Más info</a>\n");
      out.write("        </div></div></div></div>\n");
      out.write("        <div class=\"col-3 m-0 justify-content-center p-2\">\n");
      out.write("            <img src=\"imagenes/abogado.png\">\n");
      out.write("        </div></div>\n");
      out.write("        </div> ");
}sta.close();rs.close();c.close();} catch (Exception e) {}
      out.write("\n");
      out.write("                   \n");
      out.write("        </div>  ");
 } 
      out.write("\n");
      out.write("                                    \n");
      out.write("               </div></main>\n");
      out.write("</div></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

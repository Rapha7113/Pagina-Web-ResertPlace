package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.12.0/css/jquery.dataTables.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.js\"></script>     \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/login_estilos.css\" rel=\"stylesheet\" type=\"\"/>      \n");
      out.write("        <title>Registrar Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fond\">\n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 offset-md-3\">\n");
      out.write("            <div class=\"signup-form\">\n");
      out.write("                <form action=\"ServletCliente?accion=GuardarCli\" class=\"mt-5 border p-4 bg-light shadow\">\n");
      out.write("                    <div class=\"w-100\">\n");
      out.write("                        <img src=\"imagenes/logo2.png\" class=\"img-fluid\">\n");
      out.write("                    </div>                  \n");
      out.write("                    <h4 class=\"mb-4 fw-bold text-center ct h3\">Registrarte</h4>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"mb-3 col-md-6\">\n");
      out.write("                            <label class=\"fw-bold\" >Nombre y Apellido<span class=\"text-danger\">*</span></label>\n");
      out.write("                            <input  type=\"text\" name=\"txtnoap\" class=\"form-control border border-primary\" placeholder=\"Ingrese nombre y apellido\">\n");
      out.write("                        </div>                                             \n");
      out.write("                        <div class=\"mb-3 col-md-6\">\n");
      out.write("                        <label class=\"fw-bold\">Genero</label>\n");
      out.write("                        <div class=\"radio col-sm-10\">\n");
      out.write("                            <label class=\"radio-inline\"><input name=\"RB1\" type=\"radio\" value=\"M\"> Masculino</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <label class=\"radio-inline\"><input name=\"RB1\" type=\"radio\" value=\"F\"> Femenino </label>\n");
      out.write("                        </div>\n");
      out.write("                       </div>  \n");
      out.write("                 \n");
      out.write("                        <div class=\"mb-3 col-md-12\">\n");
      out.write("                            <label class=\"fw-bold\">Correo Electronico<span class=\"text-danger\">*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"txtcorreo\" class=\"form-control border border-primary\" placeholder=\"Ingrese correo Electronico\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3 col-md-6\">\n");
      out.write("                            <label class=\"fw-bold\">Contraseña<span class=\"text-danger\">*</span></label>\n");
      out.write("                            <input type=\"password\" name=\"txtpass\" class=\"form-control border border-primary\" placeholder=\"Ingrese contraseña\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3 col-md-6\">\n");
      out.write("                            <label  class=\"fw-bold\" >Verificar contraseña<span class=\"text-danger\">*</span></label>\n");
      out.write("                            <input type=\"password\" name=\"\" class=\"form-control border border-primary\" placeholder=\"Repetir contraseña\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"col-md-6 mb-3\">\n");
      out.write("                         <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                         <label class=\"form-check-label\" for=\"exampleCheck1\">Acepto terminos y condiciones</label>\n");
      out.write("                         </div>\n");
      out.write("                         <div>\n");
      out.write("                             <button type=\"submit\" class=\"btn btn-primary w-100\" >Registrarte</button>  \n");
      out.write("                                 \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    <input type=\"hidden\" name=\"accion\" value=\"GuardarCli\" >\n");
      out.write("                </form>\n");
      out.write("                <p class=\"text-center mt-3 text-light\">Si tiene una cuenta, <a href=\"#\" class=\"text-info text-decoration-none\">Iniciar sesión</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

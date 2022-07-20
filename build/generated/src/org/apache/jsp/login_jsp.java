package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">       \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos_login.css\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <style>\n");
      out.write("            .bg{\n");
      out.write("             background-image: url(imagenes/consultorio.jpg);\n");
      out.write("             background-position: center center;       \n");
      out.write("             }\n");
      out.write("             \n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container w-75 bg-primary mt-5\">\n");
      out.write("            <div class=\"row align-items-stretch\">\n");
      out.write("            <div class=\"col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6\" > </div>  \n");
      out.write("            <div class=\"col bg-white p-5\">\n");
      out.write("                <div class=\"text-end\"> \n");
      out.write("                    <img src=\"img/logo.png\" width=\"48\" alt=\"\"></div>    \n");
      out.write("                <h2 class=\"fw-bold text-center py-5\">Bienbenido </h2>\n");
      out.write("                \n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"mb-4\">\n");
      out.write("                    <label for=\"email\" class=\"form-label\">Usuario</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name=\"email\">\n");
      out.write("                    </div>    \n");
      out.write("                    <div class=\"mb-4\">\n");
      out.write("                    <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"email\">\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"mb-4\">\n");
      out.write("                        <input type=\"checkbox\" name=\"connected\" class=\"form-check-input\">\n");
      out.write("                        <label for=\"connected\" class=\"form-check-label\"> Mantenerme Conectado</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-grid\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\"> Iniciar Sesion  </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"my-3\"> \n");
      out.write("                        <span>No tienes cuenta? <a href=\"#\">Registrate</a></span>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div class=\"container w-100 my-5\">\n");
      out.write("                    <div class=\"row text-center\">\n");
      out.write("                        <div class=\"col-12\">Iniciar Sesion</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"> \n");
      out.write("                            <button class=\"btn btn-outline-primary w-100 my-1\">\n");
      out.write("                                <div class=\"row align-items-center\">\n");
      out.write("                                    <div class=\"col-2 d-none d-md-block\"> \n");
      out.write("                                        <img src=\"imagenes/Facebook.png\" width=\"32\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                                    <div class=\"col-12 col-md-10 text-center\"> \n");
      out.write("                                        Facebook</div>\n");
      out.write("                                </div>\n");
      out.write("                            </button>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <button class=\"btn btn-outline-danger w-100 my-1\">\n");
      out.write("                                <div class=\"row align-items-center\">\n");
      out.write("                                    <div class=\"col-2 d-none d-md-block \"> \n");
      out.write("                                        <img src=\"imagenes/google.png\" width=\"32\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                                    <div class=\"col-12 col-md-10 text-center\"> \n");
      out.write("                                        Google</div>\n");
      out.write("                                </div>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("    </body>\n");
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

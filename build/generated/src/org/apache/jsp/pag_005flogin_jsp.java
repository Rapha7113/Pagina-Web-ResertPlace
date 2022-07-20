package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pag_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">       \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login_estilos.css\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head> \n");
      out.write("    <body > \n");
      out.write("        <section>\n");
      out.write("            <div class=\"row g-0\">\n");
      out.write("                <div class=\"col-lg-7 d-none d-lg-block\">\n");
      out.write("                    <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item img-1 min-vh-100 active\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5 class=\"fw-bold\">Reserplace</h5>\n");
      out.write("        <p>Excelente Staff de Abogados</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item img-2 min-vh-100\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5 class=\"fw-bold\">Consultoria Juridica</h5>\n");
      out.write("        <p>Nos especializamos en Derecho civil,penal entre otros.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 d-flex flex-column align-items-end min-vh-100\">\n");
      out.write("                    <div class=\"px-lg-5 pt-lg-4 pb-lg-3 p-2 w-100\">\n");
      out.write("                    <img src=\"imagenes/logo1.png\" class=\"img-fluid \">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"px-lg-5 py-lg-4 p-3 w-100 align-self-center\">\n");
      out.write("                        <h1 class=\"fw-bold mb-3\">Bienvenido</h1> \n");
      out.write("                        <form action=\"ServletCliente\" class=\"mb-3\">\n");
      out.write("                         <div class=\"mb-3\">\n");
      out.write("                         <label for=\"exampleInputEmail1\" class=\"form-label fw-bold\">Correo Electronico </label>\n");
      out.write("                         <input type=\"email\" name=\"txtCorreo\" class=\"form-control\" placeholder=\"Ingrese su Correo Electronico\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required=\"\">\n");
      out.write("                         \n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"mb-3\">\n");
      out.write("                         <label for=\"exampleInputPassword1\" class=\"form-label fw-bold\">Contraseña</label>\n");
      out.write("                         <input type=\"password\" name=\"txtPass\" class=\"form-control border-1\" placeholder=\"Ingrese su contraseña\" id=\"exampleInputPassword1\" required=\"\">\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"mb-3 form-check\">\n");
      out.write("                         <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">                             \n");
      out.write("                         <label class=\"form-check-label\" for=\"exampleCheck1\">Mantenerme conectado</label>\n");
      out.write("                         </div>\n");
      out.write("                         <button type=\"submit\" class=\"btn btn-primary w-100\">Iniciar sesión</button>\n");
      out.write("                         <input type=\"hidden\" name=\"ope\" value=\"login\">\n");
      out.write("                         <div class=\"mb-2\"> \n");
      out.write("                             <span>¿Todavia no tienes una cuenta? <a href=\"registrar.jsp\" class=\"fw-bold text-decoration-none\">Registrate</a></span>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                        <h6>");
if(request.getAttribute("msj")!=null){
                        String msg=request.getAttribute("msj").toString();
      out.write("\n");
      out.write("                       <div class=\"alert alert-danger fw-bold text-center\"  role=\"alert\">");
      out.print(msg);
      out.write("</div>");
 }  
      out.write("</h6>\n");
      out.write("                       <h6>");
if(request.getParameter("msg2")!=null){
                       String msg2=request.getParameter("msg2").toString();
      out.write("\n");
      out.write("                       <div class=\"alert alert-danger fw-bold text-center\"  role=\"alert\">");
      out.print(msg2);
      out.write("</div>");
 } 
      out.write("</h6>\n");
      out.write("                        \n");
      out.write("                        <p class=\"fw-bold text-center\">o iniciar sesión con</p>\n");
      out.write("                        <div class=\"row\">\n");
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
      out.write("                        \n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </section>\n");
      out.write("        \n");
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

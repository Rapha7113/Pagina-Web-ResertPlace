package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexFar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Simple Sidebar - Start Bootstrap Template</title>\n");
      out.write(" \n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("\n");
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
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("            <!-- Sidebar-->\n");
      out.write("            <div class=\"border-end bg-primary\" id=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"sidebar-heading border-bottom bg-light\"><img src=\"img/logo_farm2.png\"></div>\n");
      out.write("                <div class=\"list-group list-group-flush\">\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"srvProducto?aci=ListaPro\">Lista Producto</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"#!\">Lista por Categoria</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"srvLaborat?ac=ListaLab\">Lista de Laboratorios</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"#!\">Stock de Productos</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"#!\">Ventas</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action list-group-item-primary p-3\" href=\"#!\">Reportes</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page content wrapper-->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <!-- Top navigation-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light border-bottom\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <button class=\"btn btn-primary\" id=\"sidebarToggle\">Toggle Menu</button>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav ms-auto mt-2 mt-lg-0\">\n");
      out.write("                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"#!\">Home</a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Link</a></li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown</a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#!\">Action</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#!\">Another action</a>\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#!\">Something else here</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <main class=\"mt-4 pt-3\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 mt-2 text-center text-dark fw-bold h4\">\n");
      out.write("                <i>SISTEMA DE CONTROL DE INVENTARIO</i>  </div>\n");
      out.write("            </div>\n");
      out.write("           &nbsp; \n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"trec col-md-3 mb-3\">\n");
      out.write("                  <div class=\"card bg-danger text-white h-100\">\n");
      out.write("                    <div class=\"card-body py-3\">Stock</div>\n");
      out.write("                    <div class=\"card-footer d-flex\">\n");
      out.write("                      Ver detalles\n");
      out.write("                      <span class=\"ms-auto\">\n");
      out.write("                        <i class=\"bi bi-chevron-right\"></i>\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"trec col-md-3 mb-3\">\n");
      out.write("                  <div class=\"card bg-warning text-dark h-100\">\n");
      out.write("                    <div class=\"card-body py-3\">VENTAS</div>\n");
      out.write("                    <div class=\"card-footer d-flex\">\n");
      out.write("                      Ver detalles \n");
      out.write("                      <span class=\"ms-auto\">\n");
      out.write("                        <i class=\"bi bi-chevron-right\"></i>\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"trec col-md-3 mb-3\">\n");
      out.write("                  <div class=\"card bg-success text-white h-100\">\n");
      out.write("                    <div class=\"card-body py-3\">MARCAS DE PRODUCTOS</div>\n");
      out.write("                    <div class=\"card-footer d-flex\">\n");
      out.write("                      Ver detalles\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </div>    \n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("            </div>\n");
      out.write("                </main>    \n");
      out.write("        </div>\n");
      out.write("</div>\n");
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

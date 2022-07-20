<%-- 
    Document   : perfilAbo
    Created on : 25/05/2022, 12:54:14 PM
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*"%>
<%@page import="java.util.*"%>
<%@page session="true"%>
<!DOCTYPE html>
    <%
    Abogado x=DaoAbogado.Datos(Integer.parseInt(request.getParameter("id")));
    %>

<%
    Integer cod=0;
    String usuario="";
    String correo="";
    String genero="";
    String password="";
    HttpSession sesionOk=request.getSession();
    if(sesionOk.getAttribute("usuario")==null){
    %>
    <jsp:forward page="pag_login.jsp">
        <jsp:param name="msg2" value="Debe Loguarse para Ingresar"/>
    </jsp:forward>
    <%
        }else{
        cod=(Integer)sesionOk.getAttribute("codigo");
        usuario=(String)sesionOk.getAttribute("usuario");
        correo=(String)sesionOk.getAttribute("E_mail");
        genero=(String)sesionOk.getAttribute("genero");
        password=(String)sesionOk.getAttribute("pass");
    }
    %>
<html lang="en">
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Reserplace</title>
 
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.0/css/jquery.dataTables.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.js"></script>
        <link href="https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap" rel="stylesheet">
        <link href="css/Principal.css" rel="stylesheet" />
        <script src="https://kit.fontawesome.com/9bdc09ed99.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </head>
    <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-dark" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light"><img src="imagenes/logo2.png"></div>
                <div class="list-group list-group-flush">
                    <%if(correo.equals("admin@gmail.com")) { %>                                     
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServAbog?acc=AbogLista"><i class="fa-solid fa-list"></i>&nbsp;Lista Abogado</a>                 
                </div>
                
             <div class="accordion accordion-flush" id="accordionFlushExample">
            <div class="accordion-item">
            <h2 class="accordion-header" id="flush-headingOne " >
              <button class="menu accordion-button collapsed fw-bold " type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
             Citas Reserplace
              </button>
            </h2>
            <div id="flush-collapseOne" class="accordion-collapse collapse list-group-item-light" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                <div class="list-group">
            <button type="button" class="list-group-item list-group-item-action list-group-item-warning"><i class="fa-solid fa-bell"></i>&nbsp;<a href="ServControl?opera=listaP" class="text-decoration-none text-dark">Nueva Reservaciones</a></button>         
                    <button type="button" class="list-group-item list-group-item-action list-group-item-warning"><i class="fa-regular fa-calendar"></i>&nbsp;<a href="ServControl?opera=lista" class="text-decoration-none text-dark">Estado Reserva</a></button>
            <button type="button" class="list-group-item list-group-item-action list-group-item-warning"><i class="fa-regular fa-calendar-xmark"></i>&nbsp;<a href="ServletReservacion?accion=ListarReser" class="text-decoration-none text-dark">Eliminar Reserva</a></button>
            </div> </div> </div> </div>
                
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServletCliente?ope=ListaClie"><i class="fa-solid fa-list-check"></i> &nbsp;Lista Usuarios</a>                    
                </div>
                
            <div class="accordion-item">
            <h2 class="accordion-header" id="flush-headingTwo">
              <button class="menu accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                Mantenimiento
              </button>
            </h2>
            <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
            <div class="list-group">
                <button type="button" class="list-group-item list-group-item-action list-group-item-warning"><i class="fa-solid fa-gavel"></i>&nbsp;<a href="ServletContAbo?opcion=ListarMA" class="text-decoration-none text-dark">Abogado</a></button>
                <button type="button" class="list-group-item list-group-item-action list-group-item-warning"><i class="fa-solid fa-magnifying-glass"></i>&nbsp;<a href="ServletModalidad?ope=ListarMod" class="text-decoration-none text-dark">Modalidad</a></button>          
            </div>
            </div>
          </div>         
                <div class="list-group list-group-flush">                 
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="Notificacion.jsp"><i class="fa-regular fa-message"></i>&nbsp; Enviar Notificacion</a>
                    <% } %>
                    <% if(!correo.equals("admin@gmail.com")){ %>
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServLM?accion=LlenarMod"><i class="fa-regular fa-clock"></i>&nbsp;Reservar</a>
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServletContAbo?opcion=nombres"><i class="fa-solid fa-magnifying-glass"></i>&nbsp;Filtro Abogado</a>                    
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServletReservacion?accion=consultaCita&idRU=<%=cod%>"><i class="fa-solid fa-list"></i>&nbsp;Mis Reservaciones</a> 
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href=""><i class="fa-solid fa-file"></i>&nbsp;Expedientes</a> 
                    <% } %>
                </div>
            </div>
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
            <nav class="navbar navbar-expand-lg navbar-light bg-dark border-bottom">
                    <div class="container-fluid">
                        <button class="btn btn-primary" id="sidebarToggle">Desplegar Menu</button>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                                <li class="nav-item active"><a class="nav-link text-info" href="Principal.jsp">Principal</a></li>
                                <li class="nav-item"><a class="nav-link text-light" href="#!">Link</a></li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle text-warning" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Hola,<%=usuario%></a>
                                    <div class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="Perfil_usuario.jsp">Perfil</a>
                                        <a class="dropdown-item" href="ServletCliente?ope=cerrar">Cerrar Sesion</a>                                   
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <main class="mt-2 pt-1">
          <div class="container-fluid">
            <div class="row">
              <div class="col-md-12 mt-1 text-center text-success fw-bold h4">
                  <i>Perfil Abogado</i><i class="text-warning">&nbsp;Reserplace&nbsp;<i class="fa-solid fa-gavel text-warning"></i></i> <hr size="5px" color="black">  </div>
                 
            </div>
             
                <div class="row">
                            <div class="col-sm-3">
                                <div class="card">                                   
                                <div class="card-body border border-success">
         <form method= action=""> 
        <table border="0" width="720" align="center">
                <tr>
                    <th rowspan="8"><img src="imagenes/abogados/<%=x.getFoto()%>" width=210 height="190"></th>
                    <th><i class="fa-solid fa-user text-secondary"></i> Nombre y Apellido :</th>
                    <th> <input type="text" name="" value="<%=x.getNomA()%>" readonly="" class="border-0"></th>
                </tr><tr><th><i class="fa-solid fa-layer-group text-secondary"></i> Especialidad :</th>
                     <th><input type="text" name="" value="<%=x.getEsp()%>" readonly="" class="border-0"></th>
                </tr><tr><th><i class="fa-solid fa-clock text-secondary"></i> Años experiencia :</th>
                    <th><input type="text" name="" value="<%=x.getExp()%> años" readonly="" class="border-0"></th>
                </tr><tr><th><i class="fa-solid fa-graduation-cap text-secondary"></i> Grado Academico :</th>
                     <th><input type="text" name="" value="<%=x.getGrado()%>" readonly="" class="border-0"></th>
                </tr><tr><th><i class="fa-solid fa-mobile-button text-secondary"></i> Telefono :</th>
                     <th><input type="text" name="" value="<%=x.getTelf()%>" readonly="" class="border-0"></th>
                </tr><tr><th><i class="fa-solid fa-envelope text-secondary"></i> Correo :</th>
                     <th><input type="text" name="" value="<%=x.getCorreo()%>" readonly="" class="border-0"></th>
                </tr>
                <tr><th><i class="fa-solid fa-paper-plane text-secondary"></i> Curriculum Vitae :</th>
                    <td><a href="" class="text-decoration-none">Descargar CV</a></td>
                </tr>
                <tr><th><i class="fa-brands fa-linkedin text-secondary"></i> Linkedin :</th>
                    <td><a href="" class="text-decoration-none">linkedin.com/<%=x.getNomA()%></a></td>
                </tr>              
        </table> 
                          
                <div class="text-center" >
                <div><a href="ServLM?accion=LlenarM&cod=<%=x.getCod()%>" class="btn btn-primary btn-sm active" role="button">Realizar Reservacion</a>
                </div>
                                    </div>
                
            </form>       
                                    </div>
                                    
                                </div>
                            </div>                                      
                          
            </div></div>
                </main>
                                    
        </div>
</div>
              
    </body>
</html>
    
    

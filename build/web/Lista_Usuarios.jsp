<%@page import="Modelo.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Abogado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page session="true"%>
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
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.0/css/jquery.dataTables.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.js"></script>
        <link href="css/Principal.css" rel="stylesheet" />
        <script src="js/scripts.js"></script>
        <script src="https://kit.fontawesome.com/9bdc09ed99.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">  
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css"/> 
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/2.2.3/css/buttons.dataTables.min.css"/>
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
                                <li class="nav-item"><a class="nav-link text-light" href="#!">Ayuda</a></li>
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

          <main class="mt-1 pt-2" >    
          <div class="container-fluid ">               
                <div class="col-md-12 mt-1 text-center text-success ">
                <i class="text-center text-danger fw-bold h4">Listado Clientes</i>
                <hr size="5px" color="black">                     
               <seccion>
               <div class="container-fluid">
                <div class="col-lg-12">
                    <div class="table-responsive">
                    <table class="table table-striped table-bordered wd-100" id="datatable" class="display">
                                    <thead >
                                        <tr class="text-light bg-success">
                                            <th class="text-center">Codigo Cliente</th>
                                            <th class="text-center">Nombre Apellido Cliente</th>
                                            <th class="text-center">Genero</th>
                                            <th class="text-center">E-Mail</th>
                                        </tr>
                                    </thead>                                                  
                                         <%
                        ArrayList<Cliente> lista=(ArrayList<Cliente>)request.getAttribute("Clie");
                        for(int i=0; i<lista.size();i++)
                        {
                            Cliente em=lista.get(i);    
                       %>
                        <tr>
                            <td><%=em.getCodCli()%></td>
                            <td><%=em.getNomap()%></td>
                           <td><%=em.getSexo()%></td>                          
                            <td><%=em.getCorreo()%></td> 
                            
                        </tr>
                        <%
                        }
                        %>                                                                                             
                                </table>
                        
                    </div>
                </div>
               </div></seccion>   
        </div> 
                    
          </div> 
</main>
                                    
        </div>
</div>
<script type="text/javascript" src="js/DTable.js"></script>
<script type="text/javascript" src="jcs/registrar.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.print.min.js"></script>                           
    </body>
</html>


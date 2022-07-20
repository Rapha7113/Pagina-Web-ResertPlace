<%@page import="Modelo.DaoAbogado"%>
<%@page import="Modelo.Abogado"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>

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
        <script src="js/scripts.js"></script>
        <script src="https://kit.fontawesome.com/9bdc09ed99.js" crossorigin="anonymous"></script>
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

                <main class="mt-1 pt-2">
          <div class="container-fluid">           
              <div class="col-md-5">
              <form action="ServletContAbo" class="row g-3 needs-validation" novalidate>
             <table class="table">
            <tr>
                <td><label for="validationCustom04" class="form-label fw-bold text-primary mt-2">Abogados: </label></td>
                <td> <select name="selectAbo" class="form-select border border-success" id="validationCustom04" required>
                        <option selected disabled value="">-Seleccione Especialidad-</option>
                 <%
                ArrayList<Abogado> list=(ArrayList<Abogado>)request.getAttribute("a");
                for(int i=0;i<list.size();i++){
                    Abogado e=list.get(i);
                %>                          
                <option value="<%=e.getEsp()%>"><%=e.getEsp()%></option>
                <%}%> </select>
                </td>
                 <td><input type="submit" name="btn" value="Consultar" class=" btn btn-danger"></td>
            </tr>
            </table>
            <input type="hidden" name="opcion" value="consultaAbo">  
        </form>
        </div>
        </div>
        </main> 
                <seccion>
                    <div class="container-fluid mt-2">
                        <div class="row">
                             <%
                                      ArrayList<Abogado> lis=DaoAbogado.obtenerA();
                                      int salto=0;
                                      for (Abogado p:lis){
                                      %>
                            <div class="col-sm-3">
                                <div class="card mb-3 border border-2">                                   
                                    <div class="card-body border border-light">
                                                                              <img src="imagenes/abogados/<%=p.getFoto()%>" width="180" height="150" class="d-block mx-auto">
                                    </div>
                                    <div class="card-footer text-center list-group-item-warning" >
                                        <label class="fw-bold text-dark"><%=p.getNomA()%> </label><br>
                                        <label class=""><%=p.getEsp()%> </label>
                                         <div>
                                             <a href="perfilAbo.jsp?id=<%=p.getCod()%>" class="btn btn-outline-danger"> Ver Perfil</a>
                                             <a href="ServLM?accion=LlenarM&cod=<%=p.getCod()%>" class="btn btn-outline-primary" >Asesoria</a>
                                         </div>
                                    </div>
                                </div>
                            </div>
                                                   <%
             salto++;
                     if(salto==3){
             
             %>
             <tr>
                 <%
                     salto=0;
                     
                 }}%>               
                        </div> 

                    </div>
                </seccion>      
                
                
   </div>    
        </div>    
     <script type="text/javascript" src="js/List_Abogado.js"></script>
    </body>
    
</html>

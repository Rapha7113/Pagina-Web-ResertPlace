<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
                    <a class="list-group-item list-group-item-action list-group-item-primary p-3" href="ServletCliente?ope=CorreosCli"><i class="fa-regular fa-message"></i>&nbsp; Enviar Notificacion</a>
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
                                    <a class="nav-link dropdown-toggle text-warning" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Hola ,<%=usuario%></a>
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
                   <p class="h5 text-primary fw-bold"> Inicio <i class="fa-solid fa-house"></i></p> 
                  <hr size="5px" color="black">     
              <div class="alert alert-danger text-dark" role="alert">
                  Bienvenido <i class="fw-bold text-primary"><%=usuario%></i> ,a la aplicacion de Reserplace.
              </div>
              <%if(correo.equals("admin@gmail.com")) { %>
              <div class="row me-1">
                  
                            <%
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
                                 %>
        <div class="col-sm ms-2">
        <div class="row bg-primary">
        <div class="col-5 m-0 justify-content-center p-2">
        <h1 class="text-center text-white h1"><%=L%></h1> 
        <p class="text-center text-white">Usuarios</p>
        <div class="">
        <div>                               
        <div class="text-center">
        <a href="#" class="small-box-footer text-decoration-none text-white">Más info</a>
        </div></div></div></div>
        <div class="col-3 m-0 justify-content-center p-2">
        <img src="imagenes/usuario.png">
        </div></div>
        </div> <%}sta.close();rs.close();c.close();} catch (Exception e) {}%>
                             
  
                            <%
                             try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_cita)Num FROM cita where Estado =0");
                                 int numFilas=0;
                                 while(rs.next()){
                                 numFilas=rs.getInt("Num");
                                 
                                 
                                 %>
        <div class="col-sm ms-2">
        <div class="row bg-danger">
        <div class="col-5 m-0 justify-content-center p-2">
        <p class="text-center text-white h1"><%=numFilas%></p> 
        <p class="text-center text-white">Nueva cita</p>
        <div class="">
        <div>                               
        <div class="text-center">
        <a href="ServControl?opera=listaP" class="small-box-footer text-decoration-none text-light">Más info</a>
        </div></div></div></div>
        <div class="col-3 m-0 justify-content-center p-2">
        <img src="imagenes/nuevo.png">
        </div></div>
        </div> <%}sta.close();rs.close();c.close();} catch (Exception e) {}%>
         
        <%
                             try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_cita)NumeroFilas FROM cita");
                                 int cat=0;
                                 while(rs.next()){
                                 cat=rs.getInt("NumeroFilas");
                                 
                                 
                                 %>
        <div class="col-sm ms-2">
        <div class="row bg-success">
        <div class="col-5 m-0 justify-content-center p-2">
        <h1 class="text-center text-white h1"><%=cat%></h1> 
        <p class="text-center text-white">Reservaciones</p>
        <div class="">
        <div>                               
        <div class="text-center">
        <a href="#" class="small-box-footer text-decoration-none text-warning">Más info</a>
        </div></div></div></div>
        <div class="col-3 m-0 justify-content-center p-2">
        <img src="imagenes/reserva.png">
        </div></div>
        </div> <%}sta.close();rs.close();c.close();} catch (Exception e) {}%>
        
          <%try {
                                 Class.forName("com.mysql.jdbc.Driver");
                                 c=DriverManager.getConnection("jdbc:mysql://localhost/reserplace?user=root&password=");
                                 sta=c.createStatement();
                                 rs=sta.executeQuery("SELECT COUNT(id_abog)NumeroFilas FROM abogado");
                                 int numP=0;
                                 while(rs.next()){
                                 numP=rs.getInt("NumeroFilas");
                                 
                                 
                                 %>
        <div class="col-sm-3 ms-2">
        <div class="row bg-info">
        <div class="col-5 m-0 justify-content-center p-2">
        <p class="text-center text-white h1"><%=numP%></p> 
        <p class="text-center text-white">Abogado</p>
        <div class="">
        <div>                               
        <div class="text-center">
        <a href="" class="small-box-footer text-decoration-none text-white">Más info</a>
        </div></div></div></div>
        <div class="col-3 m-0 justify-content-center p-2">
            <img src="imagenes/abogado.png">
        </div></div>
        </div> <%}sta.close();rs.close();c.close();} catch (Exception e) {}%>
                   
        </div>  <% } %>
                                    
               </div></main>
</div></div>
    </body>
</html>


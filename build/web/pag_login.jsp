
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">       
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/login_estilos.css">
        <title>Login</title>
    </head> 
    <body > 
        <section>
            <div class="row g-0">
                <div class="col-lg-7 d-none d-lg-block">
                    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item img-1 min-vh-100 active">
      <div class="carousel-caption d-none d-md-block">
        <h5 class="fw-bold">Reserplace</h5>
        <p>Excelente Staff de Abogados</p>
      </div>
    </div>
    <div class="carousel-item img-2 min-vh-100">
      <div class="carousel-caption d-none d-md-block">
        <h5 class="fw-bold">Consultoria Juridica</h5>
        <p>Nos especializamos en Derecho civil,penal entre otros.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>                    
                </div>
                <div class="col-lg-5 d-flex flex-column align-items-end min-vh-100">
                    <div class="px-lg-5 pt-lg-4 pb-lg-3 p-2 w-100">
                    <img src="imagenes/logo1.png" class="img-fluid ">
                    </div>
                    <div class="px-lg-5 py-lg-4 p-3 w-100 align-self-center">
                        <h1 class="fw-bold mb-3">Bienvenido</h1> 
                        <form action="ServletCliente" class="mb-3">
                         <div class="mb-3">
                         <label for="exampleInputEmail1" class="form-label fw-bold">Correo Electronico </label>
                         <input type="email" name="txtCorreo" class="form-control" placeholder="Ingrese su Correo Electronico" id="exampleInputEmail1" aria-describedby="emailHelp" required="">
                         
                         </div>
                         <div class="mb-3">
                         <label for="exampleInputPassword1" class="form-label fw-bold">Contraseña</label>
                         <input type="password" name="txtPass" class="form-control border-1" placeholder="Ingrese su contraseña" id="exampleInputPassword1" required="">
                         </div>
                         <div class="mb-3 form-check">
                         <input type="checkbox" class="form-check-input" id="exampleCheck1">                             
                         <label class="form-check-label" for="exampleCheck1">Mantenerme conectado</label>
                         </div>
                         <button type="submit" class="btn btn-primary w-100">Iniciar sesión</button>
                         <input type="hidden" name="ope" value="login">
                         <div class="mb-2"> 
                             <span>¿Todavia no tienes una cuenta? <a href="registrar.jsp" class="fw-bold text-decoration-none">Registrate</a></span>
                        </div>
                        </form>
                        <h6><%if(request.getAttribute("msj")!=null){
                        String msg=request.getAttribute("msj").toString();%>
                       <div class="alert alert-danger fw-bold text-center"  role="alert"><%=msg%></div><% }  %></h6>
                       <h6><%if(request.getParameter("msg2")!=null){
                       String msg2=request.getParameter("msg2").toString();%>
                       <div class="alert alert-danger fw-bold text-center"  role="alert"><%=msg2%></div><% } %></h6>
                        
                        <p class="fw-bold text-center">o iniciar sesión con</p>
                        <div class="row">
                        <div class="col"> 
                            <button class="btn btn-outline-primary w-100 my-1">
                                <div class="row align-items-center">
                                    <div class="col-2 d-none d-md-block"> 
                                        <img src="imagenes/Facebook.png" width="32" alt="">
                                    </div>
                                
                                    <div class="col-12 col-md-10 text-center"> 
                                        Facebook</div>
                                </div>
                            </button>
                            </div>
                        <div class="col">
                            <button class="btn btn-outline-danger w-100 my-1">
                                <div class="row align-items-center">
                                    <div class="col-2 d-none d-md-block "> 
                                        <img src="imagenes/google.png" width="32" alt="">
                                    </div>
                                
                                    <div class="col-12 col-md-10 text-center"> 
                                        Google</div>
                                </div>
                            </button>
                        </div>
                        </div>
                        
                         
                    </div>
                </div>
            </div> 
        </section>
        
    </body>
</html>

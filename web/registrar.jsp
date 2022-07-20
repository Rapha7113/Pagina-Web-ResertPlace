
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.0/css/jquery.dataTables.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/bs5/dt-1.12.1/datatables.min.js"></script>     
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=League+Spartan:wght@300;600&display=swap" rel="stylesheet">
        <link href="css/login_estilos.css" rel="stylesheet" type=""/>      
        <title>Registrar Usuario</title>
    </head>
    <body class="fond">
       <div class="container-fluid">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div class="signup-form">
                <form action="ServletCliente" class="mt-5 border p-4 bg-light shadow needs-validation" >   
                    <div class="w-100">
                        <img src="imagenes/logo2.png" class="img-fluid">
                    </div>                  
                    <h4 class="mb-4 fw-bold text-center ct h3">Registrarte</h4>
                    <div class="row">                                        
                        <div class="mb-2 col-md-6">
                          <label for="validationCustom01" class="form-label fw-bold">Nombre y Apellido</label>
                          <input type="text" name="txtnoap" class="form-control" id="validationCustom01" placeholder="Ingrese Nombre y Apellido" required="">
                          <div class="valid-feedback fw-bold">Completo!</div>
                          </div>                       
                        <div class="mb-2 col-md-6">
                        <label class="fw-bold">Genero</label>   
                        <div class="form-check col-sm-10">
                        <input type="radio" name="RB1" class="form-check-input" id="validationFormCheck2" required value="M">
                        <label class="form-check-label" for="validationFormCheck2">Masculino</label>
                        </div>
                        <div class="form-check mb-3 col-sm-10">
                        <input type="radio" name="RB1" class="form-check-input" id="validationFormCheck3" required value="F">
                        <label class="form-check-label" for="validationFormCheck3">Femenino</label>
                        </div>
                        </div> 
                          <div class="mb-2 col-md-12">
                          <label for="validationCustom02" class="form-label fw-bold">Ingrese Correo Electronico</label>
                          <input type="text" name="txtcorreo" class="form-control " id="validationCustom02" placeholder="Ingrese E-mail" required="" >
                          <div class="valid-feedback fw-bold">Completo!</div>
                          </div>
                          <div class="mb-2 col-md-6">
                          <label for="validationCustom03" class="form-label fw-bold">Ingrese contraseña</label>
                          <input type="password" name="txtpass" class="form-control" id="validationCustom03" placeholder="Ingrese contraseña" required >
                          <div class="valid-feedback fw-bold">Completo!</div>
                          </div>
                          <div class="mb-2 col-md-6">
                          <label for="validationCustom04" class="form-label fw-bold">Verificar contraseña</label>
                          <input type="password" name="" class="form-control" id="validationCustom04" placeholder="Ingrese contraseña" required>
                          <div class="valid-feedback fw-bold">Completo!</div>
                          </div>
                        <div class="col-md-6 mb-2">
                        <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                        <label class="form-check-label" for="invalidCheck2">
                        acepto terminos y condiciones
                       </label>
                       </div>
                       </div>
                        
                         <div>
                             <button type="submit" class="btn btn-primary w-100 fw-bold" >Registrarte</button>  
                                 
                        </div>
                        </div>
                    <input type="hidden" name="ope" value="Insertar" >
                </form>
                <p class="text-center mt-3 text-light">Si tiene una cuenta, <a href="pag_login.jsp" class="text-info text-decoration-none">Iniciar sesión</a></p>
            </div>
        </div>
    </div>
</div>
        <script type="text/javascript" src="js/registrar.js"></script>
        
</body>
</html>

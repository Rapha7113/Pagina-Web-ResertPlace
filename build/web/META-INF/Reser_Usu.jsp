<%-- 
    Document   : Reser_Usu
    Created on : 10/07/2022, 06:26:04 PM
    Author     : Andre
--%>

<%@page import="Modelo.Modalidad"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        
    </head>
    <body>
        
        <div class="container">
        <select name="selectAbo" class="form-select" id="validationCustom04" required>
                        <option selected disabled value="">-Seleccione Especialidad-</option>
                 <%
                ArrayList<Modalidad> list=(ArrayList<Modalidad>)request.getAttribute("Mod");
                for(int i=0;i<list.size();i++){
                    Modalidad e=list.get(i);
                %>                          
                <option value="<%=e.getTipoM()%>"><%=e.getTipoM()%></option>
                <%}%> </select>
        </div>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Gestión de Tesis UPLA</title>
        <link rel="stylesheet" href="css/estilos.css"> 
    </head>
    <body>
        
        <div class="main-container">
            
            <div class="logo-text">UPLA</div>
            <div class="title-text">Sistema de Gestión de Tesis</div>
            <div class="subtitle-text">Bienvenido al portal de acceso</div>
            
            <form action="LoginController" method="POST">
                
                <div class="login-container">
                    
                    <label for="usuario">Correo Institucional</label>
                    <input type="text" id="usuario" name="usuario" placeholder="usuario@upla.edu.pe" required>
                    
                    <label for="clave">Contraseña</label>
                    <input type="password" id="clave" name="clave" placeholder="••••••••" required>
                    
                </div>
                
                <button type="submit" class="login-button">Iniciar sesión</button>
            </form>
            
            <% if (request.getAttribute("errorLogin") != null) { %>
                <p style="color: red; margin-top: -30px;"><%= request.getAttribute("errorLogin") %></p>
            <% } %>

            <p><a href="index.jsp">Volver al inicio</a></p>
        </div>
    </body>
</html>
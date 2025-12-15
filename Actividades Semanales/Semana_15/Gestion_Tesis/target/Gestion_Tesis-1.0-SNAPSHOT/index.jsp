<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido al Sistema de Gestión de Tesis</title>
        </head>
    <body>
    
    <style>
        body, html { height: 100%; margin: 0; }
        
        /* Imagen de la Izquierda */
        .bg-login {
            background-image: url('https://images.unsplash.com/photo-1497633762265-9d179a990aa6?auto=format&fit=crop&q=80');
            background-size: cover;
            background-position: center;
        }
        
        /* Panel del Formulario Derecha */
        .login-panel {
            display: flex;
            align-items: center;
            justify-content: center;
            background-color: #ffffff;
        }
        
        .form-container {
            width: 100%;
            max-width: 800px;
            padding: 80px;
        }
    </style>
        <h1>Sistema de Gestión de Tesis</h1>
        <hr>
        
        <c:if test="${sessionScope.usuarioLogueado != null}">
            <%-- Asumiendo que has añadido el campo 'nombres' a la clase Usuario --%>
            <h2>Bienvenido, ${sessionScope.usuarioLogueado.nombres} (${sessionScope.rol})</h2>
            
            <ul>
                <li><a href="TesisController">Ver Listado de Tesis</a></li>
                
                <c:if test="${sessionScope.rol eq 'Administrador'}">
                    <li><a href="admin.jsp">Administración (Insertar Tesis)</a></li>
                </c:if>

                <li><a href="LoginController?accion=logout">Cerrar Sesión</a></li>
            </ul>
        </c:if>

        <c:if test="${sessionScope.usuarioLogueado == null}">
            <h2>Necesitas iniciar sesión para continuar</h2>
            <ul>
                <li><a href="login.jsp">Iniciar Sesión</a></li>
                <li><a href="TesisController">Ver Listado Público de Tesis</a></li>
            </ul>
        </c:if>
        
    </body>
</html>
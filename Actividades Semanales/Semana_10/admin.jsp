<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administración de Tesis</title>
    </head>
    <body>
        <h1>Administración de Tesis</h1>
        
        <h2>Registrar Nueva Tesis</h2>
        
        <form action="TesisController" method="POST">
            
            <label for="titulo">Título:</label>
            <input type="text" id="titulo" name="titulo" required><br><br>
            
            <label for="autor">Autor:</label>
            <input type="text" id="autor" name="autor" required><br><br>
            
            <label for="anio">Año:</label>
            <input type="number" id="anio" name="anio" required><br><br>
            
            <label for="estado">Estado:</label>
            <select id="estado" name="estado">
                <option value="Pendiente">Pendiente</option>
                <option value="Aprobada">Aprobada</option>
                <option value="Rechazada">Rechazada</option>
            </select><br><br>
            
            <input type="submit" value="Guardar Tesis">
        </form>
        
        <hr>
        
        <p><a href="TesisController">Ver Listado de Tesis</a></p>
        <p><a href="index.jsp">Volver al inicio</a></p>
        
    </body>
</html>
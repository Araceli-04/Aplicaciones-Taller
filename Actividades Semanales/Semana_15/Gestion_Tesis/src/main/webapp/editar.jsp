<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Tesis</title>
    </head>
    <body>
        
        <h1>Editar Tesis: ${tesis.titulo}</h1>
        
        <form action="TesisController?accion=actualizar" method="POST">
            
            <input type="hidden" name="idTesis" value="${tesis.idTesis}">
            
            <label for="titulo">Título:</label>
            <input type="text" id="titulo" name="titulo" value="${tesis.titulo}" required><br><br>
            
            <label for="autor">Autor:</label>
            <input type="text" id="autor" name="autor" value="${tesis.autor}" required><br><br>
            
            <label for="anio">Año:</label>
            <input type="number" id="anio" name="anio" value="${tesis.anio}" required><br><br>
            
            <label for="estado">Estado:</label>
            <select id="estado" name="estado">
                <c:set var="currentStatus" value="${tesis.estado}"/>
                <option value="Pendiente" <c:if test="${currentStatus eq 'Pendiente'}">selected</c:if>>Pendiente</option>
                <option value="Aprobada" <c:if test="${currentStatus eq 'Aprobada'}">selected</c:if>>Aprobada</option>
                <option value="Rechazada" <c:if test="${currentStatus eq 'Rechazada'}">selected</c:if>>Rechazada</option>
            </select><br><br>
            
            <input type="submit" value="Guardar Cambios">
        </form>
        
        <hr>
        <p><a href="TesisController">Cancelar y Volver al Listado</a></p>
    </body>
</html>
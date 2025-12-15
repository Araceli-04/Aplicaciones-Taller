<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Tesis - Listado</title>
    </head>
    <body>
        <h1>Lista de Tesis Disponibles</h1>
        
        <p><a href="admin.jsp">Ir a Administración (Insertar)</a></p>
        <hr>
        
        <c:if test="${!empty listaTesis}">
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Título</th>
                        <th>Autor</th>
                        <th>Año</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tesis" items="${listaTesis}">
                        <tr>
                            <td>${tesis.idTesis}</td>
                            <td>${tesis.titulo}</td>
                            <td>${tesis.autor}</td>
                            <td>${tesis.anio}</td>
                            <td>${tesis.estado}</td>
                            <td>
                                <a href="TesisController?accion=editar&id=${tesis.idTesis}">
                                    Editar
                                </a>
                                &nbsp;|&nbsp;
                                <a href="TesisController?accion=eliminar&id=${tesis.idTesis}" 
                                   onclick="return confirm('¿Está seguro de eliminar la tesis ${tesis.titulo}?');">
                                    Eliminar
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty listaTesis}">
            <p>No hay tesis registradas.</p>
        </c:if>

        <p><a href="index.jsp">Volver al inicio</a></p>
    </body>
</html>
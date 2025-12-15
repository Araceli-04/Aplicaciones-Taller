package Controladores;

import Datos.TesisDAO;
import Modelo.Tesis;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/TesisController")
public class TesisController extends HttpServlet {

    private TesisDAO tesisDAO = new TesisDAO(); 

    // Maneja peticiones GET (Listar, Editar, Eliminar)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "listar";
        }

        switch (accion) {
            case "editar":
                MostrarFormularioEdicion(request, response); // Nueva acción
                break;
            case "eliminar":
                EliminarTesis(request, response); 
                break;
            case "listar":
            default: 
                ListarTesis(request, response);
                break;
        }
    }
    
    // Maneja peticiones POST (Insertar, Actualizar)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "insertar"; // Por defecto, si no se especifica, se asume inserción
        }
        
        switch (accion) {
            case "actualizar":
                ActualizarTesis(request, response); // Nueva acción
                break;
            case "insertar":
            default:
                InsertarTesis(request, response); // Código que ya tenías
                break;
        }
    }

    // --- MÉTODOS AUXILIARES DEL CONTROLADOR (CRUD) ---

    // CRUD-R: Listar todas las tesis
    private void ListarTesis(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        List<Tesis> listaTesis = tesisDAO.ListarTesis();
        request.setAttribute("listaTesis", listaTesis);
        request.getRequestDispatcher("alumno.jsp").forward(request, response);
    }
    
    // CRUD-C: Insertar nueva tesis (Ya existente, solo refactorizado)
    private void InsertarTesis(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        int anio = Integer.parseInt(request.getParameter("anio"));
        String estado = request.getParameter("estado");
        
        Tesis nuevaTesis = new Tesis(0, titulo, autor, anio, estado); // 0 porque id es auto_increment
        int registrosInsertados = tesisDAO.InsertarTesis(nuevaTesis);
        
        // Redirigir al listado
        response.sendRedirect("TesisController");
    }
    
    // CRUD-U (Paso 1): Mostrar el formulario de edición
    private void MostrarFormularioEdicion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Obtener el ID de la tesis de la URL
        int idTesis = Integer.parseInt(request.getParameter("id"));
        
        // 2. Buscar la tesis completa en la base de datos
        Tesis tesisAEditar = new Tesis();
        tesisAEditar.setIdTesis(idTesis);
        tesisAEditar = tesisDAO.BuscarTesis(tesisAEditar);
        
        // 3. Pasar el objeto Tesis a la nueva vista (editar.jsp)
        request.setAttribute("tesis", tesisAEditar);
        request.getRequestDispatcher("editar.jsp").forward(request, response);
    }
    
    // CRUD-U (Paso 2): Procesar la actualización
    private void ActualizarTesis(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Capturar todos los datos (incluyendo el ID oculto)
        int idTesis = Integer.parseInt(request.getParameter("idTesis")); // Necesario para el WHERE
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        int anio = Integer.parseInt(request.getParameter("anio"));
        String estado = request.getParameter("estado");
        
        // 2. Crear el objeto Tesis con los datos actualizados
        Tesis tesisActualizada = new Tesis(idTesis, titulo, autor, anio, estado);
        
        // 3. Llamar al DAO para actualizar
        int registrosActualizados = tesisDAO.ActualizarTesis(tesisActualizada);
        
        // 4. Redirigir al listado
        response.sendRedirect("TesisController");
    }
    
    // CRUD-D: Eliminar tesis (Ya existente, solo refactorizado)
    private void EliminarTesis(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        int idTesis = Integer.parseInt(request.getParameter("id"));
        Tesis tesis = new Tesis();
        tesis.setIdTesis(idTesis);
        
        tesisDAO.EliminarTesis(tesis);
        
        // Redirigir al listado
        response.sendRedirect("TesisController");
    }
}
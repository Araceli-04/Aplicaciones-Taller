package Controladores;

import Datos.UsuarioDAO;
import Modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession; // Clase clave para sesiones
import java.io.IOException;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Capturar los datos del formulario (login.jsp)
        String nombreUsuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        // 2. Crear un objeto Usuario para la validación
        Usuario usuarioIntento = new Usuario();
        usuarioIntento.setNombreUsuario(nombreUsuario);
        usuarioIntento.setClave(clave);
        
        // 3. Validar con la capa de Datos
        Usuario usuarioAutenticado = usuarioDAO.ValidarUsuario(usuarioIntento);
        
        if (usuarioAutenticado != null) {
            // LOGIN EXITOSO:
            
            // a) Crear o recuperar la sesión
            HttpSession session = request.getSession();
            
            // b) Almacenar el usuario y su rol en la sesión
            session.setAttribute("usuarioLogueado", usuarioAutenticado);
            session.setAttribute("rol", usuarioAutenticado.getRol());
            
            // c) Redirigir según el rol
            if ("Administrador".equals(usuarioAutenticado.getRol())) {
                response.sendRedirect("admin.jsp"); // Accede a las funciones CRUD
            } else {
                response.sendRedirect("alumno.jsp"); // Accede solo al listado
            }
            
        } else {
            // LOGIN FALLIDO:
            
            // Establecer un mensaje de error y redirigir de vuelta a la página de login
            request.setAttribute("errorLogin", "Usuario o contraseña incorrectos.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Usaremos GET para la función de LOGOUT
        
        String accion = request.getParameter("accion");
        
        if ("logout".equals(accion)) {
            // Cierra la sesión
            HttpSession session = request.getSession(false); 
            if (session != null) {
                session.invalidate(); // Invalida y elimina todos los datos de la sesión
            }
            response.sendRedirect("login.jsp"); // Vuelve a la página de login
            
        } else {
            // Si alguien intenta acceder con GET sin acción, lo enviamos al login
            response.sendRedirect("login.jsp");
        }
    }
}
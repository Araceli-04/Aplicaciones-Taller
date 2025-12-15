package Datos;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    // SQL para buscar un usuario por nombre y clave
    private static final String SQL_SELECT_LOGIN = 
            "SELECT idUsuario, nombreUsuario, clave, rol FROM Usuario WHERE nombreUsuario = ? AND clave = ?";
    
    // 1. Método para VALIDAR credenciales de un usuario
    public Usuario ValidarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuarioValidado = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_LOGIN);
            
            // Asignar los valores de búsqueda
            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getClave());
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Si encontramos una fila, las credenciales son correctas.
                usuarioValidado = new Usuario();
                usuarioValidado.setIdUsuario(rs.getInt("idUsuario"));
                usuarioValidado.setNombreUsuario(rs.getString("nombreUsuario"));
                usuarioValidado.setClave(rs.getString("clave"));
                usuarioValidado.setRol(rs.getString("rol")); 
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarioValidado; // Retorna null si no lo encuentra, o el objeto Usuario si lo encuentra
    }
}
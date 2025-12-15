package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    // Configuración de MySQL
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/gestion_tesis_db?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root"; // ¡Cuidado! Cambia esto por tu usuario de MySQL
    private static final String JDBC_PASS = "tu_clave"; // ¡Cuidado! Cambia esto por tu contraseña de MySQL

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        try {
            // 1. Cargar el driver (necesario en versiones antiguas, buena práctica en modernas)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Crear y retornar la conexión
            return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            
        } catch (ClassNotFoundException e) {
            // Si el driver no se encuentra (revisa el pom.xml)
            throw new SQLException("Error: No se encontró el driver JDBC de MySQL. " + e.getMessage());
        }
    }
    
    // Método de prueba opcional
    public static void main(String[] args) {
        try {
            Connection con = getConnection();
            System.out.println("Conexión a MySQL exitosa!");
            con.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar a MySQL: " + e.getMessage());
        }
    }
}
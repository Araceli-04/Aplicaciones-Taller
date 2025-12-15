package Datos;

import Modelo.Tesis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesisDAO {

    // Comandos SQL
    private static final String SQL_SELECT = "SELECT idTesis, titulo, autor, anio, estado FROM Tesis";
    private static final String SQL_SELECT_BY_ID = "SELECT idTesis, titulo, autor, anio, estado FROM Tesis WHERE idTesis = ?";
    private static final String SQL_INSERT = "INSERT INTO Tesis(titulo, autor, anio, estado) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Tesis SET titulo=?, autor=?, anio=?, estado=? WHERE idTesis=?";
    private static final String SQL_DELETE = "DELETE FROM Tesis WHERE idTesis = ?";

    // 1. Método para LISTAR (LEER) todas las tesis (Ya existente)
    public List<Tesis> ListarTesis() {
        // ... (Tu código actual de ListarTesis) ...
        // ... (Omitido por brevedad, asume que es el código que ya tienes) ...
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Tesis tesis = null;
        List<Tesis> tesisList = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idTesis = rs.getInt("idTesis");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anio = rs.getInt("anio");
                String estado = rs.getString("estado");

                tesis = new Tesis(idTesis, titulo, autor, anio, estado);
                tesisList.add(tesis);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return tesisList;
    }

    // 2. Método para BUSCAR (READ por ID) una tesis
    public Tesis BuscarTesis(Tesis tesis) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, tesis.getIdTesis());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anio = rs.getInt("anio");
                String estado = rs.getString("estado");
                
                tesis.setTitulo(titulo);
                tesis.setAutor(autor);
                tesis.setAnio(anio);
                tesis.setEstado(estado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return tesis;
    }
    
    // 3. Método para INSERTAR (CREAR) una nueva tesis (Ya existente)
    public int InsertarTesis(Tesis tesis) {
        // ... (Tu código actual de InsertarTesis) ...
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0; 
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, tesis.getTitulo());
            stmt.setString(2, tesis.getAutor());
            stmt.setInt(3, tesis.getAnio());
            stmt.setString(4, tesis.getEstado());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rows;
    }
    
    // 4. Método para ACTUALIZAR (UPDATE) un registro
    public int ActualizarTesis(Tesis tesis) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            // Asignar los valores a los parámetros
            stmt.setString(1, tesis.getTitulo());
            stmt.setString(2, tesis.getAutor());
            stmt.setInt(3, tesis.getAnio());
            stmt.setString(4, tesis.getEstado());
            stmt.setInt(5, tesis.getIdTesis()); // Clave de actualización (WHERE)
            
            rows = stmt.executeUpdate(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rows;
    }

    // 5. Método para ELIMINAR un registro (Ya existente)
    public int EliminarTesis(Tesis tesis) {
        // ... (Tu código actual de EliminarTesis) ...
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, tesis.getIdTesis());
            rows = stmt.executeUpdate(); 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rows;
    }
}
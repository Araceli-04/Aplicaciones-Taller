package Controlador;

import Modelo.Conexion;
import Vista.LoginVista;
import Vista.RegistrarCitaVista;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ControladorRegistrarCita {
    private final RegistrarCitaVista vista;
    private final Connection conn;

    public ControladorRegistrarCita(RegistrarCitaVista vista) {
        this.vista = vista;
        this.conn = Conexion.getConexion();

        // Cargar psicólogos en el combo
        cargarPsicologos();

        // Asignar listeners
        this.vista.agregarGuardarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCita();
            }
        });

        this.vista.agregarCancelarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverMenu();
            }
        });
    }

    // ---------- MÉTODOS PRINCIPALES ----------

    private void cargarPsicologos() {
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT nombre FROM usuarios WHERE rol = 'Psicólogo'")) {
            
            java.util.List<String> lista = new java.util.ArrayList<>();
            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
            vista.setPsicologos(lista.toArray(new String[0]));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar psicólogos: " + e.getMessage());
        }
    }

    private void guardarCita() {
        String psicologo = vista.getPsicologo();
        String fecha = vista.getFecha();
        String hora = vista.getHora();
        String motivo = vista.getMotivo();

        if (psicologo.isEmpty() || fecha.isEmpty() || hora.isEmpty() || motivo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            return;
        }

        String sql = "INSERT INTO citas (psicologo, fecha, hora, motivo) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psicologo);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setString(4, motivo);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cita registrada correctamente");
            vista.dispose();

            // Luego de registrar, regresar al menú principal
            LoginVista menu = new LoginVista();
            new ControladorLogin(menu);
            menu.setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita: " + e.getMessage());
        }
    }

    private void volverMenu() {
        vista.dispose();
        LoginVista menu = new LoginVista();
        new ControladorLogin(menu);
        menu.setVisible(true);
    }
}

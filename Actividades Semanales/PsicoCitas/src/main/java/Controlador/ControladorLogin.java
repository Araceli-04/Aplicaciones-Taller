package Controlador;

import Modelo.Conexion;
import Vista.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ControladorLogin {
    private final LoginVista loginVista;
    private Connection conn;

    public ControladorLogin(LoginVista loginVista) {
        this.loginVista = loginVista;
        this.conn = Conexion.getConexion(); // Usa tu clase de conexión

        // Listener botón Ingresar
        this.loginVista.agregarLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticarUsuario();
            }
        });

        // Listener botón Registrar
        this.loginVista.agregarRegistroListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirRegistro();
            }
        });
    }

    private void autenticarUsuario() {
        String usuario = loginVista.getUsuario();
        String clave = loginVista.getClave();
        String rol = loginVista.getRol();

        if (usuario.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar usuario y contraseña");
            return;
        }

        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ? AND rol = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ps.setString(3, rol);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido, " + usuario);
                loginVista.setVisible(false);

                // Abrir vista según el rol
                if (rol.equalsIgnoreCase("Paciente")) {
                    // Instancias necesarias
                    PacienteVista pv = new PacienteVista();
                    RegistrarCitaVista rcv = new RegistrarCitaVista();
                    LoginVista lv = loginVista;

                    // Controlador Paciente
                    new ControladorPaciente(pv, rcv, lv);
                    pv.setVisible(true);

                } else if (rol.equalsIgnoreCase("Psicólogo")) {
                    // Instancias necesarias
                    PsicologoVista psicoVista = new PsicologoVista();
                    AgendaVista av = new AgendaVista();
                    LoginVista lv = loginVista;

                    // Controlador Psicólogo
                    new ControladorPsicologo(psicoVista, av, lv);
                    psicoVista.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Rol no reconocido");
                    loginVista.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al autenticar: " + e.getMessage());
        }
    }

    private void abrirRegistro() {
    loginVista.dispose();
    RegistroVista rv = new RegistroVista();
    new ControladorRegistro(rv); // ← aquí está el cambio clave
    rv.setVisible(true);
}
}

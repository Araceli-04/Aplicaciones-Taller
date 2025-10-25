package Controlador;

import Vista.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class ControladorPaciente {

    private final PacienteVista pacienteVista;
    private final RegistrarCitaVista registrarCitaVista;
    private final LoginVista loginVista;

    public ControladorPaciente(PacienteVista p, RegistrarCitaVista r, LoginVista l) {
        this.pacienteVista = p;
        this.registrarCitaVista = r;
        this.loginVista = l;

        // --- Botón "Volver al login" ---
        pacienteVista.agregarVolverListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pacienteVista.setVisible(false);
                loginVista.setVisible(true);
            }
        });

        // --- Botón "Registrar Cita" ---
        pacienteVista.agregarRegistrarCitaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirRegistrarCita();
            }
        });

        // --- Botón "Salir" ---
        pacienteVista.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirAplicacion();
            }
        });
    }

    private void abrirRegistrarCita() {
        try {
            RegistrarCitaVista rc = new RegistrarCitaVista();
            new ControladorRegistrarCita(rc);
            rc.setVisible(true);
            pacienteVista.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el registro de cita: " + ex.getMessage());
        }
    }

    private void salirAplicacion() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "¿Seguro que deseas salir de la aplicación?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Hasta luego.");
            System.exit(0);
        }
    }
}

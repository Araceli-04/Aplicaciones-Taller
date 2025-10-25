package Controlador;

import Vista.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class ControladorPsicologo {

    private final PsicologoVista psicologoVista;
    private final AgendaVista agendaVista;
    private final LoginVista loginVista;

    public ControladorPsicologo(PsicologoVista ps, AgendaVista a, LoginVista l) {
        this.psicologoVista = ps;
        this.agendaVista = a;
        this.loginVista = l;

        // --- Botón "Volver al Login" ---
        psicologoVista.agregarVolverListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                psicologoVista.setVisible(false);
                loginVista.setVisible(true);
            }
        });

        // --- Botón "Ver Agenda" ---
        psicologoVista.agregarAgendaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirAgenda();
            }
        });

        // --- Botón "Salir" ---
        psicologoVista.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirAplicacion();
            }
        });
    }

    private void abrirAgenda() {
        try {
            psicologoVista.setVisible(false);
            agendaVista.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                "Error al abrir la agenda: " + ex.getMessage());
        }
    }

    private void salirAplicacion() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "¿Deseas cerrar sesión y salir de la aplicación?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Cerrando sesión...");
            System.exit(0);
        }
    }
}

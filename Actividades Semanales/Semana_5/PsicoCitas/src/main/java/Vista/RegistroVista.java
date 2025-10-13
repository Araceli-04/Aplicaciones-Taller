
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class RegistroVista extends javax.swing.JFrame {

    public RegistroVista() {
        initComponents();
        formulario();
    }
    private void formulario() {
        this.setTitle("Registro de Usuario - PsicoCitas");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setSize(new Dimension(407, 309));
        this.getContentPane().setBackground(Color.white);

        cmbRol.removeAllItems();
        cmbRol.addItem("Paciente");
        cmbRol.addItem("Psicólogo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 253, 245));

        lblTitulo.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Usuario");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        lblRol.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblRol.setForeground(new java.awt.Color(95, 150, 50));
        lblRol.setText("Rol :");

        cmbRol.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cmbRol.setForeground(new java.awt.Color(51, 51, 51));
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Psicólogo" }));

        lblNombre.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(95, 150, 50));
        lblNombre.setText("Nombre Completo:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblCelular.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(95, 150, 50));
        lblCelular.setText("Celular:");

        txtCelular.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(51, 51, 51));

        lblUsuario.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(95, 150, 50));
        lblUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));

        lblClave.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblClave.setForeground(new java.awt.Color(95, 150, 50));
        lblClave.setText("Contraseña:");

        txtClave.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtClave.setForeground(new java.awt.Color(51, 51, 51));

        btnRegistrar.setBackground(new java.awt.Color(255, 204, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");

        btnVolver.setBackground(new java.awt.Color(255, 204, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver al login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClave)
                                    .addComponent(lblUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblRol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClave))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public String getRol() { return (String) cmbRol.getSelectedItem(); }
    public String getNombre() { return txtNombre.getText().trim(); }
    public String getCelular() { return txtCelular.getText().trim(); }
    public String getUsuario() { return txtUsuario.getText().trim(); }
    public String getClave() { return new String(txtClave.getPassword()); }

    // Listeners
    public void agregarRegistrarListener(ActionListener l) {
        this.btnRegistrar.addActionListener(l);
    }

    public void agregarVolverListener(ActionListener l) {
        this.btnVolver.addActionListener(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

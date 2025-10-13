
package Vista;

import java.awt.Color;
import java.awt.event.ActionListener;

public class RegistrarCitaVista extends javax.swing.JFrame {

    public RegistrarCitaVista() {
        initComponents();
        formulario();
    }
    private void formulario() {
        this.setTitle("Registrar Nueva Cita - PsicoCitas");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblPsicologo = new javax.swing.JLabel();
        cbxPsicologo = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 253, 245));

        lblTitulo.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registrar Nueva Cita");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        lblPsicologo.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblPsicologo.setForeground(new java.awt.Color(95, 150, 50));
        lblPsicologo.setText("Psicologo:");

        cbxPsicologo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cbxPsicologo.setForeground(new java.awt.Color(51, 51, 51));

        lblFecha.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(95, 150, 50));
        lblFecha.setText("Fecha: ");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(51, 51, 51));

        lblHora.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(95, 150, 50));
        lblHora.setText("Hora:");

        txtHora.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 150, 50));
        jLabel1.setText("Motivo/Descripcion");

        txtMotivo.setBackground(new java.awt.Color(192, 248, 146));
        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtMotivo.setForeground(new java.awt.Color(51, 51, 51));
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        btnGuardar.setBackground(new java.awt.Color(255, 204, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Cita");

        btnCancelar.setBackground(new java.awt.Color(255, 204, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(lblPsicologo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblHora)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPsicologo)
                    .addComponent(cbxPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
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

    public String getPsicologo() { return cbxPsicologo.getSelectedItem().toString(); }
    public String getFecha() { return txtFecha.getText(); }
    public String getHora() { return txtHora.getText(); }
    public String getMotivo() { return txtMotivo.getText(); }

    public void setPsicologos(String[] psicologos) {
        cbxPsicologo.removeAllItems();
        for (String p : psicologos) {
            cbxPsicologo.addItem(p);
        }
    }
    public void agregarGuardarListener(ActionListener l) { btnGuardar.addActionListener(l); }
    public void agregarCancelarListener(ActionListener l) { btnCancelar.addActionListener(l); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxPsicologo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPsicologo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Lenovo
 */
public class View_Cifrado extends javax.swing.JPanel {

    /**
     * Creates new form View_Cifradoo
     */
    public View_Cifrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_texto = new javax.swing.JTextArea();
        jbtn_aceptar = new javax.swing.JButton();
        jr_cifrar = new javax.swing.JRadioButton();
        jr_decifrar = new javax.swing.JRadioButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cifrado y Descifrado de texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jt_texto.setColumns(20);
        jt_texto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jt_texto.setRows(5);
        jScrollPane1.setViewportView(jt_texto);

        jbtn_aceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jbtn_aceptar.setText("Aceptar");

        jr_cifrar.setBackground(new java.awt.Color(204, 204, 255));
        jr_cifrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jr_cifrar.setText("Cifrar");

        jr_decifrar.setBackground(new java.awt.Color(204, 204, 255));
        jr_decifrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jr_decifrar.setText("Descifrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jr_decifrar)
                            .addComponent(jr_cifrar))
                        .addGap(119, 119, 119)
                        .addComponent(jbtn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jr_cifrar)
                        .addGap(29, 29, 29)
                        .addComponent(jr_decifrar))
                    .addComponent(jbtn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_aceptar;
    public javax.swing.JRadioButton jr_cifrar;
    public javax.swing.JRadioButton jr_decifrar;
    public javax.swing.JTextArea jt_texto;
    // End of variables declaration//GEN-END:variables
}
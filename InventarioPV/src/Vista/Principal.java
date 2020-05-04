/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Marlon
 */
public class Principal extends javax.swing.JPanel {
    private Contenedor contenedor;
    private Usuario usuario;

    /**
     * Creates new form Principal
     */
    

    Principal(Contenedor contenedor) {
        this.contenedor=contenedor;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/empleados.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel3.setText("TIM");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setText("TECHNICAL INVENTORY MANAGER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Usuario");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        cerrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(153, 0, 51));
        cerrar.setText("SALIR");
        cerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoPrincipal01.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       usuariosPrincipal();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
      salir();
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private void usuariosPrincipal () {
       contenedor.irAUsuario(this);
       
    }

private void salir (){
    contenedor.irALogin(this);
}

}

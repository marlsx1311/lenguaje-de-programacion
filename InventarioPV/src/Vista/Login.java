/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.LogicaUsuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Modelo.Usuario;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JPanel {
    
    
    
    private Contenedor contenedor;
    LogicaUsuario logica = new LogicaUsuario();

    /**
     * Creates new form Login
     */
    public Login(Contenedor contenedor) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ingresoUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ingresoContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Contraseña");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Usuario");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/personaLogin (1).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        add(ingresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 180, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 150, 40));

        ingresoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoContraseñaActionPerformed(evt);
            }
        });
        ingresoContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ingresoContraseñaKeyPressed(evt);
            }
        });
        add(ingresoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel3.setText("TIM");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setText("TECHNICAL INVENTORY MANAGER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoLogin01.png"))); // NOI18N
        add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoContraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String user = ingresoUsuario.getText();
        String pass = ingresoContraseña.getText();
        iniciarSesion(user,pass);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ingresoContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoContraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String user = ingresoUsuario.getText();
        String pass = ingresoContraseña.getText();
        iniciarSesion(user,pass);
        }
    }//GEN-LAST:event_ingresoContraseñaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JPasswordField ingresoContraseña;
    private javax.swing.JTextField ingresoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
    private void gestionCliente() {
        contenedor.irAPrincipal(this);
    }
    
    private void iniciarSesion(String user, String pass) {
        if (user.equals("") || pass.equals(" ")){
            JOptionPane.showMessageDialog(null, "nu puede dejar campos vacios");
        }else{
            Usuario datos = logica.iniciaSesion(user, pass);
            if (datos !=null){
                JOptionPane.showMessageDialog(null,"Bienvenido:"+user );
                gestionCliente();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña no existe en la bd");
            }
        }
    }


}

package vista;
import controlador.EventoModificar;
import controlador.EventoBorrar;
import controlador.EventoCrear;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class CRUDevento extends javax.swing.JPanel {
    
    private final Principal principal;
    
    Conexion conectar = new Conexion();
    Connection conector = Conexion.getConnection();
    
    DefaultTableModel tablaR;
    int filas;
    
    EventoCrear eventocrear = new EventoCrear();
    EventoModificar eventomodificar = new EventoModificar();
    EventoBorrar eventoborrar = new EventoBorrar();
   
    public CRUDevento(Principal principal) {
        this.principal = principal;
        initComponents();
        listar();
        
    }

    public void limpiar(){
        idIntro.setText("");
        nombrePIntro.setText("");
        fechaMIntro.setText("");
        fechaAIntro.setText("");
        presentadoIntro.setText("");
        ciudadIntro.setText("");
        direccionIntro.setText("");
        fechaEIntro.setText("");
        
       
    }
    
    void listar() {
        tablaR = new DefaultTableModel();
        tablaR.addColumn("IDEMPRESA");
        tablaR.addColumn("NOMBRE PROYECTO");
        tablaR.addColumn("FECHA MONTAJE");
        tablaR.addColumn("FECHA ACTIVIDAD");
        tablaR.addColumn("PRESENTADO POR");
        tablaR.addColumn("CIUDAD DE EJECUCION");
        tablaR.addColumn("DIRECCION");
        tablaR.addColumn("FECHA DE ELABORACION");
        
        this.tableEventos.setModel(tablaR);
        
        String mostrarDatos = "SELECT * FROM Eventos";
        
        String datos[] = new String[8];
        
        
        try {
            Statement st = conector.createStatement();
            ResultSet rs = st.executeQuery(mostrarDatos);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                tablaR.addRow(datos);
            }
            tableEventos.setModel(tablaR);
        } catch (SQLException e) {
            System.out.println("no se pudieron mostrar los datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEventos = new javax.swing.JTable();
        labelDireccion = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        labelRepresentante = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        fechaEIntro = new javax.swing.JTextField();
        presentadoIntro = new javax.swing.JTextField();
        fechaAIntro = new javax.swing.JTextField();
        fechaMIntro = new javax.swing.JTextField();
        nombrePIntro = new javax.swing.JTextField();
        idIntro = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        LSE = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        Icono_StarM1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ciudadIntro = new javax.swing.JTextField();
        direccionIntro = new javax.swing.JTextField();
        labelDireccion1 = new javax.swing.JLabel();
        labelDireccion2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ACCIONES"));

        jButton3.setText("BORRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 410, 90));

        tableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEventos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 820, 310));

        labelDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccion.setText("Fecha de elaboracion");
        add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        labelCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCelular.setText("Presentado por");
        add(labelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        labelCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCargo.setText("Fecha actividad");
        add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        labelRepresentante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRepresentante.setText("Fecha montaje");
        add(labelRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        labelCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCorreo.setText("Nombre del proyecto");
        add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        idCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idCliente.setText("ID Cliente");
        add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));
        add(fechaEIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 150, 30));
        add(presentadoIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 150, 30));
        add(fechaAIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 150, 30));

        fechaMIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaMIntroActionPerformed(evt);
            }
        });
        add(fechaMIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 30));
        add(nombrePIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 30));

        idIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idIntroActionPerformed(evt);
            }
        });
        add(idIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton1.setText("VOLVER");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        LSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/LSE.png"))); // NOI18N
        add(LSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 640, -1, -1));

        Icono_StarM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Iconos/Logopequeño.png"))); // NOI18N
        add(Icono_StarM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 110, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AGENDA DE EVENTOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        add(ciudadIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 150, 30));
        add(direccionIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 150, 30));

        labelDireccion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccion1.setText("Ciudad de ejecucion");
        add(labelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        labelDireccion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccion2.setText("Direccion");
        add(labelDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Fondo2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        regresaraHome();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_salirMouseClicked

    private void fechaMIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaMIntroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaMIntroActionPerformed

    private void tableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEventosMouseClicked
        // TODO add your handling code here:
        int seleccion = tableEventos.getSelectedRow();
        
        
        idIntro.setText(tableEventos.getValueAt(seleccion, 0).toString());
        nombrePIntro.setText(tableEventos.getValueAt(seleccion, 1).toString());
        fechaMIntro.setText(tableEventos.getValueAt(seleccion, 2).toString());
        fechaAIntro.setText(tableEventos.getValueAt(seleccion, 3).toString());
        presentadoIntro.setText(tableEventos.getValueAt(seleccion, 4).toString());
        ciudadIntro.setText(tableEventos.getValueAt(seleccion, 5).toString());
        direccionIntro.setText(tableEventos.getValueAt(seleccion, 6).toString());
        fechaEIntro.setText(tableEventos.getValueAt(seleccion, 7).toString());
        
        filas=seleccion;
    }//GEN-LAST:event_tableEventosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nombreProyecto = nombrePIntro.getText();
        String fechaMontaje = fechaMIntro.getText();
        String fechaActividad = fechaAIntro.getText();
        String presentadoPor = presentadoIntro.getText();
        String ciudad = ciudadIntro.getText();
        String direccion = direccionIntro.getText();
        String fechaElavoracion = fechaEIntro.getText();
        
     
        eventocrear.crearEventos(nombreProyecto, fechaMontaje, fechaActividad, presentadoPor,ciudad, direccion,fechaElavoracion );        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String nombreProyecto = nombrePIntro.getText();
        String fechaMontaje = fechaMIntro.getText();
        String fechaActividad = fechaAIntro.getText();
        String presentadoPor = presentadoIntro.getText();
        String ciudad = ciudadIntro.getText();
        String direccion = direccionIntro.getText();
        String fechaElavoracion = fechaEIntro.getText();
        String idempresa = idIntro.getText();
        
     
        eventomodificar.modificarEventoBD(nombreProyecto, fechaMontaje, fechaActividad, presentadoPor,ciudad, direccion,fechaElavoracion, idempresa );
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String iDEmpresa = idIntro.getText();
        
        eventoborrar.borrarEventoBD(iDEmpresa);
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idIntroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idIntroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono_StarM1;
    private javax.swing.JLabel LSE;
    private javax.swing.JTextField ciudadIntro;
    private javax.swing.JTextField direccionIntro;
    private javax.swing.JTextField fechaAIntro;
    private javax.swing.JTextField fechaEIntro;
    private javax.swing.JTextField fechaMIntro;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel idCliente;
    private javax.swing.JTextField idIntro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDireccion1;
    private javax.swing.JLabel labelDireccion2;
    private javax.swing.JLabel labelRepresentante;
    private javax.swing.JTextField nombrePIntro;
    private javax.swing.JTextField presentadoIntro;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tableEventos;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        principal.irAInicio(this);
    }
    
    private void regresaraHome() {
        principal.irAHome(this);
    }
}

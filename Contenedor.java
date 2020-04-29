
package Vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class Contenedor extends javax.swing.JFrame {
    
    private Menu menu;
    private Principal principal;

   
    public Contenedor() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);// bootn cerrar
        setName("Pricipal");
        setTitle("Mascotas");
        setResizable(false);
        pack(); //trar todos los subcomponentes
        setIconImage(getIconImage());
        setLocationRelativeTo(null);//mirat
        iniciar();
        
    }
    /*public Image getIconImage() {
Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/icono_1.png"));
 return retValue;
 }*/

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }
    
    private void iniciar() {
        principal = new Principal (this);
        principal.setVisible(true);
        add(principal);
        pack();
        setLocationRelativeTo(null);  
    }
    
    protected void irAMenu(JPanel jPanel) {
        remove(jPanel);
        menu = new Menu(this);
        menu.setVisible(true);
        add(menu);
        pack();
        setLocationRelativeTo(null); 
       
    }

    protected void regresar(JPanel jPanel) {
        remove(jPanel);
        principal = new Principal(this);
        principal.setVisible(true);
        add(principal);
        pack();
        setLocationRelativeTo(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

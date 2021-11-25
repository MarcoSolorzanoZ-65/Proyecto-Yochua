package proyecto.Vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author marco
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Trivia
     */
    public Vista_Principal() {
        this.setLocationRelativeTo(null);
        this.pack();
        initComponents();
        Color col = new Color(61,61,61);
        this.setResizable(false);
        this.setBackground(col);
        this.setTitle("Manager");
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jM_agregar = new javax.swing.JMenuItem();
        jM_mostrar = new javax.swing.JMenuItem();
        jM_salir = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jM_jugar = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu5.setText("Manager");

        jM_agregar.setText("Añadir Pregunta");
        jM_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_agregarActionPerformed(evt);
            }
        });
        jMenu5.add(jM_agregar);

        jM_mostrar.setText("Mostrar");
        jMenu5.add(jM_mostrar);

        jM_salir.setText("Salir");
        jM_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_salirActionPerformed(evt);
            }
        });
        jMenu5.add(jM_salir);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Juego");

        jM_jugar.setText("Jugar");
        jM_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_jugarActionPerformed(evt);
            }
        });
        jMenu6.add(jM_jugar);

        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_jugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jM_jugarActionPerformed

    private void jM_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jM_salirActionPerformed

    private void jM_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jM_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
           UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem jM_agregar;
    public javax.swing.JMenuItem jM_jugar;
    public javax.swing.JMenuItem jM_mostrar;
    public javax.swing.JMenuItem jM_salir;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu5;
    public javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}

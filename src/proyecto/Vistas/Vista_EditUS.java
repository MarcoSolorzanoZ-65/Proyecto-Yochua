/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Vistas;

import java.awt.Color;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Vista_EditUS extends javax.swing.JDialog {

    /**
     * Creates new form Vista_US
     */
    public Vista_EditUS(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        this.pack();
        initComponents();
        Color col = new Color(61,61,61);
        this.setResizable(false);
        this.setBackground(col);
        this.setTitle("Añadir Selección Unica");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionCorrecta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Pregunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jB_Opcion1 = new javax.swing.JRadioButton();
        jB_Opcion2 = new javax.swing.JRadioButton();
        jB_Opcion3 = new javax.swing.JRadioButton();
        jB_Opcion4 = new javax.swing.JRadioButton();
        jTF_Opcion1 = new javax.swing.JTextField();
        jTF_Opcion2 = new javax.swing.JTextField();
        jTF_Opcion3 = new javax.swing.JTextField();
        jTF_Opcion4 = new javax.swing.JTextField();
        jB_Guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcb_USC = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_volver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escriba una pregunta de tipo Unique Selection:");

        jTextField_Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Pregunta.setText("Pregunta...");
        jTextField_Pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PreguntaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La respuesta correcta es:");

        opcionCorrecta.add(jB_Opcion1);
        jB_Opcion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion1ActionPerformed(evt);
            }
        });

        opcionCorrecta.add(jB_Opcion2);
        jB_Opcion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion2ActionPerformed(evt);
            }
        });

        opcionCorrecta.add(jB_Opcion3);
        jB_Opcion3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion3ActionPerformed(evt);
            }
        });

        opcionCorrecta.add(jB_Opcion4);
        jB_Opcion4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion4ActionPerformed(evt);
            }
        });

        jTF_Opcion1.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion1.setText("Respuesta1");

        jTF_Opcion2.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion2.setText("Respuesta2");

        jTF_Opcion3.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion3.setText("Respuesta3");

        jTF_Opcion4.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion4.setText("Respuesta4");

        jB_Guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Guardar.setText("Guardar");
        jB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría:");

        jcb_USC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arte", "Entretenimiento", "Deportes", "Historia", "Geografía", "Ciencia" }));
        jcb_USC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_USCActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jm_volver.setText("Volver");
        jMenu1.add(jm_volver);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Guardar)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField_Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(jcb_USC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jB_Opcion1)
                                    .addComponent(jB_Opcion2)
                                    .addComponent(jB_Opcion3)
                                    .addComponent(jB_Opcion4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_Opcion1)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jB_Opcion3)
                                .addGap(9, 9, 9)
                                .addComponent(jB_Opcion4))
                            .addComponent(jB_Opcion2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_USC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PreguntaActionPerformed

    private void jB_Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Opcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Opcion1ActionPerformed

    private void jB_Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Opcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Opcion2ActionPerformed

    private void jB_Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Opcion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Opcion3ActionPerformed

    private void jB_Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Opcion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Opcion4ActionPerformed

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jcb_USCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_USCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_USCActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_EditUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_EditUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_EditUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_EditUS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vista_EditUS dialog = new Vista_EditUS(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_Guardar;
    public javax.swing.JRadioButton jB_Opcion1;
    public javax.swing.JRadioButton jB_Opcion2;
    public javax.swing.JRadioButton jB_Opcion3;
    public javax.swing.JRadioButton jB_Opcion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JTextField jTF_Opcion1;
    public javax.swing.JTextField jTF_Opcion2;
    public javax.swing.JTextField jTF_Opcion3;
    public javax.swing.JTextField jTF_Opcion4;
    public javax.swing.JTextField jTextField_Pregunta;
    public javax.swing.JComboBox<String> jcb_USC;
    public javax.swing.JMenuItem jm_volver;
    public static javax.swing.ButtonGroup opcionCorrecta;
    // End of variables declaration//GEN-END:variables
}

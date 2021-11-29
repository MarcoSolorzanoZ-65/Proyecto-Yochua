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
public class Vista_MS extends javax.swing.JDialog {

    /**
     * Creates new form Vista_MS
     */
    public Vista_MS(java.awt.Dialog parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField_Pregunta = new javax.swing.JTextField();
        jB_Añadir = new javax.swing.JButton();
        jTF_Opcion3 = new javax.swing.JTextField();
        jTF_Opcion4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcb_MSC = new javax.swing.JComboBox<>();
        jB_Opcion1 = new javax.swing.JRadioButton();
        jB_Opcion2 = new javax.swing.JRadioButton();
        jB_Opcion3 = new javax.swing.JRadioButton();
        jB_Opcion4 = new javax.swing.JRadioButton();
        jTF_Opcion1 = new javax.swing.JTextField();
        jTF_Opcion2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_volver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escriba una pregunta de tipo Multiple Selection:");

        jTextField_Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Pregunta.setText("Pregunta...");
        jTextField_Pregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_PreguntaMouseClicked(evt);
            }
        });

        jB_Añadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Añadir.setText("Añadir");
        jB_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AñadirActionPerformed(evt);
            }
        });

        jTF_Opcion3.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion3.setText("Respuesta3");
        jTF_Opcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTF_Opcion3MouseClicked(evt);
            }
        });

        jTF_Opcion4.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion4.setText("Respuesta4");
        jTF_Opcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTF_Opcion4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La o las respuestas correctas son:");

        jcb_MSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arte", "Entretenimiento", "Deportes" }));
        jcb_MSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_MSCActionPerformed(evt);
            }
        });

        jB_Opcion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion1ActionPerformed(evt);
            }
        });

        jB_Opcion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion2ActionPerformed(evt);
            }
        });

        jB_Opcion3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion3ActionPerformed(evt);
            }
        });

        jB_Opcion4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Opcion4ActionPerformed(evt);
            }
        });

        jTF_Opcion1.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion1.setText("Respuesta1");
        jTF_Opcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTF_Opcion1MouseClicked(evt);
            }
        });

        jTF_Opcion2.setForeground(new java.awt.Color(255, 255, 255));
        jTF_Opcion2.setText("Respuesta2");
        jTF_Opcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTF_Opcion2MouseClicked(evt);
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
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField_Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jB_Añadir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jTF_Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_MSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
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
                            .addComponent(jB_Opcion2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jTF_Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_MSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Añadir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_AñadirActionPerformed

    private void jcb_MSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_MSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_MSCActionPerformed

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

    private void jTextField_PreguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PreguntaMouseClicked
        jTextField_Pregunta.setText("");
    }//GEN-LAST:event_jTextField_PreguntaMouseClicked

    private void jTF_Opcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_Opcion1MouseClicked
        jTF_Opcion1.setText("");
    }//GEN-LAST:event_jTF_Opcion1MouseClicked

    private void jTF_Opcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_Opcion2MouseClicked
        jTF_Opcion2.setText("");
    }//GEN-LAST:event_jTF_Opcion2MouseClicked

    private void jTF_Opcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_Opcion3MouseClicked
        jTF_Opcion3.setText("");
    }//GEN-LAST:event_jTF_Opcion3MouseClicked

    private void jTF_Opcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_Opcion4MouseClicked
        jTF_Opcion4.setText("");
    }//GEN-LAST:event_jTF_Opcion4MouseClicked

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
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_MS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vista_MS dialog = new Vista_MS(new javax.swing.JDialog(), true);
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
    public javax.swing.JButton jB_Añadir;
    public javax.swing.JRadioButton jB_Opcion1;
    public javax.swing.JRadioButton jB_Opcion2;
    public javax.swing.JRadioButton jB_Opcion3;
    public javax.swing.JRadioButton jB_Opcion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JTextField jTF_Opcion1;
    public javax.swing.JTextField jTF_Opcion2;
    public javax.swing.JTextField jTF_Opcion3;
    public javax.swing.JTextField jTF_Opcion4;
    public javax.swing.JTextField jTextField_Pregunta;
    public javax.swing.JComboBox<String> jcb_MSC;
    public javax.swing.JMenuItem jm_volver;
    // End of variables declaration//GEN-END:variables
}

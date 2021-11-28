/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Controlers;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto.DAO.MS.Dao_MS;
import proyecto.DAO.TF.Dao_TF;
import proyecto.DAO.US.Dao_US;
import proyecto.Vistas.Vista_Añadir;
import proyecto.Vistas.Vista_EditTF;
import proyecto.Vistas.Vista_EditUS;
import proyecto.Vistas.Vista_EditMS;
import proyecto.Controlers.USEdit_Controler;
import proyecto.Vistas.Vista_MS;
import proyecto.Vistas.Vista_TF;
import proyecto.Vistas.Vista_US;
import proyecto.Vistas.Vista_Mostrar;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 14:33:08
 * @date 24 nov. 2021
 */
public class Mostrar_Controler implements ActionListener {

    private Vista_Mostrar vista;
    private Vista_TF vistaTF;
    private Vista_MS vistaMS;
    private Vista_US vistaUS;
    private Dao_TF modelo;
    private Dao_US modelo2;
    private Dao_MS modelo3;

    public Mostrar_Controler(Vista_Mostrar vista, Dao_TF modelo, Dao_US modelo2, Dao_MS modelo3) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.vista.jButtonMS.addActionListener(this);
        this.vista.jButtonTF.addActionListener(this);
        this.vista.jButtonUS.addActionListener(this);
        this.vista.jB_Delete.addActionListener(this);
        this.vista.jb_Editar.addActionListener(this);
        this.vista.jb_Mostrar.addActionListener(this);
        iniciarVista();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jButtonTF) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo.getLista().getQuestions());
        }
        if (e.getSource() == vista.jButtonUS) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo2.getLista().getQuestions());
        }
        if (e.getSource() == vista.jButtonMS) {
            vista.jTextArea1.setEditable(false);
            vista.jTextArea1.setText(modelo3.getLista().getQuestions());
        }
        if (e.getSource() == vista.jB_Delete) {
            String tipo = vista.jc_tipo.getSelectedItem().toString();
            if (tipo.equals("True Or False")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo.getLista().getLenght()) {
                        int seguro = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar?", "Eliminar",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (seguro == JOptionPane.YES_OPTION) {
                            modelo.eliminar(Integer.parseInt(vista.jText_NumPregunta.getText()));
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Unique Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo2.getLista().getLenght()) {
                        int seguro = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar?", "Eliminar",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (seguro == JOptionPane.YES_OPTION) {
                            modelo2.eliminar(Integer.parseInt(vista.jText_NumPregunta.getText()));
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Multiple Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo3.getLista().getLenght()) {
                        int seguro = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar?", "Eliminar",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (seguro == JOptionPane.YES_OPTION) {
                            modelo3.eliminar(Integer.parseInt(vista.jText_NumPregunta.getText()));
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            }

        }

        if (e.getSource() == vista.jb_Editar) {
            String tipo = vista.jc_tipo.getSelectedItem().toString();
            if (tipo.equals("True Or False")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo.getLista().getLenght()) {
                        Vista_EditTF vetf = new Vista_EditTF(vista, false);
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        TFEdit_Controler tfec = new TFEdit_Controler(vetf, modelo, index);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Unique Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo2.getLista().getLenght()) {
                        Vista_EditUS veus = new Vista_EditUS(vista, false);
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        USEdit_Controler usedit = new USEdit_Controler(veus, modelo2, index);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Multiple Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo3.getLista().getLenght()) {
                        Vista_EditMS vems = new Vista_EditMS(vista, false);
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        MSEdit_Controler usedit = new MSEdit_Controler(vems, modelo3, index);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            }
        }

        if (e.getSource() == vista.jb_Mostrar) {
            String tipo = vista.jc_tipo.getSelectedItem().toString();
            if (tipo.equals("True Or False")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo.getLista().getLenght()) {
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        JOptionPane.showMessageDialog(null, modelo.getLista().getElemento(index).mostrarDatos());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Unique Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo2.getLista().getLenght()) {
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        JOptionPane.showMessageDialog(null, modelo2.getLista().getElemento(index).mostrarDatos());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            } else if (tipo.equals("Multiple Selection")) {
                if (!"Numero de pregunta".equals(vista.jText_NumPregunta.getText())) {
                    if (Integer.parseInt(vista.jText_NumPregunta.getText()) < modelo3.getLista().getLenght()) {
                        int index = Integer.parseInt(vista.jText_NumPregunta.getText());
                        index--;
                        JOptionPane.showMessageDialog(null, modelo3.getLista().getElemento(index).mostrarDatos());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error ingrese un numero de pregunta valido");
                }
            }
        }
    }

    public void iniciarVista() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}

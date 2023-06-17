package VACANTES;

import ADMINISTRADOR.MenuAdministrador;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NuevaVacante extends JFrame implements ChangeListener {
    RellenarVacante rellenarVacante = new RellenarVacante();
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton EXPERIENCIARadioButton;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton PUBLICARVACANTEButton;
    private JButton REGRESARButton;
    private static ArrayList<Vacante> lista = new ArrayList<>();

    public NuevaVacante(){
        setupFrame();
        query1();
    }
    private void setupFrame(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(600, 300);
        addActionListeners();
        add(panel1);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (EXPERIENCIARadioButton.isSelected()) {
            textField3.setEnabled(false);
        }
    }

    private void addActionListeners(){
        PUBLICARVACANTEButton.addActionListener(new EventClick());
    }

    public class EventClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();

            if (opcion.equals("PUBLICAR VACANTE")) {
                String nombre_Vacante = textField1.getText();
                String numero_De_Vacantes = textField2.getText();
                String experiencia = textField3.getText();
                String fecha_De_Publicacion = textField4.getText();
                String sueldo_De_La_Vacante = textField5.getText();
                String descripcion = textField6.getText();

                lista.add(new Vacante(nombre_Vacante,numero_De_Vacantes,experiencia,fecha_De_Publicacion,sueldo_De_La_Vacante,descripcion));

                rellenarVacante.ingresar(rellenarVacante.getVacantes(),nombre_Vacante,numero_De_Vacantes,experiencia,fecha_De_Publicacion,sueldo_De_La_Vacante,descripcion);

                textField1.setText(" ");
                textField2.setText(" ");
                textField3.setText(" ");
                textField4.setText(" ");
                textField5.setText(" ");
                textField6.setText(" ");
            }
        }
    }

    private void query1(){
        REGRESARButton.addActionListener(e -> {
            MenuAdministrador menuAdministrador = new MenuAdministrador();
            menuAdministrador.setVisible(true);
            this.setVisible(false);
        });
    }
}

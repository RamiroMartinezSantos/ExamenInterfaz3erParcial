package REGISTROS;

import USUARIO.Usuario;
import USUARIOS.Usuarionormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegistrarUsuario extends JFrame{
    IngresarUsuarios ingresarUsuarios = new IngresarUsuarios();
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton REGISTRARSEButton;
    private JButton REGRESARButton;
    private static final ArrayList<Usuarionormal> lista = new ArrayList<>();

    public RegistrarUsuario(){
        setupFrame();
    }
    private void setupFrame(){
        setTitle("ESCOJA EL TIPO DE CONVERSION");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
        addActionListeners();
        query();
    }

    private void addActionListeners(){
        REGISTRARSEButton.addActionListener(new EventClick());
    }

    public class EventClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();

            if (opcion.equals("REGISTRARSE")) {
                String nombre_Completo = textField1.getText();
                String nivel_De_Estudios = textField2.getText();
                String edad = textField3.getText();
                String correo = textField4.getText();
                String telefono = textField5.getText();

                lista.add(new Usuarionormal(nombre_Completo,nivel_De_Estudios,edad,correo,telefono));

                ingresarUsuarios.ingresar(ingresarUsuarios.getUsuarionormals(),nombre_Completo,nivel_De_Estudios,edad,correo,telefono);

                textField1.setText(" ");
                textField2.setText(" ");
                textField3.setText(" ");
                textField4.setText(" ");
                textField5.setText(" ");
            }
        }
    }

    private void query(){
        REGRESARButton.addActionListener(e -> {
            Usuario usuario = new Usuario();
            usuario.setVisible(true);
            this.setVisible(false);
        });
    }

    public static ArrayList<Usuarionormal> getElemento(){
        return lista;
    }

}

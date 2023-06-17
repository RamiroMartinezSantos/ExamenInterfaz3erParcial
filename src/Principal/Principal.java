package Principal;

import ADMINISTRADOR.ComprobarAdmin;
import ADMINISTRADOR.MenuAdministrador;
import Imagen.MiImagen;
import USUARIO.Usuario;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame{
    private JPanel panel1;
    private JButton USUARIOButton;
    private JButton ADMINISTRADORButton;

    private MiImagen miImagen;

    public Principal(){
        setupFrame();
        query();
        query2();
        MiImagen miImagen = new MiImagen();
        this.miImagen = miImagen;

    }
    private void setupFrame(){
        setTitle("Menu principal");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }
    private void initFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(miImagen, BorderLayout.CENTER);
        setSize(400,600);
        setVisible(true);

    }


    private void query(){
        USUARIOButton.addActionListener(e -> {
            Usuario usuario = new Usuario();
            usuario.setVisible(true);
            this.setVisible(false);
        });
    }

    private void query2(){
        ADMINISTRADORButton.addActionListener(e -> {
            ComprobarAdmin comprobarAdmin = new ComprobarAdmin();
            comprobarAdmin.setVisible(true);
            this.setVisible(false);
        });
    }

}

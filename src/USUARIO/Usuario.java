package USUARIO;

import Principal.Principal;
import REGISTROS.RegistrarUsuario;

import javax.swing.*;
import java.awt.*;

public class Usuario extends JFrame{
    private JPanel panel1;
    private JButton REGISTRARUSUARIOButton;
    private JButton CONSULTARVACANTESButton;
    private JButton REGRESARALMENUButton;

    public Usuario(){
        setupFrame();
        query();
        query2();
        query3();
    }
    private void setupFrame(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }

    private void query(){
        REGISTRARUSUARIOButton.addActionListener(e -> {
            RegistrarUsuario registrarUsuario = new RegistrarUsuario();
            registrarUsuario.setVisible(true);
            this.setVisible(false);
        });
    }

    private void query2(){
        CONSULTARVACANTESButton.addActionListener(e -> {
            Usuario usuario = new Usuario();
            usuario.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query3(){
        REGRESARALMENUButton.addActionListener(e -> {
            Principal principal = new Principal();
            principal.setVisible(true);
            this.setVisible(false);
        });
    }
}


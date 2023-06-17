package ADMINISTRADOR;

import Principal.Principal;
import VACANTES.NuevaVacante;

import javax.swing.*;
import java.awt.*;

public class MenuAdministrador extends JFrame {
    private JPanel panel1;
    private JButton crearNuevaVacanteButton;
    private JButton REGRESARALMENUButton;
    private JButton CONSULTARLASPOSTULACIONESButton;
    private JButton CONSULTARVACANTESPUBLICADASButton;

    public MenuAdministrador(){
        setupFrame();
        query();
        query2();
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
        crearNuevaVacanteButton.addActionListener(e -> {
            NuevaVacante nuevaVacante = new NuevaVacante();
            nuevaVacante.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query2(){
        REGRESARALMENUButton.addActionListener(e -> {
            Principal principal = new Principal();
            principal.setVisible(true);
            this.setVisible(false);
        });
    }

/*
    private void query1(){
        consultarVacantesPublicadasButton.addActionListener(e -> {
            MostrarVacantesAdmin mostrarVacantesAdmin = new MostrarVacantesAdmin();
            mostrarVacantesAdmin.setVisible(true);
            this.setVisible(false);
        });
    }
*/
}

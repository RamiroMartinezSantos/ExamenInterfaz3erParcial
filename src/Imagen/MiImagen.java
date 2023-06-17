package Imagen;

import java.awt.*;

public class MiImagen extends Canvas {
    @Override
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("D:\\4TO SEMESTRE\\Paradigmas de Programacion\\Imagenes\\descargar.png");
        g.drawImage(image,100,100,this);
    }
}

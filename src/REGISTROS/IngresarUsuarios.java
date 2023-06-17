package REGISTROS;

import USUARIOS.Usuarionormal;

import java.util.ArrayList;

public class IngresarUsuarios {
    public ArrayList<Usuarionormal> usuarionormals;
    public IngresarUsuarios(){usuarionormals = new ArrayList<>();}
    public void ingresar(ArrayList<Usuarionormal> usuarionormals, String nombre_Completo, String nivel_De_Estudios, String edad, String correo, String telefono){
        usuarionormals.add(new Usuarionormal(nombre_Completo, nivel_De_Estudios, edad, correo, telefono));
    }
    public ArrayList<Usuarionormal> getUsuarionormals() {
        return usuarionormals;
    }
}

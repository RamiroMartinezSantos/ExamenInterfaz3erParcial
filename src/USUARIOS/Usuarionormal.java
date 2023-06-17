package USUARIOS;
public class Usuarionormal {
    String nombre_Completo;
    String nivel_De_Estudios;
    String edad;
    String correo;
    String telefono;

    public Usuarionormal(String nombre_Completo,String nivel_De_Estudios,String edad,String correo,String telefono){
        this.nombre_Completo = nombre_Completo;
        this.nivel_De_Estudios = nivel_De_Estudios;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return nombre_Completo + "nombre_Completo" + nivel_De_Estudios + "nivel_De_Estudios" + edad + "edad" + correo + "correo" + telefono + "telefono";
    }

    public String getNombre_Completo() {return nombre_Completo;}

    public String getNivel_De_Estudios() {return nivel_De_Estudios;}

    public String getEdad() {return edad;}

    public String getCorreo() {return correo;}

    public String getTelefono() {return telefono;}
}

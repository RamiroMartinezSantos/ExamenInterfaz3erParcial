package VACANTES;

public class Vacante {
    String nombre_Vacante;
    String numero_De_Vacantes;
    String experiencia;
    String fecha_De_Publicacion;
    String sueldo_De_La_Vacante;
    String descripcion;


    public Vacante(String nombre_Vacante, String numero_De_Vacantes, String experiencia, String fecha_De_Publicacion, String sueldo_De_La_Vacante, String descripcion){
        this.nombre_Vacante = nombre_Vacante;
        this.numero_De_Vacantes = numero_De_Vacantes;
        this.experiencia = experiencia;
        this.fecha_De_Publicacion = fecha_De_Publicacion;
        this.sueldo_De_La_Vacante = sueldo_De_La_Vacante;
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return nombre_Vacante + "nombre_Vacante" + numero_De_Vacantes + "numero_De_Vacantes" + experiencia + "experiencia"+ fecha_De_Publicacion + "fecha_De_Publicacion" + sueldo_De_La_Vacante + "sueldo_De_La_Vacante" + descripcion + "descripcion";
    }

    public String getNombre_Vacante() {
        return nombre_Vacante;
    }

    public String getNumero_De_Vacantes() {
        return numero_De_Vacantes;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String getFecha_De_Publicacion() {
        return fecha_De_Publicacion;
    }

    public String getSueldo_De_La_Vacante() {
        return sueldo_De_La_Vacante;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

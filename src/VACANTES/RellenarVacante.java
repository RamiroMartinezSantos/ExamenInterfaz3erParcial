package VACANTES;

import java.util.ArrayList;

public class RellenarVacante {
    public ArrayList<Vacante> vacantes;
    public RellenarVacante(){vacantes = new ArrayList<>();}
    public void ingresar(ArrayList<Vacante> vacantes, String nombre_Vacante, String numero_De_Vacantes, String experiencia, String fecha_De_Publicacion, String sueldo_De_La_Vacante, String descripcion){
        vacantes.add(new Vacante(nombre_Vacante, numero_De_Vacantes,experiencia,  fecha_De_Publicacion,  sueldo_De_La_Vacante,  descripcion));
    }
    public ArrayList<Vacante> getVacantes() {
        return vacantes;
    }
}

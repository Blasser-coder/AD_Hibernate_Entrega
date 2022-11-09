import dao.AlumnoDAO_Imp;
import models.Alumno;

public class App {

    public static void main(String[] args) {
        AlumnoDAO_Imp adi = new AlumnoDAO_Imp();
        Alumno a = adi.Consultar(0L);
    }



}

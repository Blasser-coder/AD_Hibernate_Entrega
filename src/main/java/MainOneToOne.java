import dao.AlumnoDAO_Imp;
import dao.ConfVisualDAO_Imp;
import models.Alumno;
import models.ConfigVisual;

public class MainOneToOne {
    public static void main(String[] args) {
        //OneToOne: Añadir en ambas entidades, y find de un objeto de
        // ambas entidades donde se vea que la relación definida
        // bidireccionalmente funciona.

        AlumnoDAO_Imp Adi = new AlumnoDAO_Imp();
        ConfVisualDAO_Imp CVdi = new ConfVisualDAO_Imp();

        Alumno Alu1 = new Alumno(null, "Alvaro","Zorrilla Garcia", "alvarozorrilla2003@gmail.com", "606859114");
        ConfigVisual cfgAlu1 = new ConfigVisual(null, false, false, false);

        Adi.Crear(Alu1);
        cfgAlu1.setAlumno_Config(Alu1);
        CVdi.Crear(cfgAlu1);

        AlumnoDAO_Imp AdiFind = new AlumnoDAO_Imp();
        ConfVisualDAO_Imp CVdiFind = new ConfVisualDAO_Imp();
        ConfigVisual CFFind = CVdiFind.Consultar(1l);
        Alumno AlFind = AdiFind.Consultar(1L);
        System.out.println(CFFind.toString());
        System.out.println(AlFind.toString());
    }
}

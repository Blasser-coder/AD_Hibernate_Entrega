import dao.AlumnoDAO_Imp;
import dao.CursoDAO_Imp;
import models.Alumno;
import models.Curso;

import java.util.ArrayList;
import java.util.List;

public class MainManyToMany {
    public static void main(String[] args) {
        //ManyToMany: Añadir en ambas entidades, añadir en la tabla intermedia
        // y find de un objeto de ambas entidades donde se vea que la relación
        // definida bidireccionalmente funciona.

        AlumnoDAO_Imp Adi = new AlumnoDAO_Imp();
        CursoDAO_Imp Cdi = new CursoDAO_Imp();
        List<Alumno> Alumnos = new ArrayList<>();
        Alumno Alu1 = new Alumno(null, "Alvaro1231412","Zorrilla Garcia", "alvarozorrilla2003@gmail.com", "606859114");
        Curso c = new Curso(null, "Bases de datos", 10, 8);
        c.AniadirAlumnoACurso(Alu1);
        Cdi.Crear(c);

        AlumnoDAO_Imp AdiFind = new AlumnoDAO_Imp();
        CursoDAO_Imp CdiFind = new CursoDAO_Imp();
        Alumno aFind = AdiFind.Consultar(9L);
        Curso cFind = CdiFind.Consultar(19L);
        System.out.println(aFind.toString());
        System.out.println(cFind.toString());

    }
}

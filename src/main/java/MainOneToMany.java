import dao.AlumnoDAO_Imp;
import dao.ConfVisualDAO_Imp;
import dao.CursoDAO_Imp;
import dao.ProfesorDAO_Imp;
import models.Curso;
import models.Profesor;

import java.util.ArrayList;
import java.util.List;

public class MainOneToMany {
    public static void main(String[] args) {
        // OneToMany: Añadir en ambas entidades, y find de un objeto de
        // ambas entidades donde se vea que la relación definida
        // bidireccionalmente funciona.

        ProfesorDAO_Imp Pdi = new ProfesorDAO_Imp();
        CursoDAO_Imp Cdi = new CursoDAO_Imp();
        List<Curso> CursosGemma = new ArrayList<>();

        Profesor p = new Profesor(null, "Gemma", "Romero Gil", "gemma@jesuitasformacion.org", "Jtu");
        Pdi.Crear(p);

        Curso c = new Curso(null, "Bases de datos", 10, 8);
        c.setProfesor_Curso(p);
        Cdi.Crear(c);
        Curso c2 = new Curso(null, "Seguridad Informatica", 10, 8);
        c2.setProfesor_Curso(p);
        p.setCursos_Profesor(CursosGemma);
        Cdi.Crear(c2);

        ProfesorDAO_Imp PdiFind = new ProfesorDAO_Imp();
        CursoDAO_Imp CdiFind = new CursoDAO_Imp();
        Profesor pFind = PdiFind.Consultar(3L);
        Curso cFind = CdiFind.Consultar(3L);
        System.out.println(pFind.toString());
        System.out.println(cFind.toString());

    }
}

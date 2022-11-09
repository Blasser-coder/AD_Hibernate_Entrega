package dao;

import idao.IAlumnoDAO;
import models.Alumno;

public class AlumnoDAO_Imp extends Dao<Alumno, Long> implements IAlumnoDAO {
    @Override
    public Alumno Consultar(Long id) {
        Alumno a = (Alumno) em.find(Alumno.class, id);
        return a;
    }
}

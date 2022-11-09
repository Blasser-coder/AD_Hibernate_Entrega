package dao;

import idao.IProfesorDAO;
import models.Profesor;

public class ProfesorDAO_Imp extends Dao<Profesor, Long> implements IProfesorDAO {
    @Override
    public Profesor Consultar(Long id) {
        Profesor p = (Profesor) em.find(Profesor.class, id);
        return p;
    }
}

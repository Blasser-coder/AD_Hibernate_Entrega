package dao;

import idao.ICursoDAO;
import models.Curso;

public class CursoDAO_Imp extends Dao<Curso, Long> implements ICursoDAO {
    @Override
    public Curso Consultar(Long id) {
        Curso c = (Curso) em.find(Curso.class, id);
        return c;
    }
}

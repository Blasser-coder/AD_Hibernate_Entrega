package dao;

import idao.IConfVisualDAO;
import models.ConfigVisual;

public class ConfVisualDAO_Imp extends Dao<ConfigVisual, Long> implements IConfVisualDAO {
    @Override
    public ConfigVisual Consultar(Long id) {
        ConfigVisual c = (ConfigVisual) em.find(ConfigVisual.class, id);
        return c;
    }
}

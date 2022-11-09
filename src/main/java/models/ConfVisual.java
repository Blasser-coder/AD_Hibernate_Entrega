package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class ConfVisual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Conf", nullable = false)
    private long ID_Conf;

    @NotNull
    private boolean Conf_ModoOscuro;

    @NotNull
    private boolean Conf_RecibirCorreos;

    @NotNull
    private boolean Conf_SilenciarNotificaciones;

    @OneToOne
    @JoinColumn(name = "ID_Alumno")
    private Alumno Alumno;

    public ConfVisual(long ID, boolean conf_ModoOscuro, boolean conf_RecibirCorreos, boolean conf_SilenciarNotificaciones, models.Alumno alumno) {
        this.ID_Conf = ID;
        Conf_ModoOscuro = conf_ModoOscuro;
        Conf_RecibirCorreos = conf_RecibirCorreos;
        Conf_SilenciarNotificaciones = conf_SilenciarNotificaciones;
        Alumno = alumno;
    }

    public ConfVisual() {}

    public long getID_Conf() {
        return ID_Conf;
    }

    public void setID_Conf(long ID_Conf) {
        this.ID_Conf = ID_Conf;
    }

    public boolean isConf_ModoOscuro() {
        return Conf_ModoOscuro;
    }

    public void setConf_ModoOscuro(boolean conf_ModoOscuro) {
        Conf_ModoOscuro = conf_ModoOscuro;
    }

    public boolean isConf_RecibirCorreos() {
        return Conf_RecibirCorreos;
    }

    public void setConf_RecibirCorreos(boolean conf_RecibirCorreos) {
        Conf_RecibirCorreos = conf_RecibirCorreos;
    }

    public boolean isConf_SilenciarNotificaciones() {
        return Conf_SilenciarNotificaciones;
    }

    public void setConf_SilenciarNotificaciones(boolean conf_SilenciarNotificaciones) {
        Conf_SilenciarNotificaciones = conf_SilenciarNotificaciones;
    }

    public models.Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(models.Alumno alumno) {
        Alumno = alumno;
    }

    @Override
    public String toString() {
        return "ConfVisual{" +
                "ID=" + ID_Conf +
                ", Conf_ModoOscuro=" + Conf_ModoOscuro +
                ", Conf_RecibirCorreos=" + Conf_RecibirCorreos +
                ", Conf_SilenciarNotificaciones=" + Conf_SilenciarNotificaciones +
                ", Alumno=" + Alumno +
                '}';
    }
}

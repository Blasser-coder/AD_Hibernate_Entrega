package models;

import jakarta.persistence.*;

@Entity
public class ConfigVisual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Config", nullable = false)
    private Long ID_Config;

    @OneToOne(optional = false)
    @JoinColumn(name = "Alumno_ID", referencedColumnName = "ID_Alumno")
    private Alumno Alumno_Config;

    @Column(name = "ModoOscuro_Config")
    private boolean ModoOscuro_Config;

    @Column(name = "RecibirCorreos_Config")
    private boolean RecibirCorreos_Config;

    @Column(name = "SilenciarNotificaciones_Config")
    private boolean SilenciarNotificaciones_Config;


    public ConfigVisual() {}

    public ConfigVisual(Long ID_Config, boolean modoOscuro_Config, boolean recibirCorreos_Config, boolean silenciarNotificaciones_Config) {
        this.ID_Config = ID_Config;
        ModoOscuro_Config = modoOscuro_Config;
        RecibirCorreos_Config = recibirCorreos_Config;
        SilenciarNotificaciones_Config = silenciarNotificaciones_Config;
    }

    public ConfigVisual(boolean modoOscuro_Config, boolean recibirCorreos_Config, boolean silenciarNotificaciones_Config) {
        ModoOscuro_Config = modoOscuro_Config;
        RecibirCorreos_Config = recibirCorreos_Config;
        SilenciarNotificaciones_Config = silenciarNotificaciones_Config;
    }

    public Long getID_Config() {
        return ID_Config;
    }

    public void setID_Config(Long ID_Config) {
        this.ID_Config = ID_Config;
    }

    public boolean isModoOscuro_Config() {
        return ModoOscuro_Config;
    }

    public void setModoOscuro_Config(boolean modoOscuro_Config) {
        ModoOscuro_Config = modoOscuro_Config;
    }

    public boolean isRecibirCorreos_Config() {
        return RecibirCorreos_Config;
    }

    public void setRecibirCorreos_Config(boolean recibirCorreos_Config) {
        RecibirCorreos_Config = recibirCorreos_Config;
    }

    public boolean isSilenciarNotificaciones_Config() {
        return SilenciarNotificaciones_Config;
    }

    public void setSilenciarNotificaciones_Config(boolean silenciarNotificaciones_Config) {
        SilenciarNotificaciones_Config = silenciarNotificaciones_Config;
    }

    public Alumno getAlumno_Config() {
        return Alumno_Config;
    }

    public void setAlumno_Config(Alumno alumno_Config) {
        Alumno_Config = alumno_Config;
    }

    @Override
    public String toString() {
        return "ConfigVisual{" +
                "ID_Config=" + ID_Config +
                ", ModoOscuro_Config=" + ModoOscuro_Config +
                ", RecibirCorreos_Config=" + RecibirCorreos_Config +
                ", SilenciarNotificaciones_Config=" + SilenciarNotificaciones_Config +
                '}';
    }
}

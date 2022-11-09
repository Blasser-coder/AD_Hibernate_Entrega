package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class ConfVisual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Conf", nullable = false)
    private long ID;

    @NotNull
    private boolean Conf_ModoOscuro;

    @NotNull
    private boolean Conf_RecibirCorreos;

    @NotNull
    private boolean Conf_SilenciarNotificaciones;

    @OneToOne(optional = false)
    @JoinColumn(name = "ID_Alumno", referencedColumnName = "ID_Alumno")
    private Alumno Alumno;
}

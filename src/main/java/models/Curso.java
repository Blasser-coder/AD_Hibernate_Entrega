package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Curso", nullable = false)
    private Long ID;

    @NotNull
    private String Tipo_Curso;

    @NotNull
    private int Num_Asignaturas;

    @NotNull
    private int Num_Alumnos;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_Profesor", referencedColumnName = "ID_Profesor")
    private Profesor profesor;

    public Curso(Long ID, String tipo_Curso, int num_Asignaturas, int num_Alumnos, Profesor profesor) {
        this.ID = ID;
        Tipo_Curso = tipo_Curso;
        Num_Asignaturas = num_Asignaturas;
        Num_Alumnos = num_Alumnos;
        this.profesor = profesor;
    }

    public Curso() {}

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTipo_Curso() {
        return Tipo_Curso;
    }

    public void setTipo_Curso(String tipo_Curso) {
        Tipo_Curso = tipo_Curso;
    }

    public int getNum_Asignaturas() {
        return Num_Asignaturas;
    }

    public void setNum_Asignaturas(int num_Asignaturas) {
        Num_Asignaturas = num_Asignaturas;
    }

    public int getNum_Alumnos() {
        return Num_Alumnos;
    }

    public void setNum_Alumnos(int num_Alumnos) {
        Num_Alumnos = num_Alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "ID=" + ID +
                ", Tipo_Curso='" + Tipo_Curso + '\'' +
                ", Num_Asignaturas=" + Num_Asignaturas +
                ", Num_Alumnos=" + Num_Alumnos +
                ", profesor=" + profesor +
                '}';
    }
}

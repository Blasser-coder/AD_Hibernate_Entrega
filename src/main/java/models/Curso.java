package models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Curso", nullable = false)
    private Long ID_Curso;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Profesor_ID",  referencedColumnName = "ID_Profesor")
    private Profesor Profesor_Curso;

    @ManyToMany
    @JoinTable(name = "Cursos_Alumnos",
            joinColumns = @JoinColumn(name = "ID_Curso", referencedColumnName = "ID_Curso"),
            inverseJoinColumns = @JoinColumn(name = "ID_Alumno", referencedColumnName = "ID_Alumno"))
    private List<Alumno> Alumnos_En_Cursos;

    @Column(name = "Tipo_Curso")
    private String Tipo_Curso;

    @Column(name = "Alumnos_Curso")
    private int Alumnos_Curso;

    @Column(name = "Asignaturas_Curso")
    private int Asignaturas_Curso;

    public Curso() {}

    public Curso(Long ID_Curso, String tipo_Curso, int alumnos_Curso, int asignaturas_Curso) {
        this.ID_Curso = ID_Curso;
        Tipo_Curso = tipo_Curso;
        Alumnos_Curso = alumnos_Curso;
        Asignaturas_Curso = asignaturas_Curso;
    }

    public Curso(String tipo_Curso, int alumnos_Curso, int asignaturas_Curso) {
        Tipo_Curso = tipo_Curso;
        Alumnos_Curso = alumnos_Curso;
        Asignaturas_Curso = asignaturas_Curso;
    }

    public Long getID_Curso() {
        return ID_Curso;
    }

    public void setID_Curso(Long ID_Curso) {
        this.ID_Curso = ID_Curso;
    }

    public Profesor getProfesor_Curso() {
        return Profesor_Curso;
    }

    public void setProfesor_Curso(Profesor profesor_Curso) {
        Profesor_Curso = profesor_Curso;
    }

    public void AniadirAlumnoACurso(Alumno a){ this.Alumnos_En_Cursos.add(a); }

    public String getTipo_Curso() {
        return Tipo_Curso;
    }

    public void setTipo_Curso(String tipo_Curso) {
        Tipo_Curso = tipo_Curso;
    }

    public int getAlumnos_Curso() {
        return Alumnos_Curso;
    }

    public void setAlumnos_Curso(int alumnos_Curso) {
        Alumnos_Curso = alumnos_Curso;
    }

    public int getAsignaturas_Curso() {
        return Asignaturas_Curso;
    }

    public void setAsignaturas_Curso(int asignaturas_Curso) {
        Asignaturas_Curso = asignaturas_Curso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "ID_Curso=" + ID_Curso +
                ", Profesor_Curso=" + Profesor_Curso +
                ", Tipo_Curso='" + Tipo_Curso + '\'' +
                ", Alumnos_Curso=" + Alumnos_Curso +
                ", Asignaturas_Curso=" + Asignaturas_Curso +
                '}';
    }
}

package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import org.hibernate.annotations.NotFound;

import java.util.List;

@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Profesor", nullable = false)
    private Long id;

    @NotNull
    private String Nombre_Profesor;

    @NotNull
    private String Apellido_Profesor;

    @NotNull
    private String Email_Profesor;

    @NotNull
    private String Centro_Profesor;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    private List<Curso> Cursos_Profesor;

    public Profesor(Long id, String nombre_Profesor, String apellido_Profesor, String email_Profesor, String centro_Profesor, List<Curso> cursos_Profesor) {
        this.id = id;
        Nombre_Profesor = nombre_Profesor;
        Apellido_Profesor = apellido_Profesor;
        Email_Profesor = email_Profesor;
        Centro_Profesor = centro_Profesor;
        Cursos_Profesor = cursos_Profesor;
    }

    public Profesor() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_Profesor() {
        return Nombre_Profesor;
    }

    public void setNombre_Profesor(String nombre_Profesor) {
        Nombre_Profesor = nombre_Profesor;
    }

    public String getApellido_Profesor() {
        return Apellido_Profesor;
    }

    public void setApellido_Profesor(String apellido_Profesor) {
        Apellido_Profesor = apellido_Profesor;
    }

    public String getEmail_Profesor() {
        return Email_Profesor;
    }

    public void setEmail_Profesor(String email_Profesor) {
        Email_Profesor = email_Profesor;
    }

    public String getCentro_Profesor() {
        return Centro_Profesor;
    }

    public void setCentro_Profesor(String centro_Profesor) {
        Centro_Profesor = centro_Profesor;
    }

    public List<Curso> getCursos_Profesor() {
        return Cursos_Profesor;
    }

    public void setCursos_Profesor(List<Curso> cursos_Profesor) {
        Cursos_Profesor = cursos_Profesor;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", Nombre_Profesor='" + Nombre_Profesor + '\'' +
                ", Apellido_Profesor='" + Apellido_Profesor + '\'' +
                ", Email_Profesor='" + Email_Profesor + '\'' +
                ", Centro_Profesor='" + Centro_Profesor + '\'' +
                '}';
    }
}

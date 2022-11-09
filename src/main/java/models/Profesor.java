package models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Profesor", nullable = false)
    private Long ID_Profesor;

    @OneToMany(mappedBy = "Profesor_Curso", fetch = FetchType.LAZY)
    private List<Curso> Cursos_Profesor = new java.util.ArrayList<>();

    @Column(name = "Nombre_Profresor")
    private String Nombre_Profesor;

    @Column(name = "Apellido_Profesor")
    private String Apellido_Profesor;

    @Column(name = "Email_Profesor")
    private String Email_Profesor;

    @Column(name = "CodCentro_Profesor")
    private String CodCentro_Profesor;

    public Profesor() {}

    public Profesor(Long ID_Profesor, String nombre_Profesor, String apellido_Profesor, String email_Profesor, String codCentro_Profesor) {
        this.ID_Profesor = ID_Profesor;
        Nombre_Profesor = nombre_Profesor;
        Apellido_Profesor = apellido_Profesor;
        Email_Profesor = email_Profesor;
        CodCentro_Profesor = codCentro_Profesor;
    }

    public Profesor(String nombre_Profesor, String apellido_Profesor, String email_Profesor, String codCentro_Profesor) {
        Nombre_Profesor = nombre_Profesor;
        Apellido_Profesor = apellido_Profesor;
        Email_Profesor = email_Profesor;
        CodCentro_Profesor = codCentro_Profesor;
    }

    public Long getID_Profesor() {
        return ID_Profesor;
    }

    public void setID_Profesor(Long ID_Profesor) {
        this.ID_Profesor = ID_Profesor;
    }

    public List<Curso> getCursos_Profesor() {
        return Cursos_Profesor;
    }

    public void setCursos_Profesor(List<Curso> cursos_Profesor) {
        Cursos_Profesor = cursos_Profesor;
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

    public String getCodCentro_Profesor() {
        return CodCentro_Profesor;
    }

    public void setCodCentro_Profesor(String codCentro_Profesor) {
        CodCentro_Profesor = codCentro_Profesor;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "ID_Profesor=" + ID_Profesor +
                ", Cursos_Profesor=" + Cursos_Profesor +
                ", Nombre_Profesor='" + Nombre_Profesor + '\'' +
                ", Apellido_Profesor='" + Apellido_Profesor + '\'' +
                ", Email_Profesor='" + Email_Profesor + '\'' +
                ", CodCentro_Profesor='" + CodCentro_Profesor + '\'' +
                '}';
    }
}

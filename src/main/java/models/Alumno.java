package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Alumno", nullable = false)
    private long ID_Alumno;

    @NotNull
    private String Al_Nombre;

    @NotNull
    private String Al_Apellidos;

    @NotNull
    private int Al_Edad;

    @NotNull
    private String Al_Email;

    @NotNull
    private String Al_Telefono;

    /*Valorar si renta hacer relacion con cursos..*/
   /* @NotNull
    private String Al_Email;*/

    public Alumno(long ID_Alumno, String al_Nombre, String al_Apellidos, int al_Edad, String al_Email, String al_Telefono) {
        this.ID_Alumno = ID_Alumno;
        Al_Nombre = al_Nombre;
        Al_Apellidos = al_Apellidos;
        Al_Edad = al_Edad;
        Al_Email = al_Email;
        Al_Telefono = al_Telefono;
    }

    public Alumno() {}

    public long getID_Alumno() {
        return ID_Alumno;
    }

    public void setID_Alumno(long ID_Alumno) {
        this.ID_Alumno = ID_Alumno;
    }

    public String getAl_Nombre() {
        return Al_Nombre;
    }

    public void setAl_Nombre(String al_Nombre) {
        Al_Nombre = al_Nombre;
    }

    public String getAl_Apellidos() {
        return Al_Apellidos;
    }

    public void setAl_Apellidos(String al_Apellidos) {
        Al_Apellidos = al_Apellidos;
    }

    public int getAl_Edad() {
        return Al_Edad;
    }

    public void setAl_Edad(int al_Edad) {
        Al_Edad = al_Edad;
    }

    public String getAl_Email() {
        return Al_Email;
    }

    public void setAl_Email(String al_Email) {
        Al_Email = al_Email;
    }

    public String getAl_Telefono() {
        return Al_Telefono;
    }

    public void setAl_Telefono(String al_Telefono) {
        Al_Telefono = al_Telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "ID_Alumno=" + ID_Alumno +
                ", Al_Nombre='" + Al_Nombre + '\'' +
                ", Al_Apellidos='" + Al_Apellidos + '\'' +
                ", Al_Edad=" + Al_Edad +
                ", Al_Email='" + Al_Email + '\'' +
                ", Al_Telefono='" + Al_Telefono + '\'' +
                '}';
    }
}

package models;

import jakarta.persistence.*;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Alumno", nullable = false)
    private Long ID_Alumno;

    @OneToOne(mappedBy = "Alumno_Config")
    private ConfigVisual Configuracion_Alumno;

    @Column(name = "Nombre_Alumno")
    private String Nombre_Alumno;

    @Column(name = "Apellido_Alumno")
    private String Apellido_Alumno;

    @Column(name = "Email_Alumno")
    private String Email_Alumno;

    @Column(name = "TLFN_Alumno")
    private String TLFN_Alumno;

    public Alumno() {}

    public Alumno(Long ID_Alumno, String nombre_Alumno, String apellido_Alumno, String email_Alumno, String TLFN_Alumno) {
        this.ID_Alumno = ID_Alumno;
        Nombre_Alumno = nombre_Alumno;
        Apellido_Alumno = apellido_Alumno;
        Email_Alumno = email_Alumno;
        this.TLFN_Alumno = TLFN_Alumno;
    }

    public Alumno(String nombre_Alumno, String apellido_Alumno, String email_Alumno, String TLFN_Alumno) {
        Nombre_Alumno = nombre_Alumno;
        Apellido_Alumno = apellido_Alumno;
        Email_Alumno = email_Alumno;
        this.TLFN_Alumno = TLFN_Alumno;
    }

    public Long getID_Alumno() {
        return ID_Alumno;
    }

    public void setID_Alumno(Long ID_Alumno) {
        this.ID_Alumno = ID_Alumno;
    }

    public String getNombre_Alumno() {
        return Nombre_Alumno;
    }

    public void setNombre_Alumno(String nombre_Alumno) {
        Nombre_Alumno = nombre_Alumno;
    }

    public String getApellido_Alumno() {
        return Apellido_Alumno;
    }

    public void setApellido_Alumno(String apellido_Alumno) {
        Apellido_Alumno = apellido_Alumno;
    }

    public String getEmail_Alumno() {
        return Email_Alumno;
    }

    public void setEmail_Alumno(String email_Alumno) {
        Email_Alumno = email_Alumno;
    }

    public String getTLFN_Alumno() {
        return TLFN_Alumno;
    }

    public void setTLFN_Alumno(String TLFN_Alumno) {
        this.TLFN_Alumno = TLFN_Alumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "ID_Alumno=" + ID_Alumno +
                ", Nombre_Alumno='" + Nombre_Alumno + '\'' +
                ", Apellido_Alumno='" + Apellido_Alumno + '\'' +
                ", Email_Alumno='" + Email_Alumno + '\'' +
                ", TLFN_Alumno='" + TLFN_Alumno + '\'' +
                '}';
    }
}

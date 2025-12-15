package Modelo;

import java.io.Serializable;

// Clase para representar a un Alumno (Tesista)
public class Alumno implements Serializable {
    
    // Atributos (Variables)
    private String codigo; // Podría ser la clave primaria (PK)
    private String nombres;
    private String apellidos;
    private String email;
    private int idTesis; // Clave foránea (FK) que apunta a la tesis asociada

    // Constructor Vacío
    public Alumno() {
    }

    // Constructor Completo
    public Alumno(String codigo, String nombres, String apellidos, String email, int idTesis) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.idTesis = idTesis;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombres=" + nombres + '}';
    }
}
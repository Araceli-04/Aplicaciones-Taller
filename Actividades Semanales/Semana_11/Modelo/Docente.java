package Modelo;

import java.io.Serializable;

// Clase para representar a un Docente (Asesor/Jurado)
public class Docente implements Serializable {
    
    // Atributos
    private int idDocente; // Clave primaria (PK)
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String cargo; // Ejemplo: 'Asesor', 'Presidente Jurado', 'Secretario'

    // Constructor Vacío
    public Docente() {
    }

    // Constructor Completo
    public Docente(int idDocente, String nombres, String apellidos, String especialidad, String cargo) {
        this.idDocente = idDocente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.cargo = cargo;
    }

    // Getters y Setters
    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Docente{" + "idDocente=" + idDocente + ", nombres=" + nombres + ", cargo=" + cargo + '}';
    }
}
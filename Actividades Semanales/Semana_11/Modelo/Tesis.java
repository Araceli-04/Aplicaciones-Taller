package Modelo;

import java.io.Serializable;

// Esta clase representa la tabla Tesis en tu base de datos (Entidad)
public class Tesis implements Serializable {
    
    // 1. Atributos (Representan las columnas de tu tabla)
    private int idTesis;
    private String titulo;
    private String autor;
    private int anio;
    private String estado; // Ejemplo: 'Pendiente', 'Aprobada', 'Rechazada'

    // 2. Constructor Vacío (Obligatorio en muchas frameworks de persistencia)
    public Tesis() {
    }

    // 3. Constructor con Todos los Parámetros
    public Tesis(int idTesis, String titulo, String autor, int anio, String estado) {
        this.idTesis = idTesis;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.estado = estado;
    }

    // 4. Métodos Getters y Setters (Para acceder y modificar los atributos)

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Opcional: Sobrescribir toString() para facilitar la depuración
    @Override
    public String toString() {
        return "Tesis{" + "idTesis=" + idTesis + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
}
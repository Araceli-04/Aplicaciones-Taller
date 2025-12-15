package Modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private int idUsuario;
    private String nombreUsuario; // El campo que se usa para iniciar sesión
    private String clave;
    private String rol; // Ejemplo: 'Administrador', 'Docente', 'Alumno'

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String clave, String rol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.rol = rol;
    }

    // Getters y Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
package Modelo;

import java.io.Serializable;
import java.util.Date; // Necesitas importar Date

public class Evaluacion implements Serializable {
    
    private int idEvaluacion;
    private int idTesis; // FK a la tesis evaluada
    private int idDocente; // FK al docente que evalúa
    private Date fechaEvaluacion;
    private String dictamen; // Ejemplo: 'Aprobado', 'Observaciones', 'Rechazado'
    private String comentario;

    public Evaluacion() {
    }

    // Constructor, Getters y Setters
    public Evaluacion(int idEvaluacion, int idTesis, int idDocente, Date fechaEvaluacion, String dictamen, String comentario) {
        this.idEvaluacion = idEvaluacion;
        this.idTesis = idTesis;
        this.idDocente = idDocente;
        this.fechaEvaluacion = fechaEvaluacion;
        this.dictamen = dictamen;
        this.comentario = comentario;
    }
    
    // ... (Debes generar los métodos Getters y Setters para todos los atributos) ...
}
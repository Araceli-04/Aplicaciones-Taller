package Modelo;

public class Pasaje {
    private String turno;
    private int cantidad;

    public Pasaje(String turno, int cantidad) {
        this.turno = turno;
        this.cantidad = cantidad;
    }

    // Precio unitario (ambos turnos igual, pero lo dejamos por si cambia)
    public double precioUnitario() {
        return 37.5;
    }

    public double calcularImporteCompra() {
        return cantidad * precioUnitario();
    }

    public double calcularDescuento() {
        double importe = calcularImporteCompra();
        double porc = (cantidad >= 15) ? 0.08 : 0.05;
        return importe * porc;
    }

    public double calcularImportePagar() {
        return calcularImporteCompra() - calcularDescuento();
    }

    public int calcularCaramelos() {
        double importePagar = calcularImportePagar();
        if (importePagar > 200.0) {
            return cantidad * 2;
        } else {
            return 0;
        }
    }

    // getters si los necesitas
    public String getTurno() { return turno; }
    public int getCantidad() { return cantidad; }
}


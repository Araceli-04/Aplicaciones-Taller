package Modelo;

public class Feria {
    private double montoTotal;

    public Feria(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double calcularAlquiler() {
        return montoTotal * 0.23;
    }

    public double calcularPublicidad() {
        return montoTotal * 0.07;
    }

    public double calcularTransporte() {
        return montoTotal * 0.26;
    }

    public double calcularServicios() {
        return montoTotal * 0.12;
    }

    public double calcularDecoracion() {
        return montoTotal * 0.21;
    }

    public double calcularGastosVarios() {
        return montoTotal * 0.11;
    }
}

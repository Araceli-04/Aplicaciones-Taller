package Modelo;

public class Empleado {
    private String categoria;
    private int horasTrabajadas;
    private int numHijos;

    public Empleado(String categoria, int horasTrabajadas, int numHijos) {
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
        this.numHijos = numHijos;
    }

    public double calcularSueldoBasico() {
        double tarifa = (categoria.equalsIgnoreCase("A")) ? 45.0 : 37.5;
        return horasTrabajadas * tarifa;
    }

    public double calcularBonificacion() {
        if (numHijos <= 3) {
            return numHijos * 40.5;
        } else {
            return numHijos * 35.0;
        }
    }

    public double calcularSueldoBruto() {
        return calcularSueldoBasico() + calcularBonificacion();
    }

    public double calcularDescuento() {
        double sueldoBruto = calcularSueldoBruto();
        double porc = (sueldoBruto >= 3500) ? 0.135 : 0.10;
        return sueldoBruto * porc;
    }

    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularDescuento();
    }
}


package Modelo;

public class Camisa {
    private double precio;
    private int cantidad;

    public Camisa(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularImporteCompra() {
        return precio * cantidad;
    }

    public double calcularPrimerDescuento() {
        return calcularImporteCompra() * 0.07;
    }

    public double calcularSegundoDescuento() {
        return (calcularImporteCompra() - calcularPrimerDescuento()) * 0.07;
    }

    public double calcularDescuentoTotal() {
        return calcularPrimerDescuento() + calcularSegundoDescuento();
    }

    public double calcularImportePagar() {
        return calcularImporteCompra() - calcularDescuentoTotal();
    }
}


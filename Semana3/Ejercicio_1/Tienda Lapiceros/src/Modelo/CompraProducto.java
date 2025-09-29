package Modelo;

public class CompraProducto {
    private double precioDocena;
    private int cantidadDocenas;

    public CompraProducto(double precioDocena, int cantidadDocenas) {
        this.precioDocena = precioDocena;
        this.cantidadDocenas = cantidadDocenas;
    }

    public double calcularImporteCompra() {
        return precioDocena * cantidadDocenas;
    }

    public double calcularDescuento() {
        double importe = calcularImporteCompra();
        double porcDescuento = (cantidadDocenas >= 10) ? 0.20 : 0.10;
        return importe * porcDescuento;
    }

    public double calcularImportePagar() {
        return calcularImporteCompra() - calcularDescuento();
    }

    public int calcularLapiceros() {
        double importePagar = calcularImportePagar();
        if (importePagar >= 200) {
            return 2 * cantidadDocenas;
        } else {
            return 0;
        }
    }
}


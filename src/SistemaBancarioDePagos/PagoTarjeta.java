package SistemaBancarioDePagos;

public class PagoTarjeta implements Pagable {
    private double comision = 0.05;

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }
        double total = monto + (monto * comision);
        System.out.println("Pago con tarjeta realizado correctamente.");
        System.out.println("Monto original: $" + monto);
        System.out.println("Comisión aplicada: 5%");
        System.out.println("Total a pagar: $" + total);
    }
}
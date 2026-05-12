package SistemaBancarioDePagos;


public class Transferencia implements Pagable {
    private double comision = 0.02;

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }
        double total = monto + (monto * comision);
        System.out.println("Transferencia bancaria realizada correctamente.");
        System.out.println("Monto original: $" + monto);
        System.out.println("Comisión aplicada: 2%");
        System.out.println("Total transferido: $" + total);
    }
}
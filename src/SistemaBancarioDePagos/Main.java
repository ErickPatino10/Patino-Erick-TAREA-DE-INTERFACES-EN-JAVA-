package SistemaBancarioDePagos;

public class Main {
    public static void main(String[] args) {

        Pagable efectivo = new PagoEfectivo();
        Pagable tarjeta = new PagoTarjeta();
        Pagable transferencia = new Transferencia();

        efectivo.procesarPago(100);
        System.out.println();

        tarjeta.procesarPago(200);
        System.out.println();

        transferencia.procesarPago(300);
        System.out.println();

        // Ejemplo de validación
        efectivo.procesarPago(-50);
    }
}

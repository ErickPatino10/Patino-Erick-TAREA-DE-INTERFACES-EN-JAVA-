package SistemaDeRolesEmpresariales;

// Clase Cajero
public class Cajero implements Autenticable, Gestionable {

    private String usuarioCorrecto = "cajero";
    private String claveCorrecta = "1234";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Inicio de sesión exitoso para Cajero.");
            return true;
        } else {
            System.out.println("Usuario o clave incorrectos.");
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El cajero está gestionando pagos y cobros.");
    }
}
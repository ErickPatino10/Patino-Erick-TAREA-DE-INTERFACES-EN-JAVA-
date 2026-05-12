package SistemaDeRolesEmpresariales;

public class Administrador implements Autenticable, Reportable, Gestionable {

    private String usuarioCorrecto = "admin";
    private String claveCorrecta = "admin123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Inicio de sesión exitoso para Administrador.");
            return true;
        } else {
            System.out.println("Usuario o clave incorrectos.");
            return false;
        }
    }

    @Override
    public void generarReporte() {
        System.out.println("El administrador está generando reportes generales.");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El administrador está gestionando información del sistema.");
    }
}
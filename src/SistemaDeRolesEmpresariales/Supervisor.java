package SistemaDeRolesEmpresariales;

// Clase Supervisor
public class Supervisor implements Autenticable, Reportable {

    private String usuarioCorrecto = "supervisor";
    private String claveCorrecta = "super123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Inicio de sesión exitoso para Supervisor.");
            return true;
        } else {
            System.out.println("Usuario o clave incorrectos.");
            return false;
        }
    }

    @Override
    public void generarReporte() {
        System.out.println("El supervisor está generando reportes de supervisión.");
    }
}
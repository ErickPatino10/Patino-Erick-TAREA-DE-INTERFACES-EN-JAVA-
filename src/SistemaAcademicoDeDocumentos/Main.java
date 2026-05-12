package SistemaAcademicoDeDocumentos;

public class Main {
    public static void main(String[] args) {

        Certificado certificado = new Certificado("CERT-2026-001");
        ActaNotas acta = new ActaNotas("Desarrollo de Software");
        HorarioAcademico horario = new HorarioAcademico("2026-A");

        certificado.imprimir();
        acta.imprimir();
        horario.imprimir();
    }
}

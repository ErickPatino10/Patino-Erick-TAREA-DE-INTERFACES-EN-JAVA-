package SistemaAcademicoDeDocumentos;

public class Certificado implements Imprimible{
    private String numeroDocumento;

    public Certificado(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo certificado con número: " + numeroDocumento);
    }
}

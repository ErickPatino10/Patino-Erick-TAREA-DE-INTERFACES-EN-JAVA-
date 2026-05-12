package SistemaAcademicoDeDocumentos;

public class HorarioAcademico implements Imprimible {

    private String periodoAcademico;

    public HorarioAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo horario académico del período: " + periodoAcademico);
    }
}
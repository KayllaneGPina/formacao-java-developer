package Domain;

public class Curso extends Conteudo{

    private Integer cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Curso() {}

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

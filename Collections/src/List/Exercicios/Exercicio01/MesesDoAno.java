package List.Exercicios.Exercicio01;

public class MesesDoAno {
    private Integer numeroDoMes;
    private String mes;
    private Integer mediaTemperatura;

    public MesesDoAno(Integer numeroDoMes, String mes, Integer mediaTemperatura) {
        this.numeroDoMes = numeroDoMes;
        this.mes = mes;
        this.mediaTemperatura = mediaTemperatura;
    }

    public Integer getNumeroDoMes() {
        return numeroDoMes;
    }

    public void setNumeroDoMes(Integer numeroDoMes) {
        this.numeroDoMes = numeroDoMes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getMediaTemperatura() {
        return mediaTemperatura;
    }

    public void setMediaTemperatura(Integer mediaTemperatura) {
        this.mediaTemperatura = mediaTemperatura;
    }

    @Override
    public String toString() {
        return "MesesDoAno{" +
                "numeroDoMes='" + numeroDoMes + '\'' +
                "mes='" + mes + '\'' +
                ", mediaTemperatura=" + mediaTemperatura +
                '}';
    }
}

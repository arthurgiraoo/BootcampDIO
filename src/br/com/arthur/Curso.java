package br.com.arthur;

public class Curso extends Conteudo{
      private int cargaHoraria;

    public Curso(String titulo, String descricao) {
        super(titulo, descricao);
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria +
                '}';
    }

    @Override
    public double calculaXP() {
        return XP_PADRAO * getCargaHoraria();
    }
}

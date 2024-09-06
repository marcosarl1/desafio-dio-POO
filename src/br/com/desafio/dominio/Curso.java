package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo= '" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + cargaHoraria +
                "}";
    }
}

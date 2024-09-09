package br.com.desafio.dominio;

public class Desafio extends Conteudo {

    private int dificuldade;

    @Override
    public double calcularXP() {
        return XP_PADRAO * dificuldade;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "titulo= '" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}

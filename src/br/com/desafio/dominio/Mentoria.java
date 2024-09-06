package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo= '" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                "}";
    }
}

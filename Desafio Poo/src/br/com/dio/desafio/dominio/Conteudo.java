package br.com.dio.desafio.dominio;

public abstract  class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricoes;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricoes() {
        return descricoes;
    }

    public void setDescricoes(String descricoes) {
        this.descricoes = descricoes;
    }

}

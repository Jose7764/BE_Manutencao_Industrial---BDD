package org.example.model;

public class Material {

    private  int id ;
    private String nome;
    private String unidade;
    private double estoque;

    public Material() {
        this.id = 0;
        this.nome = "";
        this.unidade = "";
        this.estoque = 0.0;
    }

    public Material( String nome, String unidade, double estoque) {
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }

    public Material(int id, String nome, String unidade, double estoque) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
}

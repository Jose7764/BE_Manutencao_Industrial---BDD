package org.example.model;

public class Fornecedor {

    private int id;
    private String nome;
    private String cnpj;

    public Fornecedor() {
        this.id = 0;
        this.nome = "";
        this.cnpj = "";
    }

    public Fornecedor( String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Fornecedor(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

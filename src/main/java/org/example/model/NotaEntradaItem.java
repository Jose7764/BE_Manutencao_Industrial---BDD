package org.example.model;

public class NotaEntradaItem {
    private int idNotaEntrada;
    private int idMaterial;
    private Double quantidade;

    public NotaEntradaItem() {
        this.idNotaEntrada = 0;
        this.idMaterial = 0;
        this.quantidade = null;
    }

    public NotaEntradaItem(int idNotaEntrada, int idMaterial, Double quantidade) {
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public NotaEntradaItem(int id, int idNotaEntrada, int idMaterial, Double quantidade) {
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdNotaEntrada() { return idNotaEntrada; }
    public void setIdNotaEntrada(int idNotaEntrada) { this.idNotaEntrada = idNotaEntrada; }
    public int getIdMaterial() { return idMaterial; }
    public void setIdMaterial(int idMaterial) { this.idMaterial = idMaterial; }
    public Double getQuantidade() { return quantidade; }
    public void setQuantidade(Double quantidade) { this.quantidade = quantidade; }
}

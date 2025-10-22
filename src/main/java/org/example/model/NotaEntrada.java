package org.example.model;

import java.util.Date;

public class NotaEntrada {
    private int id;
    private int idFornecedor;
    private Date dataEntrada;

    public NotaEntrada() {
        this.id = 0;
        this.idFornecedor = 0;
        this.dataEntrada = null;
    }

    public NotaEntrada(int idFornecedor, Date dataEntrada) {
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public NotaEntrada(int id, int idFornecedor, Date dataEntrada) {
        this.id = id;
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getIdFornecedor() { return idFornecedor; }
    public void setIdFornecedor(int idFornecedor) { this.idFornecedor = idFornecedor; }
    public Date getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(Date dataEntrada) { this.dataEntrada = dataEntrada; }
}

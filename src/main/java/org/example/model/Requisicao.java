package org.example.model;

import java.util.Date;

public class Requisicao {
    private int id;
    private String setor;
    private Date dataSolicitacao;
    private String status;

    public Requisicao() {
        this.id = 0;
        this.setor = null;
        this.dataSolicitacao = null;
        this.status = null;
    }

    public Requisicao(String setor, Date dataSolicitacao, String status) {
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public Requisicao(int id, String setor, Date dataSolicitacao, String status) {
        this.id = id;
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
    public Date getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(Date dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

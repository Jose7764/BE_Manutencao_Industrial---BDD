package org.example.model;

import java.util.Date;

public class Requisicao {

    private int id;
    private String setor;
    private Date dataSolicitaçcao;

    public Requisicao() {
        this.id = 0;
        this.setor = "";
        this.dataSolicitaçcao = null;
    }

    public Requisicao( String setor, Date dataSolicitaçcao) {
        this.setor = setor;
        this.dataSolicitaçcao = dataSolicitaçcao;
    }

    public Requisicao(int id, String setor, Date dataSolicitaçcao) {
        this.id = id;
        this.setor = setor;
        this.dataSolicitaçcao = dataSolicitaçcao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setDataSolicitaçcao(Date dataSolicitaçcao) {
        this.dataSolicitaçcao = dataSolicitaçcao;
    }

    public int getId() {
        return id;
    }

    public String getSetor() {
        return setor;
    }

    public Date getDataSolicitaçcao() {
        return dataSolicitaçcao;
    }
}

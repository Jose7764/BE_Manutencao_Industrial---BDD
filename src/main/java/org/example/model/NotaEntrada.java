package org.example.model;

import java.util.Date;

public class NotaEntrada {

    private int id;
    private Date dataEntrada;

    public NotaEntrada() {
        this.id = 0;
        this.dataEntrada = null;
    }

    public NotaEntrada( Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public NotaEntrada(int id, Date dataEntrada) {
        this.id = id;
        this.dataEntrada = dataEntrada;
    }

    public int getId() {
        return id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}

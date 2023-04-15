package org.example;

public class AvaliacaoEstado implements IAvaliacao{

    private String estado;

    @Override
    public String getAvaliacao() {
        return this.estado;
    }

    @Override
    public void setAvaliacao(String estado) {
        this.estado = estado;
    }
}

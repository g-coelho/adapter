package org.example;

public class Paciente {
    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Paciente() {
        avaliacao = new AvaliacaoEstado();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String estado){
        avaliacao.setAvaliacao(estado);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao(){
        return persistencia.recuperarAvaliacao();
    }

    public float getTemperatura(){
        return persistencia.getTemperatura();
    }

}

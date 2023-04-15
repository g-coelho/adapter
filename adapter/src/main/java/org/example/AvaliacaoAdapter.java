package org.example;

public class AvaliacaoAdapter extends AvaliacaoTemperatura{

    private IAvaliacao avaliacaoEstado;

    public AvaliacaoAdapter(IAvaliacao avaliacaoEstado){
        this.avaliacaoEstado = avaliacaoEstado;
    }

    public String recuperarAvaliacao(){
        if(this.getTemperatura() < 35.0f){
            avaliacaoEstado.setAvaliacao("Hipotermia");
        }
        else
            if(this.getTemperatura()> 35.0f & this.getTemperatura() < 37.0f){
                avaliacaoEstado.setAvaliacao("Normal");
            }
            else
                if(this.getTemperatura() > 37.0f & this.getTemperatura() < 38.5f){
                    avaliacaoEstado.setAvaliacao("Febre moderada");
                }
                else
                    avaliacaoEstado.setAvaliacao("Febre alta");

        return avaliacaoEstado.getAvaliacao();
    }

    public void salvarAvaliacao(){
        if(avaliacaoEstado.getAvaliacao().equals("Hipotermia"))
            this.setTemperatura(34.0f);
        else
            if(avaliacaoEstado.getAvaliacao().equals("Normal"))
                this.setTemperatura(36.0f);
            else
                if(avaliacaoEstado.getAvaliacao().equals("Febre moderada"))
                    this.setTemperatura(38.0f);
                else
                    this.setTemperatura(39.0f);
    }

}

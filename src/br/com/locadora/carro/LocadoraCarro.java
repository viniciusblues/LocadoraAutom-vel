package br.com.locadora.carro;

public class LocadoraCarro {
    private String nomeCarro;

    private String marcaCarro;
    private ModeloCarro modeloCarro;
    private int anoCarro;
    private int anoModeloCarro;


    public LocadoraCarro(String nomeCarro, String marcaCarro, ModeloCarro modeloCarro, int anoCarro, int anoModeloCarro) {
        this.nomeCarro = nomeCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.anoModeloCarro = anoModeloCarro;
    }


    public String getNomeCarro() {
        return nomeCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public ModeloCarro getModeloCarro() {
        return modeloCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public int getAnoModeloCarro() {
        return anoModeloCarro;
    }


}

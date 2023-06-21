package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.time.LocalDate;

public abstract class Impressora {

    protected String tipoConexao;
    protected LocalDate dataFabricacao;

    protected String modelo;

    public Impressora(String tipoConexao,  String modelo) {
        this.tipoConexao = tipoConexao;
        this.modelo = modelo;
    }

    public String dadosImpressora(String modelo, Double custoFolha){
        String frase =  "Impressora: " + modelo +
                " tem o custo por folha de R$" + custoFolha;
        return frase;
    }

}

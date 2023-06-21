package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.time.LocalDate;

public class ImpressoraEpson extends  Impressora implements AcaoImpressora{

    protected int folhasDisponiveis;
    protected Double custoPorFolha;
    protected Integer quantidadePaginasImpressas;

    public ImpressoraEpson(String tipoConexao, LocalDate dataFabricacao, String modelo, int folhasDisponiveis, Double custoPorFolha) {
        super(tipoConexao, modelo);
        this.folhasDisponiveis = folhasDisponiveis;
        this.custoPorFolha = custoPorFolha;
    }

    @Override
    public Double alterarCustoPorFolha(Double novoValor){
        custoPorFolha = novoValor;
        return  custoPorFolha;
    }

    @Override
    public boolean temPapel(){
        if(folhasDisponiveis == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void imprimir (String texto){
        try {
            if (temPapel()) {
                System.out.println("Texto: " + texto + " impresso com sucesso");
                folhasDisponiveis -= folhasDisponiveis;
            }
        } catch (Exception ex) {
            System.err.println("Não foi possível imprimir, abasteça com papel a impressora.");
            ex.printStackTrace();
        }

    }

}

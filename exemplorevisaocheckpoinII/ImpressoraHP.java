package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.time.LocalDate;

public class ImpressoraHP extends  Impressora implements AcaoImpressora{

    protected int folhasDisponiveis;
    protected Double custoPorFolha;
    protected Integer quantidadePaginasImpressas;

    public ImpressoraHP(String tipoConexao, LocalDate dataFabricacao, String modelo, int folhasDisponiveis, Double custoPorFolha) {
        super(tipoConexao, modelo);
        this.folhasDisponiveis = folhasDisponiveis;
        this.custoPorFolha = custoPorFolha;
    }

    @Override
    public Double alterarCustoPorFolha(Double novoValor){
        custoPorFolha = novoValor + (novoValor*0.05);
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
                System.out.println("Texto: " + texto + " impresso com sucesso na impressora: " + modelo);
                folhasDisponiveis = folhasDisponiveis - 2;
            }
        } catch (Exception ex) {
            System.err.println("Não foi possível imprimir, abasteça com papel a impressora.");
            ex.printStackTrace();
        }

    }

}

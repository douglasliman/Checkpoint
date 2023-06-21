package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.util.ArrayList;

public class SetorAlocacao {

    private String nome;
    private String lider;

    private ArrayList<Impressora> listaImpressoras = new ArrayList<>();

    public SetorAlocacao(String nome, String lider) {
        this.nome = nome;
        this.lider = lider;
    }

    public void exibirImpressoras(){
        for(Impressora impressora : listaImpressoras){
            if(impressora instanceof ImpressoraEpson) {
                System.out.println(impressora.dadosImpressora(impressora.modelo, ((ImpressoraEpson) impressora).custoPorFolha));
            }
            if(impressora instanceof ImpressoraHP) {
                System.out.println( impressora.dadosImpressora(impressora.modelo, ((ImpressoraHP) impressora).custoPorFolha));
            }
        }
    }

    public void adicionarImpressora(Impressora impressora){
        listaImpressoras.add(impressora);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public ArrayList<Impressora> getListaImpressoras() {
        return listaImpressoras;
    }

    public void setListaImpressoras(ArrayList<Impressora> listaImpressoras) {
        this.listaImpressoras = listaImpressoras;
    }
}

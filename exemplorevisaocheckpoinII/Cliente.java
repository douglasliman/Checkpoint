package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpfCnpj;
    private Long telefone;
    private Endereco endereco; // relacionamento 1..1

    private ArrayList<SetorAlocacao> listaSetorAlocacao = new ArrayList<>();


    public Cliente(String nome, String cpfCnpj, Endereco endereco) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }


    public void exibirSetoresImpressoras(){
        System.out.println("Impressoras alocadas por setor");
        for(SetorAlocacao setor: listaSetorAlocacao){
            System.out.println("Setor: " + setor.getNome() + ". Impressora: ");
            setor.exibirImpressoras();
        }
    }

    public void modificarEndereco(Endereco endereco){
        this.endereco = endereco;
        System.out.println("Endereço atual: " +  endereco.getRua()
                + ", n° " + endereco.getNumero() + ",  cidade " + endereco.getCidade());
    }

    public void modificarCadastro(String nome, String cpfCnpj, Long telefone, Endereco endereco){
        if(nome != null){
            this.nome = nome;
        }

        if(cpfCnpj != null){
            this.cpfCnpj = cpfCnpj;
        }

        if(telefone != null){
            this.telefone = telefone;
        }

        if(endereco != null){
            modificarEndereco(endereco);
        }
    }




    public void adicionarSetor(SetorAlocacao setor){
        listaSetorAlocacao.add(setor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<SetorAlocacao> getListaSetorAlocacao() {
        return listaSetorAlocacao;
    }

    public void setListaSetorAlocacao(ArrayList<SetorAlocacao> listaSetorAlocacao) {
        this.listaSetorAlocacao = listaSetorAlocacao;
    }
}

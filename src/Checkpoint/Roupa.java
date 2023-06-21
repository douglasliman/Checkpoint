package Checkpoint;


import java.util.ArrayList;

public class Roupa {
    private  int idRoupa;
    private String nome;
    private String tamanho;
    private double precoRoupa;

    private boolean disponivel;
    private ArrayList<Aluguel> alugueis;



    public Roupa(int idRoupa, String nome, String tamanho, double precoRoupa, boolean disponivel) {
        this.idRoupa = idRoupa;
        this.nome = nome;
        this.tamanho = tamanho;
        this.precoRoupa = precoRoupa;
        this.disponivel = disponivel;
    }

    public void atualizarPreco(Double novoPreco) {
        if (novoPreco >= this.precoRoupa) {
            this.precoRoupa = novoPreco;
            System.out.println("Preço da roupa atualizado para: R$ " + this.precoRoupa);
        } else {
            System.out.println("O preço da roupa não pode ser alterado.");
        }
    }




    public int getIdRoupa() {
        return idRoupa;
    }

    public void setIdRoupa(int idRoupa) {
        this.idRoupa = idRoupa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPrecoRoupa() {
        return precoRoupa;
    }

    public void setPrecoRoupa(double precoRoupa) {
        this.precoRoupa = precoRoupa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}

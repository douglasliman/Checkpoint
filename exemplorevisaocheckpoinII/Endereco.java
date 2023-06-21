package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Endereco {

    //atributos
    private static String rua;
    private static String numero;
    private static String cidade;
    private static String bairro;
    private static String estado;
    private static Integer cep;

    //Construtor
    //botão direito - generate - construtor - seleciona ops campos desejados - ok
    public Endereco(String rua, String numero, String cidade, Integer cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    //metodo ou função

    public static Endereco cadastrarEndereco() throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a rua: ");
        rua = sc.nextLine();
        System.out.println("Informe o número: ");
        numero = sc.nextLine();
        System.out.println("Informe a cidade: ");
        cidade = sc.nextLine();
        System.out.println("Informe o cep: ");
        try {
            cep = sc.nextInt();
        } catch (InputMismatchException e) {
            /*Essa exceção acontece devido a uma entrada incorreta de valor*/
            System.err.println("Erro na entrada de dados do cep, permitido somente números");
        }
        return new Endereco(rua, numero, cidade, cep);
    }


    //get e set
    //botão direito - generate - getters and setters - seleciona ops campos desejados - ok
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }


}

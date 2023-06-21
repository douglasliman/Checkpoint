package com.aulasdepoo.exemplorevisaocheckpoinII;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Ronaldo", "0265895256", new Endereco("Rua Conceição", "00A", "Santos", 12548936));

        ImpressoraHP impressora1 = new ImpressoraHP("Cabo", LocalDate.now(),"HP", 1000, 0.5);
        ImpressoraEpson impressora2 = new ImpressoraEpson("Wi-fi", LocalDate.now(),"Epson", 1000, 0.5);
        ImpressoraHP impressora3 = new ImpressoraHP("USB", LocalDate.now(),"HP", 1000, 0.5);

        Endereco endereco1 = new Endereco("Roa Margarida", "01", "Ribeirão Preto", 14021569);

        Cliente clientePadariaPao = new Cliente("Padaria Pão", "08562514598", endereco1);
        Cliente clienteSupermercadoOi = new Cliente("Supermercado Oi", "0102502/001/40", endereco1);

        SetorAlocacao setorRh = new SetorAlocacao("RH", "Maria");
        SetorAlocacao setorTi = new SetorAlocacao("TI", "João");

        setorTi.adicionarImpressora(impressora1);
        setorTi.adicionarImpressora(impressora2);
        setorRh.adicionarImpressora(impressora3);

        clientePadariaPao.adicionarSetor(setorRh);
        clientePadariaPao.adicionarSetor(setorTi);
        clienteSupermercadoOi.adicionarSetor(setorTi);

        impressora2.imprimir("To com sono!");
        impressora3.imprimir("Hello Word!");

        clientePadariaPao.exibirSetoresImpressoras(); // vai retornar null

        impressora1.alterarCustoPorFolha(0.10);
        impressora2.alterarCustoPorFolha(0.39);
        impressora3.alterarCustoPorFolha(0.50);

        clientePadariaPao.exibirSetoresImpressoras();

        System.out.println(clientePadariaPao.getCpfCnpj());
        clientePadariaPao.modificarCadastro(null, "0256982536", null, null);
        System.out.println(clientePadariaPao.getCpfCnpj());

       // Endereco.cadastrarEndereco();

    }
}

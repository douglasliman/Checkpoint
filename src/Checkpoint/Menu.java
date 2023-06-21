package Checkpoint;

import java.util.Scanner;

public  class Menu {


    public static void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while(!sair){
            System.out.println("Menu");
            System.out.println("ATENÇÃO: Use números para navegar");
            System.out.println("1 - Cadastrar roupa");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Buscar roupa");
            System.out.println("4 - Buscar cliente");
            System.out.println("5 - Roupas disponiveis");
            System.out.println("6 - Sair");



            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Loja.cadastrarRoupa();
                    break;
                case 2:
                    Loja.cadastrarCliente();
                    break;
                case 3:
                    Loja.consultarRoupa();
                    break;
                case 4:
                    Loja.consultarCliente();
                    break;
                case 5:
                    Loja.roupasDisponiveisAtualmente();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Esse número não é válido");
            }


        }

        System.out.println("Fechando o programa");

    }
}

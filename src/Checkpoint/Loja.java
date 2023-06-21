package Checkpoint;


import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private String nome;
    private String endereco;
    private String telefone;
    private static ArrayList<Roupa> roupas;

    private static ArrayList<Cliente> cliente;
    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.roupas = new ArrayList<>();
        this.cliente = new ArrayList<>();

    }



    public static void registrarRoupas(Roupa roupa) {
        roupas.add(roupa);

    }

        public static void cadastrarRoupa(){
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Cadastrar de Roupa");

            System.out.println("Digite um ID para a Roupa: ");
            int idRoupa = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nome da Roupa: ");
            String nome = scanner.nextLine();


            System.out.println("Tamanho da roupa: ");
            String tamanho = scanner.nextLine();


            System.out.println("Preço da Roupa: ");
            double precoRoupa = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Disponivel (true/false): ");
            boolean disponivel = scanner.nextBoolean();
            scanner.nextLine();

            Roupa roupa = new Roupa(idRoupa,nome,tamanho,precoRoupa,disponivel );
            roupas.add(roupa);
        }




    public void removerRoupa (Roupa roupa){
        roupas.remove(roupa);
     }

    public static ArrayList<Roupa> listarRoupasDisponiveis() {
        ArrayList<Roupa> roupasDisponiveis = new ArrayList<>();
        for (Roupa roupa : roupas) {
            if (roupa.isDisponivel()) {
                roupasDisponiveis.add(roupa);
            }
        }
        return roupasDisponiveis;
    }
    public static void roupasDisponiveisAtualmente(){
        java.util.ArrayList<Roupa> roupasDisponiveis = listarRoupasDisponiveis();
        System.out.println("Roupas disponíveis na loja:");
        for (Roupa roupa : roupasDisponiveis) {
            System.out.println("ID: " + roupa.getIdRoupa() + ", Nome: " + roupa.getNome() + ", Tamanho: " + roupa.getTamanho() + ", Preço: " + roupa.getPrecoRoupa());
        }


        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while(!sair) {
            System.out.println("Menu");
            System.out.println("1- Voltar ao menu");
           // System.out.println("2- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Menu.exibirMenu();
                    break;
                case 2:
                    sair = true;
                    break;
                default:
                    System.out.println("Esse número não é válido");
            }
        }

    }
    public static Roupa buscarIdRoupa(int id) {
        for (Roupa roupa : roupas) {
            if (roupa.getIdRoupa() == id) {
                return roupa;
            }
        }
        return null;
    }
    public static void consultarRoupa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Consultar Roupa");

        System.out.print("Digite o ID da Roupa: ");

        int id = scanner.nextInt();

        Roupa roupaEncontrada = buscarIdRoupa(id);
        if (roupaEncontrada != null) {
            System.out.println("Nome: " + roupaEncontrada.getNome());
            System.out.println("Tamanho: " + roupaEncontrada.getTamanho());
            System.out.println("Preço: " + roupaEncontrada.getPrecoRoupa());
            System.out.println("Disponivel: " + roupaEncontrada.isDisponivel());
        } else {
            System.out.println("Nenhuma roupa com esse Id encontrada");
        }
    }
    public static void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrar Cliente");

        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Telefone do Cliente: ");
        String telefone = scanner.nextLine();


        System.out.println("Email do Cliente: ");
        String email = scanner.nextLine();


        System.out.println("CPF do cliente: ");
        String cpf = scanner.nextLine();
        scanner.nextLine();


        Cliente cliente = new Cliente(nome,telefone,email,cpf );
        cliente.add(cliente);

    }
    public static void consultarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Consultar Cliente");

        System.out.print("Digite o CPF do cliente: ");

        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = buscarClientePorCPF(cpf);
        if (clienteEncontrado != null) {
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("Telefone: " + clienteEncontrado.getTelefone());
            System.out.println("Email: " + clienteEncontrado.getEmail());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
        } else {
            System.out.println("Nenhum cliente encontrado com o CPF informado.");
        }
    }

    public static Cliente buscarClientePorCPF(String cpf) {
        for (Cliente cliente : cliente) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Roupa> getRoupas() {
        return roupas;
    }

    public void setRoupas(ArrayList<Roupa> roupas) {
        this.roupas = roupas;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
}

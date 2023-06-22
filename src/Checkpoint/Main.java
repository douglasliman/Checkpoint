
package Checkpoint;
import java.time.LocalDate;


public class Main {

    public static <ArrayList> void main(String[] args) {
        //CRIAR INSTANCIAS DE ACORDO COM O GENERO
        Roupa vestido = new Roupa(1, "Vestido Longo", "G", 250.0, false, "Casamento");
        Roupa smoking = new RoupasMasculinas(2, "Smoking", "G", 300.0, true, "Smoking");
        Roupa saia = new Roupa(3, "Saia mid", "P", 100.0, true, "Promoção");
        Roupa vestidoFeminino = new Roupa(4, "Vestido Infantil", "M", 100.0, false,"Promoção");
        Roupa camisaFeminina = new Roupa(5, "Camisa Feminina", "M", 80.0, true, "Debutante");

        // vestido.atualizarPreco(100.0);
        //  smoking.atualizarPreco(350.0);

        Loja loja = new Loja("Cats Diva", "Rua 4, 514", "99995530");

        Loja.registrarRoupas(vestido);
        Loja.registrarRoupas(smoking);
        Loja.registrarRoupas(saia);
        Loja.registrarRoupas(vestidoFeminino);
        Loja.registrarRoupas(camisaFeminina);


      //  loja.removerRoupa(saia);
        /*java.util.ArrayList<Roupa> roupasDisponiveis = loja.listarRoupasDisponiveis();
        System.out.println("Roupas disponíveis na loja:");
        for (Roupa roupa : roupasDisponiveis) {
            System.out.println("ID: " + roupa.getIdRoupa() + ", Nome: " + roupa.getNome() + ", Tamanho: " + roupa.getTamanho() + ", Preço: " + roupa.getPrecoRoupa());
        }*/
       // Loja.exibirMenu();
        /*
        loja.cadastrarRoupa();
        java.util.ArrayList<Roupa> roupasDisponiveis = loja.listarRoupasDisponiveis();
        System.out.println("Roupas disponíveis na loja:");
        for (Roupa roupa : roupasDisponiveis) {
           System.out.println("ID: " + roupa.getIdRoupa() + ", Nome: " + roupa.getNome() + ", Tamanho: " + roupa.getTamanho() + ", Preço: " + roupa.getPrecoRoupa());
       }
*/


        Cliente cliente1 = new Cliente("Ana", "222222222", "aa@aa.com", "00000000000");
        Cliente cliente2 = new Cliente("Carlos", "333333333", "cc@cc.com","00000000000");
        Cliente cliente3 = new Cliente("Marta", "444444444", "mm@mm.com","66655588899");


        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = dataInicio.plusDays(7);
//
        Aluguel aluguel01 = new Aluguel(1, cliente1, vestido, dataInicio, dataFim,true);
        Aluguel aluguel02 = new Aluguel(2, cliente3, vestidoFeminino, dataInicio, dataFim, false);
        Aluguel aluguel03 = new Aluguel(3, cliente1, smoking, dataInicio, dataFim, true);
        Aluguel aluguel04 = new Aluguel(4, cliente2, camisaFeminina, dataInicio, dataFim, true);

//        Aluguel.calcularAluguel();

//
//
//        aluguel01.calcularAluguel();
//        aluguel02.calcularAluguel();
        aluguel03.calcularAluguel();
//        aluguel04.calcularAluguel();
//
//
//
//
//        System.out.println("O nome da loja é " + loja.getNome());
//
//        System.out.println("Aluguel do " + aluguel01.getRoupa().getNome() + ". Foi feito pelo cliente: " + cliente1.getNome());
//
//
//        System.out.println("O telefone do(a) cliente " + cliente1.getNome() + " é " + cliente1.getTelefone() + " e o e-mail é " + cliente1.getEmail());
//        cliente1.alterarCadastroCliente("455555555", "axa@com.br");
//        System.out.println("O novo telefone do(a) cliente " + cliente1.getNome() + " é " + cliente1.getTelefone() + "e o novo e-mail é " + cliente1.getEmail());
//
//
//
//        int idRoupa = 2;
//        Roupa roupaEncontrada = loja.buscarIdRoupa(idRoupa);
//        if (roupaEncontrada != null) {
//            System.out.println("Roupa encontrada: " + roupaEncontrada.getNome() + " - Tamanho: " + roupaEncontrada.getTamanho());
//        } else {
//            System.out.println("Roupa não encontrada.");
//        }
//
//        Double valorAluguel = aluguel01.calcularAluguel();
//        System.out.println("O valor do alguel é R$ " + valorAluguel);
//
//        System.out.println("O Aluguel do Vestido Infantil teve início " + aluguel02.getDataInicio() + ". E seu término foi " + aluguel02.getDataFim());
//        System.out.println("Aluguel finalizado para o vestido: " + aluguel01.getRoupa().getNome());
//
//

    }
}

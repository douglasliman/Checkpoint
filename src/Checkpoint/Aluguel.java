package Checkpoint;

import java.time.LocalDate;
import java.util.Scanner;

public class Aluguel {

    private Integer idAluguel;
    private Cliente cliente;
    private Roupa roupa;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean presencaDano;


    public Aluguel(Integer idAluguel, Cliente cliente, Roupa roupa, LocalDate dataInicio, LocalDate dataFim, boolean presencaDano) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.roupa = roupa;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.presencaDano = false;
    }


    public Double precoDano() {
        int danoValor = 0;
        if (presencaDano) {
            danoValor = 3;
        }
        return null;
    }
    public void calcularAluguel() {
        Roupa roupa = this.getRoupa();
        double valorAluguel = 0.0;

        if (roupa instanceof RoupasMasculinas) {
            RoupasMasculinas roupasMasculinas = (RoupasMasculinas) roupa;
            roupasMasculinas.atualizarPreco(valorAluguel);
            valorAluguel = roupasMasculinas.getPrecoRoupa();

            if (presencaDano) {
                valorAluguel *= precoDano();
            }
        }

        System.out.println("O valor do aluguel é: R$" + valorAluguel);
    }

    /*public String tipoMasculino(){
        String roupasMasculinas = this.getRoupa().getTipo();



        if (roupasMasculinas.equalsIgnoreCase("Terno") ) {

        } else if ( roupasMasculinas.equalsIgnoreCase("Smoking")||
                roupasMasculinas.equalsIgnoreCase("Fraque")) {

        } else if (  roupasMasculinas.equalsIgnoreCase("Promoção")) {

        }
        return roupasMasculinas;
    };
    */

    Scanner scanner = new Scanner(System.in);

    /*
    public void calcularAluguel(){




        // double danoValor = presencaDano == true ? this.getRoupaFeminina().atualizarPreco();* 10  this.getRoupa().getPrecoRoupa();

        //System.out.println("O valor do Aluguel é: R$" + danoValor);

        boolean sair = false;
        while(!sair) {
            System.out.println("Menu");
            System.out.println("1- Voltar ao menu");
            System.out.println("2- Realizar Pagamento");
            // System.out.println("3- Sair");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Loja.exibirMenu();
                    break;
                case 2:
                    Loja.cadastrarRoupa();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Esse número não é válido");
            }
        }
    }
*/

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}

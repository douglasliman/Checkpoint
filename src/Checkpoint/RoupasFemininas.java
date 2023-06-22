package Checkpoint;

public class RoupasFemininas extends Roupa{


    public RoupasFemininas(int idRoupa, String nome, String tamanho, double precoRoupa, boolean disponivel, String tipo) {
        super(idRoupa, nome, tamanho, precoRoupa, disponivel, tipo);

    }

    @Override
    public void atualizarPreco(Double novoPreco) {
        double novoValor = 0.0;
        String tipoRoupa = getTipo();

        switch (tipoRoupa.toLowerCase()) {
            case"Gala":
                double galaValor =   this.getPrecoRoupa() * 0.10;
                novoValor = this.getPrecoRoupa() + galaValor;
                break;
            case"Casamento":
                double casamentoValor =   this.getPrecoRoupa() * 0.20;
                novoValor = this.getPrecoRoupa() + casamentoValor;
                break;
            case"Debutante":
                double debutanteValor =   this.getPrecoRoupa() * 0.15;
                novoValor = this.getPrecoRoupa() + debutanteValor;
                break;
            case"Promoção":
                double promocao =   this.getPrecoRoupa() * -0.15;
                 novoValor = this.getPrecoRoupa() - promocao;
                break;
        }

    }

}

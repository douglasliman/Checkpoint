package Checkpoint;

import java.util.Locale;

public class RoupasMasculinas  extends Roupa{
    public RoupasMasculinas(int idRoupa, String nome, String tamanho, double precoRoupa, boolean disponivel, String tipo) {
        super(idRoupa, nome, tamanho, precoRoupa, disponivel, tipo);
    }

    @Override
    public void atualizarPreco(Double novoPreco) {
        double novoValor = getPrecoRoupa();
        String tipoRoupa = getTipo();
        switch (tipoRoupa.toLowerCase()) {
            case"Terno":
             double ternoValor =   this.getPrecoRoupa() * 0.10;
                novoValor = this.getPrecoRoupa() + ternoValor;
            break;
            case"Smoking":
            case"Fraque":
                double smokingFraqueValor =   this.getPrecoRoupa() * 0.20;
                novoValor = this.getPrecoRoupa() + smokingFraqueValor;
                break;
            case"Promoção":
                double promocao =   this.getPrecoRoupa() * -0.15;
                novoValor = this.getPrecoRoupa() + promocao;
                break;
        }

    }



}

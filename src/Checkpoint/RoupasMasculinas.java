package Checkpoint;

public class RoupasMasculinas  extends Roupa{
    public RoupasMasculinas(int idRoupa, String nome, String tamanho, double precoRoupa, boolean disponivel) {
        super(idRoupa, nome, tamanho, precoRoupa, disponivel);
    }

    @Override
    public void atualizarPreco(Double novoPreco) {
        super.atualizarPreco(novoPreco);
    }
}

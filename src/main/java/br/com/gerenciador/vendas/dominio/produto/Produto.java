package br.com.gerenciador.vendas.dominio.produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Produto {

    private String idProduto;
    private String descricaoProduto;
    private double valorUnitario;
    private String marca;
    private int quantidadeEstoque;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        if (Double.compare(produto.valorUnitario, valorUnitario) != 0) return false;
        if (quantidadeEstoque != produto.quantidadeEstoque) return false;
        if (!idProduto.equals(produto.idProduto)) return false;
        if (!descricaoProduto.equals(produto.descricaoProduto)) return false;
        return marca.equals(produto.marca);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idProduto.hashCode();
        result = 31 * result + descricaoProduto.hashCode();
        temp = Double.doubleToLongBits(valorUnitario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + marca.hashCode();
        result = 31 * result + quantidadeEstoque;
        return result;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto='" + idProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", marca='" + marca + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}

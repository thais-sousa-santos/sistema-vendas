package br.com.gerenciador.vendas.dominio.produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Estoque extends Produto {

    private double valorUnitarioVenda;
    private double valorUnitarioFornecedor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estoque)) return false;
        if (!super.equals(o)) return false;

        Estoque estoque = (Estoque) o;

        if (Double.compare(estoque.valorUnitarioVenda, valorUnitarioVenda) != 0) return false;
        return Double.compare(estoque.valorUnitarioFornecedor, valorUnitarioFornecedor) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(valorUnitarioVenda);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valorUnitarioFornecedor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "valorUnitarioVenda=" + valorUnitarioVenda +
                ", valorUnitarioFornecedor=" + valorUnitarioFornecedor +
                '}';
    }
}

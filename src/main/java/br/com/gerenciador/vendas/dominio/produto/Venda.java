package br.com.gerenciador.vendas.dominio.produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Venda extends Produto {

    private Long idVenda;
    private Long idVendedor;
    private double valorVenda;
    private LocalDateTime diaVenda;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venda)) return false;

        Venda venda = (Venda) o;

        if (Double.compare(venda.valorVenda, valorVenda) != 0) return false;
        if (!idVenda.equals(venda.idVenda)) return false;
        if (!idVendedor.equals(venda.idVendedor)) return false;
        return diaVenda.equals(venda.diaVenda);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idVenda.hashCode();
        result = 31 * result + idVendedor.hashCode();
        temp = Double.doubleToLongBits(valorVenda);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + diaVenda.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", idVendedor=" + idVendedor +
                ", valorVenda=" + valorVenda +
                ", diaVenda=" + diaVenda +
                '}';
    }
}

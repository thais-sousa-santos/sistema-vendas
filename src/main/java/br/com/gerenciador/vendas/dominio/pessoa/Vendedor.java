package br.com.gerenciador.vendas.dominio.pessoa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vendedor extends Pessoa {

    private Long idVendedor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vendedor)) return false;
        if (!super.equals(o)) return false;

        Vendedor vendedor = (Vendedor) o;

        return idVendedor.equals(vendedor.idVendedor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idVendedor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                '}';
    }
}

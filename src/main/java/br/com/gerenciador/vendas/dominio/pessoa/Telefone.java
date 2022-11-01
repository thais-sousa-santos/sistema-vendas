package br.com.gerenciador.vendas.dominio.pessoa;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Número são obrigatórios");
        }

        if(!ddd.matches("/\\d{2}/")){
            throw new IllegalArgumentException("DDD inválido");
        }

        if (!numero.matches("/\\d{8}|\\\\d{9}/")) {
            throw new IllegalArgumentException("Número de telefone inválido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;

        Telefone telefone = (Telefone) o;

        if (!ddd.equals(telefone.ddd)) return false;
        return numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        int result = ddd.hashCode();
        result = 31 * result + numero.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
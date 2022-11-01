package br.com.gerenciador.vendas.dominio.pessoa;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Cliente extends Pessoa {

    private Long id;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;

        Cliente cliente = (Cliente) o;

        if (!id.equals(cliente.id)) return false;
        return email.equals(cliente.email);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}

package br.com.gerenciador.vendas.dominio.pessoa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Pessoa {

    private Long id;
    private String perfil;
    private String nome;
    private String documento;
    private String endereco;
    private List<Telefone> telefones = new ArrayList<>();

    public Pessoa(String nome, String documento, String endereco, String perfil) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (!id.equals(pessoa.id)) return false;
        if (!perfil.equals(pessoa.perfil)) return false;
        if (!nome.equals(pessoa.nome)) return false;
        if (!documento.equals(pessoa.documento)) return false;
        if (!endereco.equals(pessoa.endereco)) return false;
        return telefones.equals(pessoa.telefones);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + perfil.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + documento.hashCode();
        result = 31 * result + endereco.hashCode();
        result = 31 * result + telefones.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", perfil='" + perfil + '\'' +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefones=" + telefones +
                '}';
    }

    public void adicionarTelefone(String ddd, String telefone) {
        this.telefones.add(new Telefone(ddd, telefone));
    }
}

package br.com.gerenciador.vendas.aplicacao;

import br.com.gerenciador.vendas.dominio.pessoa.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastrarPessoaDto {

    private String nome;
    private String documento;
    private String endereco;

    public CadastrarPessoaDto(String nome, String documento, String endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
    }

    public Pessoa criarPessoa(){
    return new Pessoa(nome, documento, endereco);
    }
}

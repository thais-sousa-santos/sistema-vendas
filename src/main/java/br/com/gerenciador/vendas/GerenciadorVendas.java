package br.com.gerenciador.vendas;

import br.com.gerenciador.vendas.aplicacao.CadastrarPessoa;
import br.com.gerenciador.vendas.aplicacao.CadastrarPessoaDto;
import br.com.gerenciador.vendas.infra.PessoaRepositoryImpl;

public class GerenciadorVendas {

    public static void main(String[] args) {

    String nome = "Thais Santos";
    String documento = "44715101858";
    String endereco = "Avenida Teste, 123";

        CadastrarPessoa cadastrar = new CadastrarPessoa(new PessoaRepositoryImpl());
        cadastrar.executar(new CadastrarPessoaDto(nome, documento, endereco));

    }
}
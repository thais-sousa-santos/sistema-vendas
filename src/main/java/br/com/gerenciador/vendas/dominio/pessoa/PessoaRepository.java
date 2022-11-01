package br.com.gerenciador.vendas.dominio.pessoa;

public interface PessoaRepository {

    void cadastrar(Pessoa pessoa);

    Pessoa buscarPorCpf(Pessoa documento);
}

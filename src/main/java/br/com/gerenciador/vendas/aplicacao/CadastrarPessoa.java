package br.com.gerenciador.vendas.aplicacao;

import br.com.gerenciador.vendas.dominio.pessoa.Pessoa;
import br.com.gerenciador.vendas.dominio.pessoa.PessoaRepository;

public class CadastrarPessoa {

    private final PessoaRepository repository;

    public CadastrarPessoa(PessoaRepository repository) {
        this.repository = repository;
    }

    public void executar(CadastrarPessoaDto dados){
        Pessoa novo = dados.criarPessoa();
        repository.cadastrar(novo);
    }
}

package br.com.gerenciador.vendas.infra;

import br.com.gerenciador.vendas.dominio.pessoa.Pessoa;
import br.com.gerenciador.vendas.dominio.pessoa.PessoaNaoEncontrada;
import br.com.gerenciador.vendas.dominio.pessoa.PessoaRepository;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositoryImpl implements PessoaRepository {

    private List<Pessoa> cadastrados = new ArrayList<>();
    @Override
    public void cadastrar(Pessoa pessoa) {
        this.cadastrados.add(pessoa);
    }

    @Override
    public Pessoa buscarPorCpf(Pessoa documento) {
        return this.cadastrados.stream()
            .filter(p -> p.getDocumento().equals(documento.getDocumento()))
            .findFirst().orElseThrow(() -> new PessoaNaoEncontrada(documento));
    }
}

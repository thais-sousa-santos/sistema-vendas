package br.com.gerenciador.vendas.aplicacao;

import br.com.gerenciador.vendas.dominio.pessoa.Cliente;
import br.com.gerenciador.vendas.dominio.pessoa.Vendedor;
import br.com.gerenciador.vendas.dominio.produto.Estoque;
import br.com.gerenciador.vendas.dominio.produto.Produto;
import br.com.gerenciador.vendas.dominio.produto.Venda;
import br.com.gerenciador.vendas.dominio.produto.VendaRepository;

public class VendaRepositoryImpl implements VendaRepository {

    @Override
    public void efetivarVenda(Cliente cliente, Venda venda, Vendedor vendedor,
                              Produto produto, Estoque estoque) {

    }

    @Override
    public void editarVenda(Venda venda, Produto produto) {

    }

    @Override
    public void excluirVenda(Venda venda, Produto produto, Estoque estoque) {

    }
}

package br.com.gerenciador.vendas.dominio.produto;


import br.com.gerenciador.vendas.dominio.pessoa.Cliente;
import br.com.gerenciador.vendas.dominio.pessoa.Vendedor;

public interface VendaRepository {

    void efetivarVenda(Cliente cliente, Venda venda, Vendedor vendedor, Produto produto, Estoque estoque);

    void editarVenda(Venda venda, Produto produto);

    void excluirVenda(Venda venda, Produto produto, Estoque estoque);
}

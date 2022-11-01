package br.com.gerenciador.vendas.dominio.pessoa;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder dadosCompletos(String nome, String documento, String endereco){
        this.pessoa = new Pessoa(nome, documento, endereco);
        return this;
    }

    public PessoaBuilder dadosComTelefone(String ddd, String telefone){
        this.pessoa.adicionarTelefone(ddd, telefone);
        return this;
    }

    public Pessoa criar(){
        return this.pessoa;
    }
}

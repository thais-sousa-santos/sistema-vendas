package br.com.gerenciador.vendas.dominio.pessoa;

public class PessoaNaoEncontrada extends RuntimeException{
    public PessoaNaoEncontrada(Pessoa documento) {
        super("Pessoa não encontrada com documento: " + documento.getDocumento());
    }
}

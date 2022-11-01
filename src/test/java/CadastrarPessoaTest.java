import br.com.gerenciador.vendas.aplicacao.CadastrarPessoa;
import br.com.gerenciador.vendas.aplicacao.CadastrarPessoaDto;
import br.com.gerenciador.vendas.dominio.pessoa.PessoaRepository;
import br.com.gerenciador.vendas.infra.PessoaRepositoryImpl;
import org.junit.jupiter.api.Test;

public class CadastrarPessoaTest {

    @Test
    void cadastroPessoaDeveriaPersistir() {
        PessoaRepository repository = new PessoaRepositoryImpl();
        CadastrarPessoa useCase = new CadastrarPessoa(repository);

        CadastrarPessoaDto dados = new CadastrarPessoaDto(
                "Thais Santos", "44715101858", "Avenida Teste, 123");
        useCase.executar(dados);

    }
}

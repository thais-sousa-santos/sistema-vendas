package br.com.gerenciador.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class GerenciadorVendas {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorVendas.class, args);

    }
}
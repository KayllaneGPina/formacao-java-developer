package br.com.dio.testes_unitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Kayllane", LocalDate.of(2002, 8, 19));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void validarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Kayllane", LocalDate.of(2002, 8, 19));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }

}

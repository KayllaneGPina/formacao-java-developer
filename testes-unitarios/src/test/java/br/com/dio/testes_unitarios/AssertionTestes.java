package br.com.dio.testes_unitarios;

import org.junit.jupiter.api.Test;

// Importação estática
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssertionTestes {

    @Test
    void validarLancamentos() {

//        Erro de tamanhos de arrays diferentes
//        int[] primeiroLancamento = {10, 20, 30, 40, 50};
//        int[] segundoLancemento = {-1, 5, 2, 3, 10, 16, 17};

//        Erros de conteúdos diferente
//        int[] primeiroLancamento = {10, 20, 30, 40, 50};
//        int[] segundoLancemento = {10, 5, 2, 3, 10};

//        O teste passa
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancemento = {10, 20, 30, 40, 50};

//        Comparação de arrays
        assertArrayEquals(primeiroLancamento, segundoLancemento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);


//        pessoa = new Pessoa("Jão", LocalDate.now());
//        Assertions.assertNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}

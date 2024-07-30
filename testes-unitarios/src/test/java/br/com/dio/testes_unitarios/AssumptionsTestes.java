package br.com.dio.testes_unitarios;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTestes {

    @Test
    void validarAlgoSomenteNoUsuarioKayllane(){
        Assumptions.assumeFalse("kayllane".equals(System.getenv("USER")));
    }
}

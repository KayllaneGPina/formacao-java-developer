package br.com.dio.testes_unitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTestes {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "kay")
    @EnabledOnOs(OS.MAC)
    void validarAlgoSomenteNoUsuarioKayllane(){
        Assertions.assertEquals(10, 5 + 5);
    }

}

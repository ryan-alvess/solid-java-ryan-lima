package br.edu.unibras.solid.srp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraSalarioTest {
    @Test
    void deveCalcularSalarioLiquido() {
        var funcionario = new Funcionario("Ana", 5_000.0);

        assertEquals(4_000.0, new CalculadoraSalario().calcularLiquido(funcionario));
    }
}

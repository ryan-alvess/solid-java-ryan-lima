package br.edu.unibras.solid.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescontoTest {
    @Test
    void deveCalcularDescontoVip() {
        CalculadoraDesconto desconto = new DescontoVip();

        assertEquals(85.0, desconto.calcular(100.0), 0.001);
    }

    @Test
    void devePermitirAdicionarNovoDescontoSemAlterarOContrato() {
        CalculadoraDesconto desconto = new DescontoEstudante();

        assertEquals(90.0, desconto.calcular(100.0), 0.001);
    }
}

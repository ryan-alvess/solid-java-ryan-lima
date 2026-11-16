package br.edu.unibras.solid.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaBancariaTest {
    @Test
    void contaInvestimentoPodeSubstituirContaBancaria() {
        ContaBancaria conta = new ContaInvestimento();

        conta.depositar(100.0);

        assertEquals(102.0, conta.getSaldo(), 0.001);
    }

    @Test
    void contaCorrenteTambemRespeitaOContrato() {
        ContaBancaria conta = new ContaCorrente();

        conta.depositar(100.0);

        assertEquals(100.0, conta.getSaldo(), 0.001);
    }
}

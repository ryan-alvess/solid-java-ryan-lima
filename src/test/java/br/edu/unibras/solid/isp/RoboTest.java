package br.edu.unibras.solid.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RoboTest {
    @Test
    void roboDependeSomenteDaCapacidadeDeTrabalhar() {
        Trabalhador trabalhador = new Robo();

        trabalhador.trabalhar();

        assertTrue(((Robo) trabalhador).isTrabalhando());
    }
}

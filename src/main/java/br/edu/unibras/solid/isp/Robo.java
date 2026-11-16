package br.edu.unibras.solid.isp;

public class Robo implements Trabalhador {
    private boolean trabalhando;

    @Override
    public void trabalhar() {
        trabalhando = true;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
}

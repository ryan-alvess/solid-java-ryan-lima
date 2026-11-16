package br.edu.unibras.solid.isp;

public class RoboInvalido implements TrabalhadorTudoEmUm {
    @Override
    public void trabalhar() {
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem");
    }
}

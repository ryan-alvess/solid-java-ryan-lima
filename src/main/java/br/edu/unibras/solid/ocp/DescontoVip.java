package br.edu.unibras.solid.ocp;

public class DescontoVip implements CalculadoraDesconto {
    @Override
    public double calcular(double valor) {
        return validar(valor) * 0.85;
    }

    private double validar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        return valor;
    }
}

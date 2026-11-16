package br.edu.unibras.solid.ocp;

public class DescontoEstudante implements CalculadoraDesconto {
    @Override
    public double calcular(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        return valor * 0.90;
    }
}

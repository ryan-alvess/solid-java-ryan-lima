package br.edu.unibras.solid.ocp;

/**
 * Exemplo didático de violação do OCP: cada novo tipo exige alterar este método.
 */
public class CalculadoraDescontoCondicional {
    public double calcular(String tipo, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        return switch (tipo) {
            case "VIP" -> valor * 0.85;
            case "ESTUDANTE" -> valor * 0.90;
            default -> valor;
        };
    }
}

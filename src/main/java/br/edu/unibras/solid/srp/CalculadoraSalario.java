package br.edu.unibras.solid.srp;

public class CalculadoraSalario {
    private static final double PERCENTUAL_LIQUIDO = 0.8;

    public double calcularLiquido(Funcionario funcionario) {
        return funcionario.salarioBruto() * PERCENTUAL_LIQUIDO;
    }
}

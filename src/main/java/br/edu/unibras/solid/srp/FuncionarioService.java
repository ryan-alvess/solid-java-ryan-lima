package br.edu.unibras.solid.srp;

public class FuncionarioService {
    private final CalculadoraSalario calculadoraSalario;

    public FuncionarioService(CalculadoraSalario calculadoraSalario) {
        this.calculadoraSalario = calculadoraSalario;
    }

    public double calcularSalarioLiquido(Funcionario funcionario) {
        return calculadoraSalario.calcularLiquido(funcionario);
    }
}

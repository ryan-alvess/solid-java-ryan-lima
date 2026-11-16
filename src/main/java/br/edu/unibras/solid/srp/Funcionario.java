package br.edu.unibras.solid.srp;

public record Funcionario(String nome, double salarioBruto) {
    public Funcionario {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome deve ser informado");
        }
        if (salarioBruto < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
    }
}

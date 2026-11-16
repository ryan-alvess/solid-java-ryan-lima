package br.edu.unibras.solid.lsp;

public class ContaInvestimento implements ContaBancaria {
    private double saldo;

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Depósito não pode ser negativo");
        }
        saldo += valor * 1.02;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}

package br.edu.unibras.solid.lsp;

public class ContaCorrente implements ContaBancaria {
    private double saldo;

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Depósito não pode ser negativo");
        }
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}

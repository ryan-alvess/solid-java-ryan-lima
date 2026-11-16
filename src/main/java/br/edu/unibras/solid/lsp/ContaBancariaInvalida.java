package br.edu.unibras.solid.lsp;

/**
 * Exemplo didático de violação do LSP: uma subclasse rejeita a operação prometida pela base.
 */
public class ContaBancariaInvalida implements ContaBancaria {
    @Override
    public void depositar(double valor) {
        throw new UnsupportedOperationException("Esta conta não aceita depósitos");
    }

    @Override
    public double getSaldo() {
        return 0;
    }
}

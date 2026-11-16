package br.edu.unibras.solid.srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo didático de violação do SRP: a classe modela dados, calcula salário e persiste.
 */
public class FuncionarioTudoEmUm {
    private final String nome;
    private final double salarioBruto;

    public FuncionarioTudoEmUm(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularLiquido() {
        return salarioBruto * 0.8;
    }

    public void salvar(List<FuncionarioTudoEmUm> bancoDeDados) {
        bancoDeDados.add(this);
    }

    public static List<FuncionarioTudoEmUm> novoBancoDeDados() {
        return new ArrayList<>();
    }
}

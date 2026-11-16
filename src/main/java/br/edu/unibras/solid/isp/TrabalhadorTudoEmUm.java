package br.edu.unibras.solid.isp;

/**
 * Exemplo didático de violação do ISP: robôs são obrigados a implementar comer().
 */
public interface TrabalhadorTudoEmUm {
    void trabalhar();

    void comer();
}

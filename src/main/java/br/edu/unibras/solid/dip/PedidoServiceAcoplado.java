package br.edu.unibras.solid.dip;

/**
 * Exemplo didático de violação do DIP: o serviço cria e conhece a implementação concreta.
 */
public class PedidoServiceAcoplado {
    private final EmailNotificador notificador = new EmailNotificador();

    public void fecharPedido() {
        notificador.enviar("Pedido Confirmado!");
    }
}

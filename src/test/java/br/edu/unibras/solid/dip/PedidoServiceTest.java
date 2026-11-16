package br.edu.unibras.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoServiceTest {
    @Test
    void deveNotificarAoFecharPedido() {
        var notificador = new EmailNotificador();
        var service = new PedidoService(notificador);

        service.fecharPedido();

        assertEquals("Pedido Confirmado!", notificador.getUltimaMensagem());
    }

    @Test
    void devePermitirUsarUmNotificadorDeTeste() {
        var mensagens = new StringBuilder();
        var service = new PedidoService(mensagens::append);

        service.fecharPedido();

        assertEquals("Pedido Confirmado!", mensagens.toString());
    }
}

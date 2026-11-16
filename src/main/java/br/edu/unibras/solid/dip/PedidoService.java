package br.edu.unibras.solid.dip;

import java.util.Objects;

public class PedidoService {
    private final Notificador notificador;

    public PedidoService(Notificador notificador) {
        this.notificador = Objects.requireNonNull(notificador, "Notificador é obrigatório");
    }

    public void fecharPedido() {
        notificador.enviar("Pedido Confirmado!");
    }
}

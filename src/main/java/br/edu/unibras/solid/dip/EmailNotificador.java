package br.edu.unibras.solid.dip;

public class EmailNotificador implements Notificador {
    private String ultimaMensagem;

    @Override
    public void enviar(String mensagem) {
        ultimaMensagem = mensagem;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}

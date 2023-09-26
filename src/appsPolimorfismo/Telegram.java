package appsPolimorfismo;

public class Telegram extends ServicoMensagemIntantanea{
    @Override
    public void enviaMensagem() {
        validarConectadoInternet();
        System.out.println("TELEGRAM mensagem!!!");
        salvarhistoricoConversa();
    }

    @Override
    public void receberMensagem() {
        System.out.println("TELEGRAM recebendo mensagem!!!");
        salvarhistoricoConversa();
    }
}

package appsPolimorfismo;

public class FacebookMensseger extends ServicoMensagemIntantanea{
    @Override
    public void enviaMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo Mensagens Facebook");
        salvarhistoricoConversa();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Enviando Mensagens Facebook");
        salvarhistoricoConversa();
    }
}

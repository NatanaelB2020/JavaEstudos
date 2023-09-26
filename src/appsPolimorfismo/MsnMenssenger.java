package appsPolimorfismo;

public class MsnMenssenger extends ServicoMensagemIntantanea{

    @Override
    public void enviaMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo Mensagens MSN");
        salvarhistoricoConversa();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Enviando Mensagens MSN");
        salvarhistoricoConversa();
    }
}

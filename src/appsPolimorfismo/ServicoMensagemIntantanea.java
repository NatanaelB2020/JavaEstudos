package appsPolimorfismo;

public abstract class ServicoMensagemIntantanea {

    public abstract void enviaMensagem();
    public abstract void receberMensagem();

    protected  void salvarhistoricoConversa(){
        System.out.println("Mensagem salva no Histórico");
    }

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }


}

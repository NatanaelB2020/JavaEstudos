package desafios.smartTv; // Declaração do pacote onde a classe Usuario está localizada.

public class Usuario { // Declaração da classe Usuario.

    public static void main(String[] args) { // Método principal da classe.

        SmartTv smartTv = new SmartTv(); // Cria uma instância da classe SmartTv chamada "smartTv".

        // Controle do volume da TV.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume); // Imprime o volume atual da TV.

        // Ligar e desligar a TV.
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligado); // Imprime o status da TV (ligada).
        smartTv.desligar();
        System.out.println("Novo Status => TV Desligada? " + smartTv.ligado); // Imprime o status da TV (desligada).

        // Controle de canais da TV.
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();

        // Mudança direta de canal.
        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal); // Imprime o canal atual da TV.
        System.out.println("TV Ligada? " + smartTv.ligado); // Imprime o status da TV (ligada).
        System.out.println("Volume atual: " + smartTv.volume); // Imprime o volume atual da TV.
    }
}

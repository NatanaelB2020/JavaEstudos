package desafios.smartTv; // Declaração do pacote onde a classe SmartTv está localizada.

public class SmartTv { // Declaração da classe SmartTv.

    // Declaração de variáveis de instância (atributos) que representam o estado da TV.
    boolean ligado = true; // Um indicador booleano para verificar se a TV está ligada.
    int canal = 1; // Um inteiro que representa o canal atual da TV.
    int volume = 25; // Um inteiro que representa o nível de volume atual da TV.

    // Métodos públicos para controlar a TV:

    public void mudarCanal(int novoCanal) { // Método para mudar o canal da TV.
        canal = novoCanal; // Atualiza o canal com o novo valor fornecido.
    }

    public void aumentarCanal() { // Método para aumentar o canal da TV.
        canal++; // Incrementa o valor do canal para o próximo canal.
    }

    public void diminuirCanal() { // Método para diminuir o canal da TV.
        canal--; // Decrementa o valor do canal para o canal anterior.
    }

    public void aumentarVolume() { // Método para aumentar o volume da TV.
        volume++; // Incrementa o valor do volume.
    }

    public void diminuirVolume() { // Método para diminuir o volume da TV.
        volume--; // Decrementa o valor do volume.
    }

    public void ligar() { // Método para ligar a TV.
        ligado = true; // Define o estado da TV como ligado.
    }

    public void desligar() { // Método para desligar a TV.
        ligado = false; // Define o estado da TV como desligado.
    }
}

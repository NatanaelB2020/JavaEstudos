package desafios.ultimaTransacao;

import java.util.Scanner;

public class UltimaTransacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações como no exemplo data, hora, descrição, valor: 01/02/2023,09:00:00,Deposito,100.00 ");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // Captura os valores da entrada
        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);

        // Cria uma instância de Transacao com os valores capturados
        Transacao transacao = new Transacao(data, hora, descricao, valor);

        // Chama o método imprimir para exibir a transação formatada
        transacao.imprimir();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.printf("Valor: %.2f%n", this.valor);
    }
}

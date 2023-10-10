package desafios.desafiosJava.abrindoContas;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();
        System.out.println("Digite o valor depositado: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.

        System.out.println("Informacoes:");
        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Numero da Conta: " + conta.numero);
        System.out.println("Titular da Conta: " + conta.titular);
        System.out.println("Saldo Atual: R$ " + conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public  ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

}
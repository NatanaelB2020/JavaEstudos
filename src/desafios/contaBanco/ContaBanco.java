package desafios.contaBanco;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número da agência e armazena o valor em 'agencia'.
        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que digite o nome do cliente e armazena o valor em 'cliente'.
        System.out.println("Por favor, digite o seu nome: ");
        String cliente = scanner.nextLine();

        // Solicita ao usuário que digite o número da conta e armazena o valor em 'numeroConta'.
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        // Solicita ao usuário que digite o valor depositado e armazena o valor em 'saldo'.
        System.out.println("Por favor, digite o valor depositado: ");
        float saldo = Float.parseFloat(scanner.nextLine());

        // Exibe uma mensagem de boas-vindas com os dados fornecidos pelo usuário.
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}

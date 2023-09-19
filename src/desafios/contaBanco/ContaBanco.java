package contaBanco;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        String cliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o valor depositado: ");
        float saldo = Float.parseFloat(scanner.nextLine());

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}

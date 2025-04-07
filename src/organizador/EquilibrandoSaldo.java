import java.util.Scanner;

public class EquilibrandoSaldo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Saldo da sua conta atual:");
        double saldo = entrada.nextDouble();
        System.out.println("digite o valor do deposito");
        double deposito = entrada.nextDouble();
        System.out.println("Digite o valor do saque:");
        double saque = entrada.nextDouble();

        double saida = saldo + deposito - saque;
        System.out.println(saida);
    }
}

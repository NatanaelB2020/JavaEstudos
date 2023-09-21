import java.util.Scanner;

public class SaqueConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        int saldoTotal = entrada.nextInt();
        System.out.println("Digite o valor a ser sacado: ");
        int valorSaque = entrada.nextInt();

        if (saldoTotal >= valorSaque){
            int saldodisponivel = saldoTotal - valorSaque;
            System.out.println("Saldo em conta " + saldodisponivel);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}

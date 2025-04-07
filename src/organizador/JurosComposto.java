import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosComposto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = Double.parseDouble(entrada.nextLine());
        double taxaJuros = Double.parseDouble(entrada.nextLine());
        int periodo = Integer.parseInt(entrada.nextLine());
        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
    }
}

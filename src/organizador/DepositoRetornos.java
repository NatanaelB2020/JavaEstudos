import java.text.DecimalFormat;
import java.util.Scanner;

public class DepositoRetornos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = Double.parseDouble(entrada.nextLine());

        if(valor > 0){
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Deposito realizado com sucesso!" + "\n" +"Saldo atual: " + df.format(valor));
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");

        }else
        {
            System.out.println("Valor invalido! Digite um valor maior que zero.");

        }
    }
}

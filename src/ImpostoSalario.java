import java.util.Scanner;

public class ImpostoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu sálario: ");
        float salario = entrada.nextFloat();
        System.out.println("Digite seu benefico: ");
        float beneficio = entrada.nextFloat();

        float valorImposto = 0;
        if(salario >= 0 && salario <= 1100){
            valorImposto = 0.5f * salario;
        }else if(salario >= 1101 && salario <= 2500){
            valorImposto = 0.10f * salario;
        }
        else {
            valorImposto = 0.15f * salario;
        }

        float saida = salario - valorImposto + beneficio;
        System.out.println("Salario liquido é " + String.format("%.2f", saida));
    }
}

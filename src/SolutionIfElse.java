import java.util.Scanner;

public class SolutionIfElse {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro da entrada
        int n = sc.nextInt();

        // Inicializa uma variável de texto (String) para armazenar o resultado
        String N = "";

        // Verifica se n é ímpar (resto da divisão por 2 é 1)
        if (n % 2 == 1) {
            N = "Weird"; // Se ímpar, atribui "Weird" à variável N
        } else {
            // Se n for par, verifica várias condições
            if (n >= 2 && n <= 5) {
                N = "Not Weird"; // Se n estiver no intervalo [2, 5], atribui "Not Weird" à variável N
            } else if (n >= 6 && n <= 20) {
                N = "Weird"; // Se n estiver no intervalo [6, 20], atribui "Weird" à variável N
            } else {
                N = "Not Weird"; // Se n for maior que 20, atribui "Not Weird" à variável N
            }
        }

        // Imprime o valor de N
        System.out.println(N);

        // Fecha o objeto Scanner
        sc.close();
    }
}

import java.util.Scanner;

public class JavaStdinAndStdout {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Lê um número inteiro da entrada padrão (stdin) e atribui a 'i'
        int i = scan.nextInt();

        // Lê um número de ponto flutuante da entrada padrão (stdin) e atribui a 'd'
        double d = scan.nextDouble();

        // A próxima linha em branco é consumida para evitar problemas de leitura
        scan.nextLine();

        // Lê uma linha de texto da entrada padrão (stdin) e atribui a 's'
        String s = scan.nextLine();

        // Fecha o objeto Scanner, liberando recursos
        scan.close();

        // Imprime uma explicação do código
        System.out.println("Neste código, um objeto Scanner é usado para ler entrada do usuário da linha de comando (stdin).");
        System.out.println("Ele lê um número inteiro, um número de ponto flutuante e uma linha de texto,");
        System.out.println("e depois imprime esses valores no console.");
        System.out.println("O scan.nextLine(); é usado para consumir a nova linha deixada após a leitura do número de ponto flutuante,");
        System.out.println("antes de ler a linha de texto, para evitar problemas de leitura.");

        // Imprime os valores lidos
        System.out.println("String: " + s); // Imprime a String
        System.out.println("Double: " + d); // Imprime o Double
        System.out.println("Int: " + i); // Imprime o Int
    }
}

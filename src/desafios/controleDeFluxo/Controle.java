package desafios.controleDeFluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        try {
            // Cria um objeto Scanner para ler entrada do usuário.
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Solicita ao usuário que digite seu nome.
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            // Solicita ao usuário que digite seu sobrenome.
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            // Solicita ao usuário que digite sua idade.
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            // Solicita ao usuário que digite sua altura.
            System.out.println("Digite sua altura (em centímetros): ");
            double altura = scanner.nextDouble();

            // Imprime informações sobre o usuário, incluindo nome, idade e altura.
            System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + " cm.");

            // Fecha o objeto Scanner após a leitura dos dados.
            scanner.close();
        } catch (InputMismatchException e) {
            // Trata a exceção InputMismatchException caso os campos idade e altura não sejam numéricos.
            System.out.println("Os campos Idade e Altura devem ser numéricos.");
        }
    }
}

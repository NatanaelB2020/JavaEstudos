package desafios.contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do usuário.
        Scanner terminal = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número.
        System.out.println("Digite o primeiro numero: ");

        // Lê o primeiro número digitado pelo usuário e o converte para um valor inteiro.
        int parametroUm = Integer.parseInt(terminal.nextLine());

        // Solicita ao usuário que digite o segundo número.
        System.out.println("Digite o segundo numero: ");

        // Lê o segundo número digitado pelo usuário e o converte para um valor inteiro.
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            // Chama a função contar com os números fornecidos pelo usuário.
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Trata a exceção ParametrosInvalidosException, caso os parâmetros sejam inválidos.
            System.out.println("Parâmetro inválido, o segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Função para contar e imprimir os números entre os parâmetros fornecidos.
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior ou igual ao segundo.
        if (parametroUm >= parametroDois) {
            // Lança uma exceção ParametrosInvalidosException se os parâmetros forem inválidos.
            throw new ParametrosInvalidosException();
        }

        // Loop para imprimir os números entre o primeiro e o segundo parâmetro.
        for (int contador = parametroUm; contador <= parametroDois; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}

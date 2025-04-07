package chatGPT;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados do teclado

public class ExerciciosChatGPT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria o objeto scanner para capturar entrada do usuário

        // --- Verifica se um número é positivo ou negativo ---
        System.out.print("Digite um numero: ");
        int n1 = scanner.nextInt();

        if (n1 > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("negativo");
        }

        // --- Verifica se o usuário pode votar (idade >= 18) ---
        System.out.print("Digite sua idade: ");
        int n2 = scanner.nextInt();

        if (n2 >= 18) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

        // --- Realiza uma operação matemática básica entre dois números ---
        System.out.print("Vamos fazer uma operação matematica\n");
        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo  numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação: "); // Usuário digita +, -, * ou /
        String operacao = scanner.next();

        double resultado; // Variável para armazenar o resultado

        switch (operacao) {
            case "+": // Soma
                resultado = numero1 + numero2;
                System.out.println(" Resultado: " + resultado);
                break;
            case "-": // Subtração
                resultado = numero1 - numero2;
                System.out.println(" Resultado: " + resultado);
                break;
            case "*": // Multiplicação
                resultado = numero1 * numero2;
                System.out.println(" Resultado: " + resultado);
                break;
            case "/": // Divisão com verificação de divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
        }

        // --- Avaliação com base em uma nota de 0 a 10 ---
        System.out.print("Avalie até agora este programa\n");
        System.out.print("Digite uma nota entre 0 e 10: ");
        double nota = scanner.nextDouble();

        String resposta = "";

        if (nota < 5) {
            resposta = "Reprovado";
            System.out.println("Nota de atendimento : " + resposta);
        }

        if (nota >= 5 && nota < 7) {
            resposta = "Regular";
            System.out.println("Nota de atendimento : " + resposta);
        }

        if (nota >= 7 && nota < 9) {
            resposta = "Bom";
            System.out.println("Nota de atendimento : " + resposta);
        }

        if (nota >= 9) {
            resposta = "Excelente";
            System.out.println("Nota de atendimento : " + resposta);
        }

        if (nota > 10) {
            resposta = "A nota deve estar enttre 0 e 10";
            System.out.println("Nota de atendimento : " + resposta);
        }

        // --- Contador de 0 a 10 com for ---
        System.out.println("vamos contar até 10 agora");

        for (int k = 0; k <= 10; k++) {
            System.out.println(k);
        }

        System.out.println("Acabamos de contar até 10\n");

        // --- Contador de 0 a 100 com while ---
        System.out.print("Vamos contar até 100\n");
        int i = 0;

        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // --- Tabuada de um número digitado pelo usuário ---
        System.out.println("Vamos fazer uma tabuada me um numero:  ");
        int numeroMultiplo = scanner.nextInt();

        for (int multi = 1; multi <= 10; multi++) {
            System.out.println(numeroMultiplo + " x " + multi + " = " + (numeroMultiplo * multi));
        }

        // --- Sistema simples de login com senha e 3 tentativas ---
        System.out.println("Precisamos da senha agora\n");
        System.out.println("digite a senha");

        Integer senhaCorreta = 123456;

        for (Integer tentativa = 0; tentativa < 3; tentativa++) {
            Integer senha = scanner.nextInt();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Seja bem vindo!");
                break;
            }

            if (tentativa == 2) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Senha incorreta tente novamente.");
            }
        }

        // --- Lista de nomes impressa com for-each ---
        System.out.println("Agora temos uma lista de nomes ");

        String[] nomes = { "Lucas", "João", "Maria", "Ana" };

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}

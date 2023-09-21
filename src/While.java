public class While {
    public static void main(String[] args) {
        // Inicializa a variável 'v1' com o valor 1.
        int v1 = 1;

        // Imprime uma mensagem indicando o início do programa.
        System.out.println("Neste código, uma variável v1 é inicializada com o valor 1 e, em seguida, um loop while é utilizado para executar um bloco de código enquanto v1 for menor ou igual a 5. A cada iteração do loop, o valor de v1 é impresso no console junto com uma mensagem. Após a saída do loop, uma mensagem de finalização é impressa, mostrando o valor final de v1.");
        System.out.println("Sistema ...");

        // Entra em um loop while que continuará enquanto 'v1' for menor ou igual a 5.
        while (v1 <= 5) {
            // Imprime uma mensagem indicando a execução e o valor atual de 'v1'.
            System.out.println("-> Executando" + " " + "Primeiro valor " + " " + v1);

            // Incrementa 'v1' em 1 a cada iteração.
            v1++;
        }

        // Imprime uma mensagem indicando o final do programa e o valor final de 'v1'.
        System.out.println("Finalizado. O número é " + " " + v1);
    }
}

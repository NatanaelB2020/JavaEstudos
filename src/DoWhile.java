public class DoWhile {
    public static void main(String[] args) {
        int v1 = 1; // Inicializa uma variável inteira v1 com o valor 1

        // Exibe uma mensagem inicial
        System.out.println("programa....");

        // Inicia um loop do-while que executa pelo menos uma vez
        do {
            // Exibe uma mensagem indicando que o código está sendo executado e o valor atual de v1
            System.out.println("-> executando... " + " " + v1);

            // Incrementa o valor de v1
            v1++;

        } while (v1 <= 5); // Continua executando o loop enquanto v1 for menor ou igual a 5

        // Exibe uma mensagem indicando que o programa foi finalizado e o valor atual de v1
        System.out.println("finalizado..."+ " " + v1);
    }
}

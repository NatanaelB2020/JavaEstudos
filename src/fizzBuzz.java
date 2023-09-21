public class fizzBuzz {
    /*
     * Este programa imprime números de 0 a 14 e verifica se são múltiplos de 3 ou 5.
     * Se forem múltiplos de 3, imprime "fizz". Se forem múltiplos de 5, imprime "buzz".
     * O programa continua até que n seja menor que 15.
     */

    public static void main(String[] args) {

        int n = 0; // Inicializa uma variável n com o valor 0

        // Entra em um loop while que continuará até que n seja menor que 15
        while (n < 15) {
            System.out.println(n); // Imprime o valor atual de n
            n++; // Incrementa n em 1

            // Verifica se n é divisível por 3 (ou seja, um múltiplo de 3) usando o operador % (módulo)
            if (n % 3 == 0) {
                System.out.println("fizz"); // Se for, imprime "fizz"
            };

            // Verifica se n é divisível por 5 (ou seja, um múltiplo de 5) usando o operador %
            if (n % 5 == 0) {
                System.out.println("buzz"); // Se for, imprime "buzz"
            };
        }
    }
}

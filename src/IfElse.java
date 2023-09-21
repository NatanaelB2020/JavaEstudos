public class IfElse {
    public static void main(String[] args) {
        int n1 = 10;

        // Verifica se 'n1' é maior que 5
        if (n1 > 5) {
            System.out.println("É maior"); // Se verdadeiro, imprime "É maior"
            System.out.println("Bloco 1"); // Imprime "Bloco 1"
        } else {
            System.out.println("É menor"); // Se falso, imprime "É menor"
            System.out.println("Bloco 2"); // Imprime "Bloco 2"
        }

        System.out.println("O programa continua..."); // Imprime "O programa continua..."

        // Verifica se 'n1' é maior que 20
        if (n1 > 20) {
            System.out.println("É maior"); // Se verdadeiro, imprime "É maior"
            System.out.println("Bloco 3"); // Imprime "Bloco 3"
        } else {
            System.out.println("Não é maior"); // Se falso, imprime "Não é maior"
            System.out.println("Bloco 4"); // Imprime "Bloco 4"
        }
    }
}

public class OperadoresLogicos {

        public static void main(String[] args) {

            // Operadores lógicos: and (&&), or (||), not (!)

            int nine = 9;
            int ten = 10;

            // Verifica se 'ten' é maior que 'nine' E se 'ten' é menor que 8
            System.out.println(ten > nine && ten < 8); // Imprime false

            // Verifica se 'ten' é menor que 'nine' OU se 'ten' é menor que 8
            System.out.println(ten < nine || ten < 8); // Imprime true

            // Verifica se 'ten' é maior que 9
            System.out.println(ten > 9); // Imprime true

            // Aplica a negação lógica: se 'ten' NÃO é maior que 9
            System.out.println(!(ten > 9)); // Imprime false
        }
    }



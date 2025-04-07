public class OperadoresCompostos {

    public static void main(String[] args) {

        int a = 13;

        // Soma 'a' com ele mesmo e atribui o resultado a 'a'.
        a = a + a;
        System.out.println(a); // Imprime 26

        // Adiciona 'a' ao próprio valor de 'a' e atualiza 'a'.
        a += a;
        System.out.println(a); // Imprime 52

        // Subtrai 6 de 'a' e atualiza 'a'.
        a -= 6;
        System.out.println(a); // Imprime 46

        // Multiplica 'a' pelo seu próprio valor e atualiza 'a'.
        a *= a;
        System.out.println(a); // Imprime 2116

        // Divide 'a' por 2 e atualiza 'a'.
        a /= 2;
        System.out.println(a); // Imprime 1058

        // Define 'a' como o resto da divisão de 'a' por 2 (operação módulo).
        a = 13;
        a %= 2;
        System.out.println(a); // Imprime 1 (porque 13 % 2 é 1)
    }
}

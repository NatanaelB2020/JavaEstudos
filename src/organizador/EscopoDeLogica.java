public class EscopoDeLogica {
    public static void main(String[] args) {
        int valor = 10; // Declara e inicializa uma variável inteira chamada valor com o valor 10

        // Exibe o valor da variável valor
        System.out.println(valor);

        if (valor == 10) { // Verifica se o valor da variável valor é igual a 10
            int v2 = 90; // Declara e inicializa uma variável inteira chamada v2 com o valor 90

            // Exibe o valor da variável v2 (disponível apenas dentro deste bloco if)
            System.out.println(v2);

            // Exibe o valor da variável valor (ainda acessível dentro deste bloco)
            System.out.println(valor);
        } else {
            // Se a condição do if não for atendida, exibe o valor da variável valor
            System.out.println(valor);
        }
    }
}

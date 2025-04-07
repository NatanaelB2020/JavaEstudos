public class Switch {
    public static void main(String[] args) {
        int valor = 50;

        // Inicia uma estrutura switch com base no valor da variável 'valor'
        switch (valor) {
            // Caso 'valor' seja igual a 10
            case 10: {
                System.out.println(" é 10"); // Imprime " é 10"
                System.out.println("primeiro"); // Imprime "primeiro"
                break; // Sai do switch
            }
            // Caso 'valor' seja igual a 20
            case 20: {
                System.out.println(" é 20"); // Imprime " é 20"
                System.out.println(" segundo"); // Imprime " segundo"
                break; // Sai do switch
            }
            // Caso 'valor' seja igual a 22
            case 22: {
                System.out.println(" é 22"); // Imprime " é 22"
                System.out.println(" terceiro"); // Imprime " terceiro"
                break; // Sai do switch
            }
            // Caso 'valor' não corresponda a nenhum dos casos anteriores
            default: {
                System.out.println(" não é nenhum dos valores esperados"); // Imprime " não é nenhum dos valores esperados"
            }
        }

        // Imprime "programa continua" após a estrutura switch
        System.out.println(" programa continua");
    }
}

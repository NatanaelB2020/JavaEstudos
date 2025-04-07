public class ConversaoPrimitivo {

    public static void main(String[] args) {

        // Declara e inicializa uma variável de texto (String) com o valor "13"
        String texto = "13";

        // Realiza a conversão de String para int e atribui o resultado à variável 'n1'
        int n1 = Integer.parseInt(texto);
        System.out.println(n1); // Imprime o valor convertido: 13

        // Realiza a conversão de String para byte e atribui o resultado à variável 'n2'
        byte n2 = Byte.parseByte(texto);
        System.out.println(n2); // Imprime o valor convertido: 13

        // Realiza a conversão de String para double e atribui o resultado à variável 'n3'
        double n3 = Double.parseDouble(texto);
        System.out.println(n3); // Imprime o valor convertido: 13.0

        // Realiza a conversão de String para float e atribui o resultado à variável 'n4'
        float n4 = Float.parseFloat(texto);
        System.out.println(n4); // Imprime o valor convertido: 13.0

        // Realiza a conversão de String para long e atribui o resultado à variável 'n5'
        long n5 = Long.parseLong(texto);
        System.out.println(n5); // Imprime o valor convertido: 13

        // Realiza a conversão de String para short e atribui o resultado à variável 'n6'
        short n6 = Short.parseShort(texto);
        System.out.println(n6); // Imprime o valor convertido: 13

        // Converte o valor da variável 'n1' de volta para String e atribui à variável 'texto'
        texto = String.valueOf(n1);
        System.out.println(texto); // Imprime o valor convertido: "13"
    }
}

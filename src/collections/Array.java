public class Array {
    public static void main(String[] args) {
        // Declaração e inicialização de uma variável inteira chamada 'vl' com o valor 10
        int vl = 10;

        // Imprime o valor da variável 'vl' no console
        System.out.println(vl);

        // Declaração e criação de um array de inteiros chamado 'colecao' com tamanho 5
        int[] colecao = new int[5];

        // Atribuição de valores aos elementos do array 'colecao'
        colecao[0] = 1;  // Atribui o valor 1 ao primeiro elemento do array
        colecao[1] = 2;  // Atribui o valor 2 ao segundo elemento do array
        colecao[2] = 3;  // Atribui o valor 3 ao terceiro elemento do array
        colecao[3] = 4;  // Atribui o valor 4 ao quarto elemento do array
        colecao[4] = 5;  // Atribui o valor 5 ao quinto elemento do array

        // Imprime os valores dos primeiros dois elementos do array 'colecao' no console
        System.out.println(colecao[0]); // Imprime o valor 1
        System.out.println(colecao[1]); // Imprime o valor 2
    }
}

public class MinhaClasse {
    public static void main(String[] args) {
        // Declara e inicializa duas variáveis de texto (String) com nomes
        String primeiroNome = "Natanael";
        String segundoNome = "Amaral";

        // Chama o método 'nomeCompleto' e armazena o resultado na variável 'nomeCompleto'
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Imprime o nome completo no console
        System.out.println(nomeCompleto);
    }

    // Define um método 'nomeCompleto' que recebe dois nomes como parâmetros e retorna o nome completo
    public static String nomeCompleto (String primeiroNome, String segundoNome ){
        // Concatena os dois nomes com um espaço e uma mensagem e retorna o resultado
        return "Resultado do método" + " " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

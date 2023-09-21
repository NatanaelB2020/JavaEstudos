package desafios.cepInvalidException;

// Importa a exceção personalizada CepInvalideException, presumindo que ela tenha sido definida em algum lugar do código.
// Certifique-se de que a classe CepInvalideException seja importada ou definida corretamente.

import desafios.cepInvalidException.CepInvalideException;

public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            // Tenta formatar o CEP "23765064".
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalideException e) {
            // Captura a exceção CepInvalideException caso seja lançada e imprime uma mensagem de erro.
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    // Método estático para formatar um CEP.
    static String formatarCep(String cep) throws CepInvalideException {
        // Verifica se o CEP não possui exatamente 8 caracteres. Se não tiver, lança uma exceção CepInvalideException.
        if (cep.length() != 8) {
            throw new CepInvalideException();
        }

        // Retorna o CEP formatado no formato "23.765-064".
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}

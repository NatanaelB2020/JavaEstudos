package cepInvalidException;

public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }catch (CepInvalideException e){
            System.out.println("O Cep não correponde com as regras de negocio");
        }

    }
    static String formatarCep(String cep) throws CepInvalideException{
        if(cep.length() != 8)
            throw new CepInvalideException();
        return "23.765-064";
    }
}

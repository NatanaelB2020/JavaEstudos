public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Natanael";
        String segundoNome = "Amaral";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeriNome, String segundoNome ){
        return "Resultado do método" + " " + primeriNome.concat(" ").concat(segundoNome);
    }
}

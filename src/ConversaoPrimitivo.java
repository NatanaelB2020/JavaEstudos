
public class ConversaoPrimitivo {

    public static void main(String[] args) {

        String texto = "13";

        int n1 = Integer.parseInt(texto);
        System.out.println(n1);

        byte n2 = Byte.parseByte(texto);
        System.out.println(n2);

        double n3 = Double.parseDouble(texto);
        System.out.println(n3);

        float n4 = Float.parseFloat(texto);
        System.out.println(n4);

        long n5 = Long.parseLong(texto);
        System.out.println(n5);

        short n6 = Short.parseShort(texto);
        System.out.println(n6);

        texto = String.valueOf(n1);
        System.out.println(texto);
    }
}

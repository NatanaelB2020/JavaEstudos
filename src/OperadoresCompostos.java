public class OperadoresCompostos {

    public static void main(String[] args) {

        int a = 13;

        a = a +a ;
        System.out.println(a);

        a += a;
        System.out.println(a);

        a -= 6;
        System.out.println(a);

        a *= a;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a = 13;
        a %= 2;
        System.out.println(a);
    }
}
